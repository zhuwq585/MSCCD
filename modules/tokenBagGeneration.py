# from Project.modules.TreeStructure import Tree
import importlib
import multiprocessing
from queue import Empty
import types
# from antlr4 import *
import ujson,sys, os
import re
import time
import pickle
import traceback
import globalTokenFrequency
# first, write the program of token bag generation for one input file, and then scale it by multiprocessing.

sys.setrecursionlimit(10000)

class TokenBagGenerationController():
    def __init__(self, taskObj):
        # sys.path.append(os.path.dirname(__file__)[:-7]+taskObj.configObj['parser'])
        # sys.path.append(sys.path[0][0:-16] + '/' + taskObj.configObj['parser'])
        # sys.path.append(sys.path[0] + '/' + taskObj.configObj['parser'])
        # self.lexerModule = getattr(importlib.import_module(taskObj.configObj['grammarName'] + 'Lexer'), taskObj.configObj['grammarName'] + 'Lexer')
        # self.parserModule = getattr(importlib.import_module(taskObj.configObj['grammarName'] + 'Parser'), taskObj.configObj['grammarName'] + 'Parser')

        self.taskObj = taskObj
        self.minTokensForBagGeneration = int(taskObj.configObj['minTokensForBagGeneration'])
        # self.minLinesForBagGeneration = int(taskObj.configObj['minLinesForBagGeneration'])

    def nodeNumCalcu(self, bagQueue, taskNum):
        arr1 = []
        arr2 = []
        arr3 = []
        num = 0
        while True:
            if num == taskNum:
                break
            try:
                arr = bagQueue.get_nowait()
                arr1.append(arr[0])
                arr2.append(arr[1])
                arr3.append(arr[2])
            except Empty:
                time.sleep(0.1)

        return [sum(arr1), sum(arr2), sum(arr3)]

    def gtpCalcu(self, gtpQueue, taskNum, gtpObj, bagQueue):
        num = 0
        arr1 = []
        arr2 = []
        arr3 = []
        while True:
            if num == taskNum:
                break
            try:
                tokenArr = gtpQueue.get_nowait()
                bagNumArr = bagQueue.get_nowait()
                arr1.append(bagNumArr[0])
                arr2.append(bagNumArr[1])
                arr3.append(bagNumArr[2])
                for i in tokenArr:
                    gtpObj.addItem(i)
                num += 1
            except Empty:
                time.sleep(0.1)
        print(str(sum(arr1)))
        print(str(sum(arr2)))
        print(str(sum(arr3)))
        return gtpObj
    
    # def __gtpCalculation(self, tokenArr, mutex, tokensDict, idsArray):
    #     mutex.acquire()
    #     addItemOutside = globalTokenFrequency.GlobalTokenfrequency().addItemOutside
    #     for token in tokenArr:
    #         addItemOutside(token, tokensDict, idsArray)
    #     mutex.release()
    
    # def run(self, fileId, bagCollectionArr, timeArr, errMsgArr, gtpQueue):
    def run(self, fileId, bagCollectionArr, errMsgArr, gtpQueue, bagNumQueue):
        try:
            # startTime = time.time()

            # input: a file from import project
            # output: bags from this file ( class:tokenBagCollection)
            # activity: save the tokens from level 0 to the GTP
            # this function will be runned concurrently
            # step: AST generation -> index generation(leafNodeArr allTreeNodeArr) ->token num generation and set token type -> analysis tree generation-> bag generation
            
            filePath = self.taskObj.inputObj[fileId]
            # print("Token bag generation for file(" + filePath + ') is being excuted in process ' + str(os.getpid()))

            # antlr's part
            inputStream = FileStream(filePath, encoding='UTF_8', errors='ignore')
            lexer = self.lexerModule(inputStream)
            stream = CommonTokenStream(lexer)
            parser = self.parserModule(stream)
            astTree = getattr(parser, self.taskObj.configObj['startSymble'])()
            
            # middleTime = time.time()

            # index generation
            leafNodeArr = [None] * len(stream.tokens) # index to leaf nodes in the tree
            allTreeNodeArr = [] # every tree node ('treeNodeIndex')
            self.indexGeneration(astTree, leafNodeArr, allTreeNodeArr)

            # set tokenType (whether keywords)
            self.__setTokenType(leafNodeArr)

            # GTP calculation
            allToken = []
            for i in range(len(leafNodeArr)):
                if leafNodeArr[i] == None:
                    continue
                if leafNodeArr[i].tokenType != 0:
                    tokenText = leafNodeArr[i].symbol.text
                    tokenArr = self.__splitStringLiterial(tokenText)
                    setattr (leafNodeArr[i].symbol, 'tokenArr', tokenArr)
                    allToken = allToken + leafNodeArr[i].symbol.tokenArr

            # calculate each sub tree's token number & 
            # set the type of tokens that each tree contains
            for i in leafNodeArr:
                if i != None:
                    self.__setTypeAndNumber(i)

            # analysis tree generation
            aTree  = self.__analysisTreeGeneration(astTree, fileId, leafNodeArr)

            # tokenBag query
            bagNodeArray = aTree.tokenBagQuery()

            # tokenBag generation
            bagCollection = []
            for bagNode in bagNodeArray:
                bag = self.createBag(bagNode, fileId, allTreeNodeArr, leafNodeArr)
                if bag != None:
                    bagCollection.append( bag )

            gtpQueue.put_nowait(allToken)
            bagNumQueue.put_nowait([len(allTreeNodeArr)-len(leafNodeArr), aTree.nonLeafNodeCal(), len(bagNodeArray)])
            # endtime = time.time()
            bagCollectionArr[fileId] = bagCollection
            # timeArr[fileId] = [round(middleTime - startTime , 2)   , round( endtime - middleTime , 2)   ]

            # print("The process " + str(os.getpid()) + ' is closed')

        except:
            print('err in file:' + filePath + '\n')
            error_type, error_value, error_trace = sys.exc_info()
            errContent = '---------error:---------\n'
            errContent += 'file:' + filePath + '\n'
            errContent += str(error_type) + '\n'
            errContent += str(error_value) + '\n'
            for info in traceback.extract_tb(error_trace):  
                errContent += str(info) + '\n'
            errContent += '------------------\n'
            errMsgArr.append(errContent)
            print(errContent)
            bagCollectionArr[fileId] = None    
            gtpQueue.put_nowait([])      

    def bagGeneration(self):
        fileNum = len(self.taskObj.inputObj)

        gtpObj = globalTokenFrequency.GlobalTokenfrequency()

        bagCollectionArr = multiprocessing.Manager().list()
        for i in range(fileNum):
            bagCollectionArr.append(None)

        # timeArr = multiprocessing.Manager().list()
        # for i in range(fileNum):
        #     timeArr.append(None)
    
        errMsgArr = multiprocessing.Manager().list()

        m = multiprocessing.Manager()
        gtpQueue = m.Queue()

        bagNumQueue = m.Queue()
        # using a process pool to generate token bags 
        
        pool = multiprocessing.Pool(multiprocessing.cpu_count()) # multiprocessing.cpu_count() - 1
        #pool = multiprocessing.Pool(2)

        for i in range(fileNum):
            # pool.apply_async(self.run, args=(i, bagCollectionArr, timeArr, errMsgArr, gtpQueue,))
            pool.apply_async(self.run, args=(i, bagCollectionArr, errMsgArr, gtpQueue, bagNumQueue, ))
        pool.close()
        pool.join()
        
        # test code
        # for i in range(fileNum):
            # self.run(i, bagCollectionArr, errMsgArr, gtpQueue)


        self.gtpCalcu(gtpQueue, fileNum, gtpObj,bagNumQueue)

        for err in errMsgArr:
            sys.stderr.write(err)
            
        return (bagCollectionArr, gtpObj)
      # return (bagCollectionArr, gtpObj, timeArr)
    
    def __splitStringLiterial(self, string):
        resArr = re.split(r'\W+', string)
        if resArr[0] == '':
            del resArr[0]
        if resArr[-1] == '':
            del resArr[-1]
        return resArr

    def __analysisTreeGeneration(self, astTree, fileId, leafNodeArr):
        analysisTree = AnalysisTree(astTree, fileId).setDepth(0)
        
        nodeArr = analysisTree.nodeArr
        nodeNum = 0

        stackA = [] # stack for astTree
        stackB = [] # stack for analysisTree
        stackB_fordepth = [0]
        stackA.append(astTree)
        stackB.append(analysisTree)

        # setattr(analysisTree, 'statementThreshold', self.minTokensForBagGeneration)

        while len(stackA) != 0:
            currentA = stackA[-1] # cursor for astTree
            currentB = stackB[-1] # cursor for analysisTree
            currentDepth = stackB_fordepth[-1]
            
            currentB.nodeIndex = nodeNum
            nodeArr.append(currentB)
            nodeNum += 1

            # merge the nodes those who has the same number of tokens
            mergeTarget = currentA
            try:
                while mergeTarget.tokenNum == mergeTarget.children[0].tokenNum:
                    mergeTarget = mergeTarget.children[0]
            except AttributeError: # 'TerminalNodeImpl' object does not have attribute children
                pass
            
            stackA.pop()
            stackB.pop()
            stackB_fordepth.pop()

            if not hasattr(mergeTarget, 'tokenNum'):
                pass
            # elif mergeTarget.tokenNum < self.statementThreshold:
            #     pass
            elif self.__tokenSizeValidation(mergeTarget, leafNodeArr): # invalid returns true
                pass
            elif self.__lineSizeValidation(mergeTarget): # less than 6 returns true
                pass  
            elif not hasattr(mergeTarget, 'children'):
                pass
            else:
                i = len(mergeTarget.children) - 1
                while i>= 0:
                    newAnalysisTreeNode = AnalysisTree(mergeTarget.children[i], fileId).setDepth(currentDepth + 1)
                    currentB.children.insert(0,newAnalysisTreeNode)
                    newAnalysisTreeNode.parent = currentB
                    stackA.append(mergeTarget.children[i])
                    stackB.append(newAnalysisTreeNode)
                    stackB_fordepth.append(currentDepth + 1)
                    i = i - 1
        return analysisTree

    def __setSymbolNum(self, treeNode, leafNodeArr):
        try:
            symbolNum = 0
            left = treeNode.start.tokenIndex
            right = treeNode.stop.tokenIndex + 1
            for node in leafNodeArr[left: right]:
                if node != None:
                    symbolNum += 1
            setattr(treeNode, 'symbolNum', symbolNum)
        except AttributeError:
            setattr(treeNode, 'symbolNum', 1)

    def __tokenSizeValidation(self, targetNode, leafNodeArr):
        # if not hasattr(targetNode, 'symbolNum'):
        #     self.__setSymbolNum(targetNode, leafNodeArr)
            
        return  targetNode.tokenNum < self.minTokensForBagGeneration

    def __lineSizeValidation(self, targetNode): # return true if unvalid
        try:
            if int(targetNode.stop.line) - int(targetNode.start.line) + 1 < self.minLinesForBagGeneration: 
                return True
            return False
        except AttributeError:
            return True
    def treeTraverse(self, function, startNode, variableArr):
        stack = []
        stack.append(startNode)
        while len(stack) > 0:
            current = stack[-1]
            function(current, variableArr)
            stack.pop()
            if current == None:
                print('sad')
            if hasattr(current, 'children'): # 'TerminalNodeImpl' object has no attribute 'children'
                if current.children != None:
                    n = len(current.children) - 1
                    while n >= 0:
                        stack.append(current.children[n])
                        n = n - 1
            else:
                continue
    
    def __setTypeAndNumber(self, node):
        current = node
        previousTokenType = current.tokenType

        try:
            tokenNum = len(node.symbol.tokenArr)
        except :
            tokenNum = 0

        while current:
            # tokenNum
            if hasattr(current, 'tokenNum'):
                current.tokenNum += tokenNum
            else:
                setattr(current, 'tokenNum', tokenNum)

            # tokenType
            try:
                current.tokenType = current.tokenType | previousTokenType
            except AttributeError:
                setattr(current, 'tokenType', previousTokenType)

            previousTokenType = current.tokenType
            current = current.parentCtx
      
    def indexGeneration(self, astTree, leafNodeArr, allTreeNodeArr):
        self.treeTraverse(self.__setIndex, astTree, [leafNodeArr, allTreeNodeArr])

    def __setIndex(self, node, variableArr):
        # If the node represents a token, it's a object from the class(tree.Tree.TerminalNodeImpl)
        leafNodeArr = variableArr[0]
        allTreeNodeArr = variableArr[1]
        if self.__ifToken(node):
            leafNodeArr[node.symbol.tokenIndex] = node
        
        allTreeNodeArr.append(node)
        setattr(node, 'treeNodeIndex',  len(allTreeNodeArr) - 1)

    def __ifToken(self, node):
        return hasattr(node, 'symbol') and hasattr(node.symbol, 'tokenIndex')

    def __setTokenType(self, leafNodeArr): # 0: None 1: identifier 2: keywords 3: literial
        for i in leafNodeArr:
            # 需要调查为什么会有空结点出现
            # 追记： 空结点为语句中的空格等无实体token
            if i == None:
                continue
            #
            tokenText = i.symbol.text
            sepaChect = self.__ifSeparator(tokenText)
            if sepaChect == 1:
                setattr(i,'tokenType',0)  #other
            elif sepaChect == 2:
                setattr(i,'tokenType',3)  # literial
            else:
                if {tokenText}.issubset(self.taskObj.keywordsSet):
                    setattr(i,'tokenType',2)  # keywords
                elif re.match(r'^[0-9]*$', tokenText) != None:
                    setattr(i,'tokenType', 3) # number literial
                else:
                    setattr(i,'tokenType',1)  # identifier

    def __ifSeparator(self, str):
            # using regular expression to check whether the input string is a separator:  if it contains charactors or numbers, it isn't a separator
        if re.match(r'\W', str) == None: 
            return 3 # Identifier or Keywords
        elif re.match(r'\s+$', str) != None:
            return 1 # indentations
        else:
            LiterialPattern = r'\W+[a-zA-Z0-9 ]+\W+'
            if re.match(LiterialPattern,str) != None:
                return 2 #  String Lieterial
            else:
                return 1       


    def getTokens(self, treeNode):
        self.treeTraverse()

    def createBag(self, bagNode, fileId, allTreeNodeArr, leafNodeArr):
        bag = TokenBag(fileId, bagNode.granularity, bagNode.bagId, bagNode.bagNodeIndex)

        tmp = None
        start = None 
        end = None 
        i = 0
        while i < len(bagNode.nodes):
            try:
                tmp = allTreeNodeArr[bagNode.nodes[i]].start
                start = allTreeNodeArr[bagNode.nodes[i]]
                break
            except AttributeError:
                i = i + 1

        i = len(bagNode.nodes) - 1
        while i >= 0:
            try:
                tmp = allTreeNodeArr[bagNode.nodes[i]].stop
                end = allTreeNodeArr[bagNode.nodes[i]]
                break
            except AttributeError:
                i = i - 1
            
        bag.setPosition(start.start, end.stop) # can not find end ???

        for i in bagNode.nodes:
            try:
                targetTreeNode = allTreeNodeArr[i]

                startIndex = targetTreeNode.start.tokenIndex
                endIndex = targetTreeNode.stop.tokenIndex

                for i in leafNodeArr[startIndex: endIndex+1]:
                    if i == None:
                        continue

                    typeSta = i.tokenType
                    if typeSta != 0:
                        for tokenText in i.symbol.tokenArr:
                            bag.addToken(tokenText)
                            bag.setTypeNumByType(typeSta)
                            bag.tokenNum += 1
            except AttributeError:
                continue

        setattr(bag, 'symbolNum', self.__getSymbolNum(allTreeNodeArr[bagNode.treeNodeIndex], leafNodeArr))

        return bag

    def __getSymbolNum(self, treeNode, leafNodeArr):
        try:
            return treeNode.symbolNum
        except AttributeError:
            self.__setSymbolNum(treeNode, leafNodeArr)
            return treeNode.symbolNum
        

    def printBags(self, collectionArr, taskId):
        filePath = 'tasks/task'+str(self.taskObj.taskId)+'/bagsRepo.file'
        file = open(filePath, 'w')
        for i in collectionArr:
            if i == None:
                continue
            for j in i:
                file.write('fileId: ' + str(j.fileId) + ' lines:' + str(j.startLine) + '-' + str(j.endLine) + '\n')
                file.write(j.toString() + '\n')
        file.close()

    def saveBags(self, bagCollectionArr):
        arr = []
        for i in range(len(bagCollectionArr)):
            arr.append(bagCollectionArr[i])
        savePath = 'tasks/task'+str(self.taskObj.taskId)+'/bags.file'
        with open(savePath, 'wb') as f:
            pickle.dump(arr, f)

    def saveTimearr(self, timeArr):
        savePath = 'tasks/task'+str(self.taskObj.taskId)+'/time.file'
        file = open(savePath, 'w')
        for i in range(len(timeArr)):
            try:
                file.write(str(i) + ' ' + str(timeArr[i][0]) + ' ' + str(timeArr[i][1]) + '\n')
            except:
                pass
        file.close()
    
    def loadBags(self):
        filePath = os.path.dirname(__file__)[:-7] + 'tasks/task' + str(self.taskObj.taskId) + '/bags.file'
        print(filePath)
        bags = None
        try:
            with open(filePath, 'rb') as f:
                bags = pickle.load(f)
        except FileNotFoundError:
            print('err: bags.file not exist')
        return bags

    # def saveBagTreeArr(self, bagTreeArr):
    #     arr = []
    #     for i in range(len(bagTreeArr)):
    #         arr.append(bagTreeArr[i])
    #     savePath = 'tasks/task' + str(self.taskObj.taskId) + '/bagTree.file'
    #     with open (savePath, 'wb') as f:
    #         pickle.dump(arr, f)

    # def loadBagTreeArr(self):
    #     filePath = 'tasks/task' + str(self.taskObj.taskId) + '/bagTree.file'
    #     bagTreeData = None
    #     try:
    #         with open(filePath, 'rb') as f:
    #             bagTreeData = pickle.load(f)
    #     except FileNotFoundError:
    #         print('err: bagTree.file not exist')
    #     return bagTreeData
    
    def loadBagsFromFile(self):
        filePath = self.taskObj.taskFolderPath + "/tokenBags"
        bags = []

        try:
            with open(filePath,"r") as f:
                for dataLine in f.readlines():
                    tBag = self.__createTokenBagFromStr(dataLine[:-1])
                    try:

                        if tBag.projectId > len(bags) - 1:
                            while tBag.projectId > len(bags) - 1:
                                bags.append(0)
                        if bags[tBag.projectId] == 0:
                            bags[tBag.projectId] = [0]
                        
                        if tBag.fileId > len(bags[tBag.projectId]) - 1:
                            while tBag.fileId > len(bags[tBag.projectId]) - 1:
                                bags[tBag.projectId].append(0)
                        if bags[tBag.projectId][tBag.fileId] == 0:
                            bags[tBag.projectId][tBag.fileId] = [tBag]
                        else:
                            bags[tBag.projectId][tBag.fileId].append(tBag)
                        
                        # if bags[tBag.fileId] == 0:
                        #     bags[tBag.fileId] = [tBag]
                        # else:
                        #     bags[tBag.fileId].append(tBag)
                    except Exception as e:
                        print(e)


        except FileNotFoundError:
            print("TokenBag file not found.")
            return None
        
        return bags
    
    def loadBagsFromFile_old(self): # before inter-project detection added
        filePath = self.taskObj.taskFolderPath + "/tokenBags"
        bags = [0] * len(self.taskObj.inputObj)
        try:
            with open(filePath,"r") as f:
                for dataLine in f.readlines():
                    tBag = self.__createTokenBagFromStr(dataLine[:-1])
                    try:
                        if bags[tBag.fileId] == 0:
                            bags[tBag.fileId] = [tBag]
                        else:
                            bags[tBag.fileId].append(tBag)
                    except Exception:
                        continue

        except FileNotFoundError:
            print("TokenBag file not found.")
            return None
        
        return bags

    def __createTokenBagFromStr(self, sourceStr):
        try:
            SAPARATOR_INFO  = "@ @"
            SAPARATOR_TOKEN = "_ _"
            SAPARATOR_ITEM  = ": :"
            array = sourceStr.split(SAPARATOR_INFO)
            positionArr = array[6].split(SAPARATOR_ITEM)
            tokenArr    = array[7].split(SAPARATOR_TOKEN)
            res = TokenBag(array[1], array[2], array[3], array[4],array[5],array[0] )

            res.setPositionO(positionArr[0], positionArr[1])

            tmp = None
            for tokenItem in tokenArr:
                tmp = tokenItem.split(SAPARATOR_ITEM)
                try:
                    res.addTokenWithFreq(tmp[0],int(tmp[1]))
                except Exception:
                    continue

            return res
        except IndexError:
            pass

