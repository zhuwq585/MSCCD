import math,traceback,sys
from os import pardir
class CloneDetectionContraller():
    def __init__(self, taskObj, gtpObj, bagCollectionArr):
        self.taskObj = taskObj
        self.gtpObj = gtpObj
        self.detectionThreshold = self.taskObj.configObj['detectionThreshold']
        self.bagCollectionArr = bagCollectionArr

    def run(self):
        self.fileCloneMap = {}
        bagPool = []
        clonePairs = []
        addedBags = []

        ##### textcase
        # testCase = [10176,10454]
        # for i in testCase:
        #     addedBags.append(self.bagCollectionArr[i][0])
        #####
        

        maxDepth = 0
        currentCloneSum = 0
        for i in self.bagCollectionArr:
            if i == None:
                continue
            if i[0].symbolNum >= self.taskObj.configObj['minTokens'] and i[0].lineSize >= self.taskObj.configObj['minLines']:
            # if i[0].lineSize >= self.taskObj.configObj['minLines']:
                addedBags.append(i[0])
                for j in i:
                    if j.granularity > maxDepth:
                        maxDepth = j.granularity
        bagPool = self.__oneDetectExecution(bagPool, addedBags, clonePairs)
        print(str(len(clonePairs)-currentCloneSum) + ' clones found in last round.')
        currentCloneSum = len(clonePairs)
        maxDepth = maxDepth if maxDepth <= 50 else 50

        for i in range(0, maxDepth):
            addedBags = []
            addedBags = self.__addBag(i)
            bagPool = self.__oneDetectExecution(bagPool, addedBags, clonePairs)
            print(str(len(clonePairs)-currentCloneSum) + ' clones found in last round.')
            currentCloneSum = len(clonePairs)
        
        print("last round ended.")

        return clonePairs

    def __addBag(self, granularity):
        res = []
        for i in self.bagCollectionArr:
            if i == None:
                continue
            for j in i:
                if j.granularity == granularity and j.symbolNum >= self.taskObj.configObj['minTokens'] and j.lineSize >= self.taskObj.configObj['minLines']:
                # if j.granularity == granularity and j.lineSize >= self.taskObj.configObj['minLines']:
                    res.append(j)
        return res

    def __oneDetectExecution(self, bagPool, addedBags, clonePairs):
        # for i in bagPool:
        #     print(str(i.granularity))
        bagPool = addedBags + bagPool
        print('Detection round started. Pool size: ' + str(len(bagPool)) + ' Added bag:' + str(len(addedBags)))
        partialIndex = self.__partialIndexCreation(bagPool)
        clonePairsByIndex = self.__cloneDetection(bagPool, partialIndex, len(addedBags))


        # pairs
        bagsToBeDelete = set()
        for clonePair in clonePairsByIndex:
            bagA = bagPool[clonePair[0]]
            bagB = bagPool[clonePair[1]]

            ######## with overlap reduction ####
            if not self.__ifOverlapByFileMap(bagA, bagB):
                clonePairs.append([[bagA.fileId, bagA.bagId],[bagB.fileId, bagB.bagId]])
                self.__addFileCloneMapItem(bagA, bagB)
            ####################################

            ######## without overlap reduction #
            # clonePairs.append([[bagA.fileId, bagA.bagId],[bagB.fileId, bagB.bagId]])
            # self.__addFileCloneMapItem(bagA, bagB)
            ####################################
            
            bagsToBeDelete.add(clonePair[0])
            bagsToBeDelete.add(clonePair[1])

        for bagIndex in bagsToBeDelete:
            bagPool[bagIndex] = None
        while True:
            try:
                bagPool.remove(None)
            except ValueError:
                break

        #bagPool.clear()
        return bagPool

    def __addFileCloneMapItem(self, bagA, bagB):
        if bagA.bagId > bagB.bagId:
            idSmall  = bagB
            idBig = bagA
        else:
            idSmall = bagA
            idBig = bagB

        if not str(idSmall.fileId) in self.fileCloneMap:
            self.fileCloneMap[str(idSmall.fileId)] = {}
        if not (str(idBig.fileId) in self.fileCloneMap[str(idSmall.fileId)]):
            self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)] = [] 
        self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)].append([[idSmall.fileId, idSmall.bagId],[idBig.fileId, idBig.bagId]])

    def __ifOverlapByFileMap(self, bagA, bagB):
        if bagA.fileId > bagB.fileId:
            idSmall  = bagB
            idBig = bagA
        else:
            idSmall = bagA
            idBig = bagB

        if str(idSmall.fileId) in self.fileCloneMap:
            if str(idBig.fileId) in self.fileCloneMap[str(idSmall.fileId)]:
                pairs = self.fileCloneMap[str(idSmall.fileId)][str(idBig.fileId)]
                for pair in pairs:
                    if self.ifPairOverlap([[idSmall.fileId, idSmall.bagId],[idBig.fileId, idBig.bagId]] , pair):
                        return True
        return False
        
    def __markBagsUnavaliable(self, bag):
        bagTreeNode = self.bagTreeArr[bag.fileId].nodeArr[bag.bagNodeIndex]
        bagTreeNode.treeTraverse(bagTreeNode.setUnavaliable, bagTreeNode)
        pass

    def __partialIndexCreation(self, bags):
        partialIndex = {}

        for i in range(len(bags)):
            if hasattr(bags[i], 'sortedBag'):
                sortedBag = bags[i].sortedBag
            else:
                sortedBag = self.__bagSort(bags[i])
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

                #partialIndex[indexedToken].append([i, j]) # partial index[i,j] i: bag index j: token position
                    
        return partialIndex

    def __bagSort(self, bag):
        res = []
        tokenList = list(bag.tokens.keys())

        frequencyList = []
        for i in tokenList:
            frequencyList.append(self.gtpObj.searchFrequencyByToken(i))

        # sort the frequencyList and move the items in tokenList simutaneously
        i = 0
        
        while i <= len(frequencyList) - 1:
            j = 0
            rightTmp = float('inf')
            markIndex = j

            while j <= len(frequencyList) - 1:
                if frequencyList[j] < rightTmp:
                    rightTmp = frequencyList[j]
                    markIndex = j
                j += 1


            frequencyList[markIndex] = float('inf')

            tokenIdtoAdd = self.gtpObj.searchIdByToken(tokenList[markIndex])
            frequencyInBag = bag.tokens[tokenList[markIndex]]
            for times in range(frequencyInBag):
                res.append(tokenIdtoAdd)
            i += 1

        return res
            
    def __cloneDetection(self, bagPool, partialIndex, queryBlockNum):
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
                try:
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
                except KeyError:
                    print('---------error:---------')
                    error_type, error_value, error_trace = sys.exc_info()
                    print(str(error_type))
                    print(str(error_value))
                    for info in traceback.extract_tb(error_trace):  
                        print(str(info))
                    print('------------------')
                    continue

            clones = self.__verifyCandidates(queryBlock, queryTokenIndex, candidateMap, bagPool, self.gtpObj, queryBlockIndex)
            for i in clones:
                cloneClasses.append(i)


        return list(set([tuple(sorted(t)) for t in cloneClasses]))


    # def __verifyCandidates(self, blockB, posB, candidateMap, bagPool, gtpObj, queryBlockIndex, clonePairsByIndex):
    def __verifyCandidates(self, blockB, posB, candidateMap, bagPool, gtpObj, queryBlockIndex):
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
            lenB = len(blockB)
            lenC = len(blockC)

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

    def ifPairOverlap(self, pairA, pairB): # we don`t know which bag in pairB is a fileId smaller one.
        if pairB[0][0] < pairB[1][0]:
            if self.ifBagOverlap(self.bagCollectionArr[pairA[0][0]][pairA[0][1]] , self.bagCollectionArr[pairB[0][0]][pairB[0][1]]) and   self.ifBagOverlap(self.bagCollectionArr[pairA[1][0]][pairA[1][1]] , self.bagCollectionArr[pairB[1][0]][pairB[1][1]]):
                return True
        elif pairB[0][0] > pairB[1][0]:
            if self.ifBagOverlap(self.bagCollectionArr[pairA[0][0]][pairA[0][1]] , self.bagCollectionArr[pairB[1][0]][pairB[1][1]]) and   self.ifBagOverlap(self.bagCollectionArr[pairA[1][0]][pairA[1][1]] , self.bagCollectionArr[pairB[0][0]][pairB[0][1]]):
                return True
        else: #equal
            if (self.ifBagOverlap(self.bagCollectionArr[pairA[0][0]][pairA[0][1]] , self.bagCollectionArr[pairB[0][0]][pairB[0][1]]) and   self.ifBagOverlap(self.bagCollectionArr[pairA[1][0]][pairA[1][1]] , self.bagCollectionArr[pairB[1][0]][pairB[1][1]])) or (self.ifBagOverlap(self.bagCollectionArr[pairA[0][0]][pairA[0][1]] , self.bagCollectionArr[pairB[1][0]][pairB[1][1]]) and   self.ifBagOverlap(self.bagCollectionArr[pairA[1][0]][pairA[1][1]] , self.bagCollectionArr[pairB[0][0]][pairB[0][1]])):
                return True
        return False

    def ifBagOverlap(self, bagA, bagB):
        if int(bagA.fileId) != int(bagB.fileId):
            return False
        else: # two bags from one file
            if int(bagA.startLine) > int(bagB.endLine) or int(bagB.startLine) > int(bagA.endLine):
                return False
            else:
                return True