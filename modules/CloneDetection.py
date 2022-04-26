import math,traceback,sys
from os import pardir
import multiprocessing

def oneDetectExecution(round, resultArr, cloneDetectionController):
    bagPool = cloneDetectionController.addBag(round)
    print('Detection round ' + str(round) + ' started. Pool size: ' + str(len(bagPool)) )
    
    partialIndex      = cloneDetectionController.partialIndexCreation(bagPool)
    clonePairsByIndex = cloneDetectionController.cloneDetection(bagPool, partialIndex, len(bagPool))
    clonePairsByBag   = []
    for indexPair in clonePairsByIndex:
        clonePairsByBag.append( (bagPool[indexPair[0]], bagPool[indexPair[1]] )  )
    resultArr[round+1] = clonePairsByBag
    print('Round ' + str(round) + ' ended')


class CloneDetectionContraller():
    def __init__(self, taskObj, gtpObj, bagCollectionArr):
        self.taskObj            = taskObj
        self.gtpObj             = gtpObj
        self.detectionThreshold = self.taskObj.configObj['detectionThreshold']
        self.bagCollectionArr   = bagCollectionArr
        self.MAX_ROUND          = taskObj.configObj['maxRound']
        if self.MAX_ROUND == 0:
            self.MAX_ROUND = self.__getMaxDepth()

    def run(self):
        self.fileCloneMap = {}
        clonePairs        = []

        ##### textcase
        # addedBags = []
        # testCase = [10176,10454]
        # for i in testCase:
        #     addedBags.append(self.bagCollectionArr[i][0])
        #####
        
        resultArr = multiprocessing.Manager().list()
        # resultArr = list()
        for i in range(-1,self.MAX_ROUND):
            resultArr.append(0)

        poolSize = int(self.taskObj.configObj['threadNum_detection'])
        if poolSize > int(multiprocessing.cpu_count()):
            poolSize = int(multiprocessing.cpu_count())
        pool = multiprocessing.Pool(poolSize)


        roundOrderArr = self.getRoundSizeArr()
        print(roundOrderArr)
        for i in roundOrderArr:
            pool.apply_async(oneDetectExecution, args=( i, resultArr, self, ))
        pool.close()
        pool.join()

        # oneDetectExecution(1, resultArr, self)

        print("last round ended.")

        print("Overlap reduction executing.")

        resNum = 0
        resultArr = list(resultArr)
        try:
            for i in resultArr:
                resNum += len(i)
        except Exception:
            pass
        print('clone num before overlapReduction:' + str(resNum))
        self.overlapReduction(clonePairs, resultArr)
        return clonePairs

    def getRoundSizeArr(self):
        tmp = []
        res = []

        for round in range(-1, self.MAX_ROUND):
            roundSize = 0
            for i in self.bagCollectionArr:
                if i == None or type(i) == int:
                    continue
                for j in i:
                    try:
                        if j.granularity == round and j.symbolNum >= self.taskObj.configObj['minTokens']:
                            roundSize += 1
                    except Exception:
                        pass
            tmp.append((round, roundSize))

        def takeSize(node):
            return node[1]
      
        tmp.sort(key=takeSize, reverse=True)  
        
        for i in tmp:
            res.append(i[0])
        return res

    def __getMaxDepth(self):
        maxDepth = -1
        if self.bagCollectionArr == None:
            return 0
        for file in self.bagCollectionArr:
            if file == None:
                continue
            for bag in file:
                if bag.granularity > maxDepth:
                    maxDepth = bag.granularity
        return maxDepth

    def overlapReduction(self, clonePairs, resultArr):
        for round in range(0, self.MAX_ROUND + 1):
            for pair in resultArr[round]:
                if not self.ifOverlapByFileMap(pair[0], pair[1]):
                    self.addFileCloneMapItem(pair[0], pair[1])
                    clonePairs.append( [[ pair[0].fileId, pair[0].bagId],[pair[1].fileId, pair[1].bagId] ] )

    def addBag(self, granularity):
        res = []
        for i in self.bagCollectionArr:
            if i == None or type(i) == int:
                continue
            for j in i:
                if j.granularity == granularity and j.symbolNum >= self.taskObj.configObj['minTokens']:
                    res.append(j)
        return res

    def addFileCloneMapItem(self, bagA, bagB):
        if bagA.bagId > bagB.bagId:
            idSmall  = bagB
            idBig    = bagA
        else:
            idSmall = bagA
            idBig   = bagB

        if not str(idSmall.fileId) in self.fileCloneMap:
            self.fileCloneMap[str(idSmall.fileId)] = {}
        if not (str(idBig.fileId) in self.fileCloneMap[str(idSmall.fileId)]):
            self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)] = [] 
        self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)].append([[idSmall.fileId, idSmall.bagId],[idBig.fileId, idBig.bagId]])

    def ifOverlapByFileMap(self, bagA, bagB):
        if bagA.fileId > bagB.fileId:
            idSmall  = bagB
            idBig    = bagA
        else:
            idSmall = bagA
            idBig   = bagB

        if str(idSmall.fileId) in self.fileCloneMap:
            if str(idBig.fileId) in self.fileCloneMap[str(idSmall.fileId)]:
                pairs = self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)]
                for pair in pairs:
                    if self.ifPairOverlap([[idSmall.fileId, idSmall.bagId],[idBig.fileId, idBig.bagId]] , pair):
                        return True
        return False
        
    def markBagsUnavaliable(self, bag):
        bagTreeNode = self.bagTreeArr[bag.fileId].nodeArr[bag.bagNodeIndex]
        bagTreeNode.treeTraverse(bagTreeNode.setUnavaliable, bagTreeNode)
        pass

    def partialIndexCreation(self, bags):
        partialIndex = {}

        for i in range(len(bags)):
            if hasattr(bags[i], 'sortedBag'):
                sortedBag = bags[i].sortedBag
            else:
                sortedBag = self.bagSort(bags[i])
                setattr(bags[i], 'sortedBag', sortedBag)
            length = len(sortedBag)
            numToBeIndexed = length - math.ceil(length * self.detectionThreshold) + 1

            for j in range(0, numToBeIndexed): # 
                indexedToken = sortedBag[j]
                if not indexedToken in partialIndex:
                    partialIndex[indexedToken] = {}
                if not i in partialIndex[indexedToken]:
                    partialIndex[indexedToken][i] = []
                partialIndex[indexedToken][i].append(j)

                    
        return partialIndex

    def bagSort(self, bag):
        res = []
        tokenList = list(bag.tokens.keys())

        frequencyList = []
        for i in tokenList:
            frequencyList.append(self.gtpObj.searchFrequencyByToken(i))

        # sort the frequencyList and move the items in tokenList simutaneously
        i = 0
        
        while i <= len(frequencyList) - 1:
            j = 0
            rightTmp  = float('inf')
            markIndex = j

            while j <= len(frequencyList) - 1:
                if frequencyList[j] < rightTmp:
                    rightTmp = frequencyList[j]
                    markIndex = j
                j += 1


            frequencyList[markIndex] = float('inf')

            tokenIdtoAdd   = self.gtpObj.searchIdByToken(tokenList[markIndex])
            frequencyInBag = bag.tokens[tokenList[markIndex]]
            for times in range(frequencyInBag):
                res.append(tokenIdtoAdd)
            i += 1

        return res
            
    def cloneDetection(self, bagPool, partialIndex, queryBlockNum):
        cloneClasses = []

        for queryBlockIndex in range(queryBlockNum):
            # if bagPool[queryBlockIndex].fileId == 360 or bagPool[queryBlockIndex].fileId == 279:
            #     print('target')
            queryBlock = bagPool[queryBlockIndex].sortedBag
            qBlockSize = len(queryBlock)
            subBlockSize =  qBlockSize - math.ceil(qBlockSize * self.detectionThreshold) + 1

            candidateMap = []
            for i in range(len(bagPool)):
                candidateMap.append([0,-1])

            # 问题： 会不会出现对particalindex的重复计算
            # 追记： maybe 问题就在这里了
            for queryTokenIndex in range(0,subBlockSize):
                floorSize = math.ceil( self.detectionThreshold * qBlockSize  )
                ct = 0

                partialIndexItem = partialIndex[queryBlock[queryTokenIndex]]
                for cBagIndex in partialIndexItem:

                    if candidateMap[cBagIndex] == None:
                        continue
                    
                    # if bagPool[cBagIndex].fileId == 360 or bagPool[cBagIndex].fileId == 279:
                    #         print('target')
                    cBag = bagPool[cBagIndex].sortedBag
                    cBagSize = len(cBag)
                    if cBagSize < floorSize: # bags that do not have enough tokens
                        continue
                    elif cBagIndex == queryBlockIndex: # query bag itself
                        continue
                    elif self.ifBagOverlap(bagPool[cBagIndex], bagPool[queryBlockIndex]): # query bag's children
                        continue
                    # #######此处使用continue跳出 错过了提前结束比对的机会 吗

                    cTokenPositionToUpdate = None
                    for cTokenPosition in partialIndexItem[cBagIndex]:
                        if cTokenPosition > candidateMap[cBagIndex][1]:
                            cTokenPositionToUpdate = cTokenPosition
                            break
                    if cTokenPositionToUpdate == None:
                        continue
                    ct = math.ceil( max(qBlockSize, cBagSize) * self.detectionThreshold)
                    uBound = 1 + min(qBlockSize - queryTokenIndex, cBagSize - cTokenPositionToUpdate)
                    if candidateMap[cBagIndex][0] + uBound >= ct:
                        candidateMap[cBagIndex][0] += 1
                        candidateMap[cBagIndex][1] = cTokenPositionToUpdate
                    else:
                        candidateMap[cBagIndex] = None


            clones = self.verifyCandidates(queryBlock, queryTokenIndex, candidateMap, bagPool, self.gtpObj, queryBlockIndex)
            for i in clones:
                cloneClasses.append(i)


        return list(set([tuple(sorted(t)) for t in cloneClasses]))


    # def verifyCandidates(self, blockB, posB, candidateMap, bagPool, gtpObj, queryBlockIndex, clonePairsByIndex):
    def verifyCandidates(self, blockB, posB, candidateMap, bagPool, gtpObj, queryBlockIndex):
        clones = []
        for i in range(len(candidateMap)):
            if candidateMap[i] == None:
                continue
            elif candidateMap[i][0] == 0:
                continue
            
            ct = math.ceil( max(len(blockB), int(bagPool[i].tokenNum)) * self.detectionThreshold)
            tokenPosC = candidateMap[i][1] + 1
            tokenPosB = posB + 1

            blockC = bagPool[i].sortedBag
            lenB   = len(blockB)
            lenC   = len(blockC)

            while tokenPosB < lenB and tokenPosC < lenC:
                if min(lenB-tokenPosB, lenC-tokenPosC) + candidateMap[i][0]>= ct:
                    if blockB[tokenPosB] == blockC[tokenPosC]:
                        candidateMap[i][0] += 1
                        tokenPosB += 1
                        tokenPosC += 1
                    else:
                        if gtpObj.searchFrequencyById(blockB[tokenPosB]) < gtpObj.searchFrequencyById(blockC[tokenPosC]):
                            tokenPosB += 1
                        else:
                            tokenPosC += 1
                else:
                    break

            if candidateMap[i][0] >= ct:
                clones.append([queryBlockIndex,i])

        return clones

    def ifPairOverlap(self, queryPair, cPair):
        try:
            if cPair[0][0] < cPair[1][0]:
                if self.ifBagOverlap(self.bagCollectionArr[queryPair[0][0]][queryPair[0][1]] , self.bagCollectionArr[cPair[0][0]][cPair[0][1]]) and   self.ifBagOverlap(self.bagCollectionArr[queryPair[1][0]][queryPair[1][1]] , self.bagCollectionArr[cPair[1][0]][cPair[1][1]]):
                    return True
            # elif cPair[0][0] > cPair[1][0]:
            #     if self.ifBagOverlap(self.bagCollectionArr[queryPair[0][0]][queryPair[0][1]] , self.bagCollectionArr[cPair[1][0]][cPair[1][1]]) and   self.ifBagOverlap(self.bagCollectionArr[queryPair[1][0]][queryPair[1][1]] , self.bagCollectionArr[cPair[0][0]][cPair[0][1]]):
            #         return True
            else: #equal
                if (self.ifBagOverlap(self.bagCollectionArr[queryPair[0][0]][queryPair[0][1]] , self.bagCollectionArr[cPair[0][0]][cPair[0][1]]) and   self.ifBagOverlap(self.bagCollectionArr[queryPair[1][0]][queryPair[1][1]] , self.bagCollectionArr[cPair[1][0]][cPair[1][1]])) or (self.ifBagOverlap(self.bagCollectionArr[queryPair[0][0]][queryPair[0][1]] , self.bagCollectionArr[cPair[1][0]][cPair[1][1]]) and   self.ifBagOverlap(self.bagCollectionArr[queryPair[1][0]][queryPair[1][1]] , self.bagCollectionArr[cPair[0][0]][cPair[0][1]])):
                    return True
            return False
        except Exception:
            pass

    def ifBagOverlap(self, bagA, bagB):
        if int(bagA.fileId) != int(bagB.fileId):
            return False
        else: # two bags from one file
            # if int(bagA.startLine) > int(bagB.endLine) or int(bagB.startLine) > int(bagA.endLine):
            #     return False
            # else:
            #     return True
            if int(bagA.startLine) >= int(bagB.startLine) and int(bagA.endLine) <= int(bagB.endLine):
                return True
            elif int(bagB.startLine) >= int(bagA.startLine) and int(bagB.endLine) <= int(bagA.endLine):
                return True
            else:
                return False