class AnalysisTree():
    def __init__(self, treeNode, fileId):
        self.fileId = fileId
        self.parent = None
        self.children = []
        self.statementThreshold = 6
        try:
            self.tokenNum = treeNode.tokenNum
            self.tokenType = treeNode.tokenType
            self.treeNodeIndex = treeNode.treeNodeIndex
        except AttributeError:
            self.tokenNum = None
            self.tokenType = None
            self.treeNodeIndex = None
        self.nodeArr = []     # every node in AnalysisTree
        self.nodeIndex = None # the index of this node in self.nodeArr
        self.ifBag = False
        self.avaliable = True

    def treeTraverse(self, function, startNode):
        stack = []
        stack.append(startNode)
        while len(stack) > 0:
            current = stack[-1]
            function(current)
            stack.pop()
            try: # 'TerminalNodeImpl' object has no attribute 'children'
                n = len(current.children) - 1
                while n >= 0:
                    stack.append(current.children[n])
                    n = n - 1
            except AttributeError:
                pass
    
    def nonLeafNodeCal(self):
        startNode = self
        stack = []
        stack.append(startNode)
        sum = 0
        while len(stack) > 0:
            current = stack[-1]
            if len(current.children) != 0:
                sum += 1
            stack.pop()
            try: # 'TerminalNodeImpl' object has no attribute 'children'
                n = len(current.children) - 1
                while n >= 0:
                    stack.append(current.children[n])
                    n = n - 1
            except AttributeError:
                pass
        return sum
    
    def setUnavaliable(self, node):
        node.avaliable = False

    def tokenBagQuery(self):
        # return all the bagNode and pick up the depth from first node
        res = []
        stack = []
        stack.append(self)
        firstTargetDepth = None # for the file split
        topDepth = None # for relative depth
        bagNum = 0
        sta = 0 # 0: top depth is not set in current subtree 1: ..has been set
        
        # add the root node to the result array. ( For file level bag generation)
        bagNode = BagNode(-1, 0, 0, 0)
        bagNode.addTreeNode(0)
        res.append(bagNode)
        self.ifBag = True
        bagNum += 1

        while len(stack) > 0:
            current = stack[-1]

            if sta == 1 and current.depth == topDepth:
                sta = 0
                topDepth = None
            
            if self.__bagNodeValidation(current):
                if current.ifBag == False:
                    current.ifBag = True
                    if bagNum == 1:
                        firstTargetDepth = current.depth
                    
                    if sta == 0:
                        topDepth = current.depth
                        bagNode = BagNode(0, bagNum, current.nodeIndex, current.treeNodeIndex)
                        bagNum += 1
                        bagNode.addTreeNode(current.treeNodeIndex)
                        res.append(bagNode)
                        sta = 1
                    else:
                        bagNode = BagNode(current.depth - topDepth, bagNum, current.nodeIndex, current.treeNodeIndex)
                        bagNum += 1
                        bagNode.addTreeNode(current.treeNodeIndex)
                        res.append(bagNode)

            stack.pop()

            n = len(current.children) - 1
            while n >= 0:
                stack.append(current.children[n])
                n = n - 1
        
        # self.topLevelSplit(res, firstTargetDepth, bagNum)

        return res

    # def topLevelSplit(self, res, firstTargetDepth, bagNum):
    #     targetLevelNodes = [] # Nodes
    #     for i in self.nodeArr:
    #         if i.depth == firstTargetDepth:
    #             targetLevelNodes.append(i)

    #     splitPoints = [] # node's index in targetLevelNodes
    #     for index in range(len(targetLevelNodes)):
    #         if targetLevelNodes[index].ifBag == True:
    #             splitPoints.append(index)

    #     splitPointCursor = 0
    #     targetCursor = 0
    #     startPoint = 0
    #     while targetCursor < len(targetLevelNodes):
    #         if splitPointCursor == len(splitPoints):  # the part on the right side of the last split point
    #                 addedNode = self.__mergeNodes( targetLevelNodes[startPoint:], targetLevelNodes[splitPoints[-1]],1)
    #                 newBag = BagNode(0, bagNum, addedNode.nodeIndex)
    #                 bagNum = bagNum + 1
    #                 for treeNodes in addedNode.children:
    #                     newBag.addTreeNode(treeNodes.treeNodeIndex)
    #                 res.append(newBag)
    #                 break
            
    #         if targetCursor == splitPoints[splitPointCursor]:
    #             #if abs(targetCursor - startPoint) <= 1:
    #             splitSection = self.__splitSectionFilter(targetCursor, startPoint, targetLevelNodes)
    #             if len(splitSection) <= 1:
    #                 targetCursor = targetCursor + 1
    #                 startPoint = targetCursor
    #                 splitPointCursor = splitPointCursor + 1

    #             else:
    #                 addedNode = self.__mergeNodes( splitSection, targetLevelNodes[splitPoints[splitPointCursor]], 0)
    #                 # create new bagNode the add it to the res
    #                 newBag = BagNode(0, bagNum, addedNode.nodeIndex)
    #                 bagNum = bagNum + 1
    #                 for treeNodes in addedNode.children:
    #                     newBag.addTreeNode(treeNodes.treeNodeIndex)
    #                 res.append(newBag)
    #                 startPoint = targetCursor + 1
    #                 splitPointCursor = splitPointCursor + 1
    #         targetCursor = targetCursor + 1
    

    def __splitSectionFilter(self, targetCursor, startPoint, targetLevelNodes):
        # targetLevelNodes
        res = []
        i = startPoint
        while i <= targetCursor:
            if hasattr(targetLevelNodes[i], "start"):
                res.append(targetLevelNodes[i])
            i = i + 1
        return res

    def __mergeNodes(self, targetsArr, splitPointNode, lr): # lr: l0 r1. r is used only at the last merging
        newNode = AnalysisTree(None, targetsArr[0].fileId)
        newNode.ifBag = True

        splitPointParentNode = splitPointNode.parent
        newNode.parent = splitPointParentNode
        for i in range(len(splitPointParentNode.children)):
            if splitPointParentNode.children[i].nodeIndex == splitPointNode.nodeIndex:
                splitPointParentNode.children.insert(i+lr, newNode)
                break
        
        for target in targetsArr:
            nodesToDelete = []
            targetParent = target.parent
            target.parent = newNode
            for i in range(len(targetParent.children)):
                if targetParent.children[i].nodeIndex == target.nodeIndex:
                    nodesToDelete.append(i)
                    break
            i = len(nodesToDelete) - 1
            while i >= 0:
                targetParent.children.pop(nodesToDelete[i])
                i = i - 1
            newNode.children.append(target)
        newNode.nodeIndex = len(self.nodeArr)
        self.nodeArr.append(newNode)

        return newNode

    def __bagNodeValidation(self, targetNode): # Boolean
        if not hasattr(targetNode, 'tokenNum') or targetNode.tokenNum == None:
            return False

        # if targetNode.tokenNum > sThreshold:
        childs = targetNode.children
        if len(childs) == 0:
            return False
        
        flag = 0
        for i in childs:
            if not hasattr(i, 'tokenNum') or i.tokenNum == None:
                continue
            if i.tokenNum <= self.statementThreshold and i.tokenType == 2:
                flag = flag | 1
            # if i.tokenNum > sThreshold:
            #     flag = flag | 2
        if flag == 1:
            return True
        # else:
        #     return False
    
    def setDepth(self, depth):
        self.depth = depth
        return self



class BagNode():
    def __init__(self, granularity, bagId, bagNodeIndex, treeNodeIndex):
        self.nodes = [] # treeNodeIndex
        self.granularity = granularity
        self.bagId = bagId
        self.bagNodeIndex = bagNodeIndex
        self.treeNodeIndex = treeNodeIndex
    
    def addTreeNode(self, treeNodeIndex):
        self.nodes.append(treeNodeIndex)



class TokenBag():
    def __init__(self, fileId, bagId,granularity,keywordsNum, symbolNum, pId, tokenNum = 0):

        self.tokens       = {}
        self.fileId       = int(fileId)
        self.bagId        = int(bagId)
        self.granularity  = int(granularity)
        self.startLine    = None
        self.endLine      = None
        # self.startColumn  = None 
        # self.endColumn    = None
        # self.bagNodeIndex = bagNodeIndex
        self.tokenNum     = tokenNum
        self.symbolNum    = int(symbolNum);
        # self.num_id       = 0
        # self.num_literial = 0
        self.num_keywords = int(keywordsNum)
        self.projectId    = int(pId)
    
    def addToken(self, token):
        try:
            if token in self.tokens:
                self.tokens[token] += 1
            else:
                self.tokens[token] = 1
        except AttributeError:
            return True
    
    def addTokenWithFreq(self, token, freq):
        try:
            if token in self.tokens:
                self.tokens[token] += freq
            else:
                self.tokens[token] = freq
            # self.tokenNum += freq
        except AttributeError:
            return

    def setPosition(self,startToken, endToken):
        self.endLine = endToken.line
        self.startLine = startToken.line

        # self.startColumn = startToken.column
        # self.endColumn = endToken.column

        if endToken.text.find('\r\n') != -1:
            self.endLine = self.endLine - 1

        self.lineSize = self.endLine - self.startLine + 1

    def setPositionO(self, startLine, endLine):
        self.startLine = int(startLine)
        self.endLine = int(endLine)

        # self.lineSize = self.endLine - self.startLine + 1

    def printBag(self):
        print('bagId:' + str(self.bagId) + ' fileId:' + str(self.fileId) + ' position: ' + str(self.startLine) + '-' + str(self.endLine))
        tokenString = "" 
        for i in self.tokens:
            tokenString = tokenString + i + ':' + str(self.tokens[i]) + '|_|'
        print(tokenString)
        print('------')

    def toString(self):
        tokenString = "" 
        for i in self.tokens:
            tokenString = tokenString + i + ':' + str(self.tokens[i]) + '|_|'
        return tokenString
    
    def setTypeNumByType(self, typeSta):
        if typeSta == 1:
            self.num_id += 1
        elif typeSta == 2:
            self.num_keywords += 1
        elif typeSta == 3:
            self.num_literial += 1