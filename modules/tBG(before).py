# from Project.modules.TreeStructure import Tree
import importlib
import multiprocessing
from queue import Empty
from antlr4 import *
import ujson,sys, os
import re
import time
import pickle
import traceback
# first, write the program of token bag generation for one input file, and then scale it by multiprocessing.


class TokenBagGenerationController():
    def __init__(self, taskObj):
        sys.path.append(sys.path[0] + '/' + taskObj.configObj['parser'])
        self.lexerModule = getattr(importlib.import_module(taskObj.configObj['grammarName'] + 'Lexer'), taskObj.configObj['grammarName'] + 'Lexer')
        self.parserModule = getattr(importlib.import_module(taskObj.configObj['grammarName'] + 'Parser'), taskObj.configObj['grammarName'] + 'Parser')
        # self.lexerModule = importlib.import_module(taskObj.configObj['grammarName'] + 'Lexer')
        # self.parserModule = importlib.import_module(taskObj.configObj['grammarName'] + 'Parser')
        self.taskObj = taskObj
        self.statementThreshold = 10

    def gtpCalcu(self, gtpQueue, taskNum, gtpObj):
        num = 0
        while True:
            if num == taskNum:
                break
            try:
                tokenArr = gtpQueue.get_nowait()
                for i in tokenArr:
                    gtpObj.addItem(i)
                num += 1
            except Empty:
                time.sleep(0.1)

        return gtpObj
    
    def run(self, fileId, gtpQueue, bagCollectionArr, bagTreeCollectionArr):
        try:
            # input: a file from import project
            # output: bags from this file ( class:tokenBagCollection)
            # activity: save the tokens from level 0 to the GTP
            # this function will be runned concurrently

            # step: AST generation -> index generation(leafNodeArr allTreeNodeArr) ->token num generation and set token type -> analysis tree generation-> bag generation
            
            filePath = self.taskObj.inputObj[fileId]
            print("Token bag generation for file(" + filePath + ') is being excuted in process ' + str(os.getpid()))

            # antlr's part
            inputStream = FileStream(filePath, encoding='utf-8')
            lexer = self.lexerModule(inputStream)
            stream = CommonTokenStream(lexer)
            parser = self.parserModule(stream)
            astTree = getattr(parser, self.taskObj.configObj['startSymble'])()
            
            # index generation
            leafNodeArr = [None] * len(stream.tokens) # index to leaf nodes in the tree
            allTreeNodeArr = [] # every tree node ('treeNodeIndex')
            self.indexGeneration(astTree, leafNodeArr, allTreeNodeArr)

            # set tokenType (whether keywords)
            self.__setTokenType(leafNodeArr)

            # GTP calculation
            allToken = []
            for i in range(len(leafNodeArr)):
                # 要调查 
                if leafNodeArr[i] == None:
                    # print(i)
                    continue
                if leafNodeArr[i].tokenType != 0:
                    # gtpObj.addItem(i.symbol.text)
                    allToken.append(leafNodeArr[i].symbol.text)
            
            # calculate each sub tree's token number & 
            # set the type of tokens that each tree contains
            for i in leafNodeArr:
                if i != None:
                    self.__setTypeAndNumber(i)

            # analysis tree generation
            aTree  = self.__analysisTreeGeneration(astTree, fileId)

            # tokenBag query
            bagNodeArray = aTree.tokenBagQuery()

            # tokenBag generation
            bagCollection = []
            for bagNode in bagNodeArray:
                bag = self.createBag(bagNode, fileId, allTreeNodeArr, leafNodeArr)
                if bag != None:
                    bagCollection.append( bag )

            bagCollectionArr[fileId] = bagCollection
            bagTreeCollectionArr[fileId] = aTree

            gtpQueue.put_nowait(allToken)
            print("The process " + str(os.getpid()) + ' is closed')

        except:
            print('---------error:---------')
            print('file:' + filePath)
            error_type, error_value, error_trace = sys.exc_info()
            print(error_type)
            print(error_value)
            for info in traceback.extract_tb(error_trace):  
                print(info)
            print('------------------')
            bagCollectionArr[fileId] = None
            bagTreeCollectionArr[fileId] = None
            gtpQueue.put_nowait([])

    def bagGeneration(self, gtpObj):
        fileNum = len(self.taskObj.inputObj)
        bagCollectionArr = multiprocessing.Manager().list()
        for i in range(fileNum):
            bagCollectionArr.append(None)
        bagTreeCollectionArr = multiprocessing.Manager().list()
        for i in range(fileNum):
            bagTreeCollectionArr.append(None)

        m = multiprocessing.Manager()
        gtpQueue = m.Queue()


        # using a process pool to generate token bags 
        pool = multiprocessing.Pool(multiprocessing.cpu_count() - 1) # multiprocessing.cpu_count() - 1
        
        # for i in range(fileNum):
        #     pool.apply_async(self.run, args=(i, gtpQueue, bagCollectionArr, bagTreeCollectionArr))
        # pool.close()

        # test code
        for i in range(fileNum):
            self.run(i, gtpQueue, bagCollectionArr, bagTreeCollectionArr)

        self.gtpCalcu(gtpQueue, fileNum, gtpObj)
        return (bagCollectionArr, gtpObj, bagTreeCollectionArr)

    def __ifSeparator(self, str):
        # using regular expression to check whether the input string is a separator:  if it contains charactors or numbers, it isn't a separator
        if re.match(r'\W', str) == None: 
            return False # Identifier or Keywords
        elif re.match(r'\s+$', str) != None:
            return True # indentations
        else:
            LiterialPattern = r'\W+[a-zA-Z0-9 ]+\W+'
            if re.match(LiterialPattern,str) != None:
                return False #  String Lieterial
            else:
                return True 

    def __analysisTreeGeneration(self, astTree, fileId):
        analysisTree = AnalysisTree(astTree, fileId).setDepth(0)
        
        nodeArr = analysisTree.nodeArr
        nodeNum = 0

        stackA = [] # stack for astTree
        stackB = [] # stack for analysisTree
        stackB_fordepth = [0]
        stackA.append(astTree)
        stackB.append(analysisTree)

        setattr(analysisTree, 'statementThreshold', self.statementThreshold)
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
            elif mergeTarget.tokenNum < self.statementThreshold:
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
        lastTokenType = current.tokenType
        while current:
            # tokenNum
            if hasattr(current, 'tokenNum'):
                current.tokenNum += 1
            else:
                setattr(current, 'tokenNum', 1)
                # current['tokenNum'] = 1
            # tokenType
                try:
                    current.tokenType = current.tokenType | lastTokenType
                except AttributeError:
                    setattr(current, 'tokenType', lastTokenType)
                    # current['tokenType'] = lastTokenType

            lastTokenType = current.tokenType
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
        return hasattr(node, 'symbol')

    def __setTokenType(self, leafNodeArr):
        for i in leafNodeArr:
            # 需要调查为什么会有空结点出现
            if i == None:
                continue
            #
            tokenText = i.symbol.text
            if self.__ifSeparator(tokenText):
                setattr(i,'tokenType',0)
            elif {tokenText}.issubset(self.taskObj.keywordsSet):
                setattr(i,'tokenType',2)
                #  i['tokenType'] = 2
            else:
                setattr(i,'tokenType',1)
                # i['tokenType'] = 1

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

                    if i.tokenType != 0:
                        bag.addToken(i.symbol.text)
                        bag.tokenNum = bag.tokenNum + 1
            except AttributeError:
                continue

        return bag
    
    # def saveBags(self, bagCollectionArr):
    #     savePath = 'tasks/task'+str(self.taskObj.taskId)+'/bags.file'
    #     bagFile = open(savePath, 'w')

    #     # separators: |@_@|
    #     for bagsIndex in range(len(bagCollectionArr)):
    #         if bagCollectionArr[bagsIndex] == None:
    #             continue
    #         for bag in bagCollectionArr[bagsIndex]:
    #             dataStr = ''
    #             dataStr = dataStr + str(getattr(bag,'fileId')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'bagId')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'bagNodeIndex')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'granularity')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'tokenNum')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'startLine')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'endLine')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'startColumn')) + '|@_@|'
    #             dataStr = dataStr + str(getattr(bag,'endColumn')) + '|@_@|'
    #             tokens = getattr(bag,'tokens')
    #             for token in tokens:
    #                 dataStr = dataStr + token + '|_|' + str(tokens[token]) + '|@_@|'
    #             bagFile.write(dataStr + '\n')
    #     bagFile.close()
    #     return True

    # def loadBags(self):
    #     bags = [None] * len(self.taskObj.inputObj)
    #     filePath = 'tasks/task' + str(self.taskObj.taskId) + '/bags.file'
    #     try:
    #         bagsFile = open(filePath, 'r')
    #         bagsData = bagsFile.readlines()
    #         bagsFile.close()
    #     except FileNotFoundError:
    #         print('err: bags.file not exist')
    #         return None

    #     for bagLine in bagsData:
    #         bagArr = bagLine[:-1].split('|@_@|')
    #         bag = TokenBag(int(bagArr[0]), int(bagArr[3]), int(bagArr[1]), int(bagArr[2]))
    #         bag.setPositionO(bagArr[5], bagArr[6], bagArr[7], bagArr[8])
    #         bag.tokenNum = bagArr[4]
    #         tokens = {}
    #         j = 9
    #         while j < len(bagArr) - 1:
    #             tokenStr = bagArr[j]
    #             tokenArr = tokenStr.split('|_|')
    #             # print(tokenArr)
    #             tokens[str(tokenArr[0])] = int(tokenArr[1])
    #             # setattr(tokens, str(tokenArr[0]), int(tokenArr[1]))
    #             j += 1
    #         bag.tokens = tokens

    #         if bags[bag.fileId] == None:
    #             bags[bag.fileId] = []
    #         bags[bag.fileId].append(bag)

    #     return bags
    def saveBags(self, bagCollectionArr):
        arr = []
        for i in range(len(bagCollectionArr)):
            arr.append(bagCollectionArr[i])
        savePath = 'tasks/task'+str(self.taskObj.taskId)+'/bags.file'
        with open(savePath, 'wb') as f:
            pickle.dump(arr, f)
    
    def loadBags(self):
        filePath = 'tasks/task' + str(self.taskObj.taskId) + '/bags.file'
        bags = None
        try:
            with open(filePath, 'rb') as f:
                bags = pickle.load(f)
        except FileNotFoundError:
            print('err: bags.file not exist')
        return bags
    def saveBagTreeArr(self, bagTreeArr):
        arr = []
        for i in range(len(bagTreeArr)):
            arr.append(bagTreeArr[i])
        savePath = 'tasks/task' + str(self.taskObj.taskId) + '/bagTree.file'
        with open (savePath, 'wb') as f:
            pickle.dump(arr, f)

    def loadBagTreeArr(self):
        filePath = 'tasks/task' + str(self.taskObj.taskId) + '/bagTree.file'
        bagTreeData = None
        try:
            with open(filePath, 'rb') as f:
                bagTreeData = pickle.load(f)
        except FileNotFoundError:
            print('err: bagTree.file not exist')
        return bagTreeData

class AnalysisTree():
    def __init__(self, treeNode, fileId):
        self.fileId = fileId
        self.parent = None
        self.children = []
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
        threshold = self.statementThreshold
        
        # add the root node to the result array. ( For file level bag generation)
        bagNode = BagNode(-1, 0, 0)
        bagNode.addTreeNode(0)
        res.append(bagNode)
        self.ifBag = True
        bagNum += 1

        while len(stack) > 0:
            current = stack[-1]

            if sta == 1 and current.depth == topDepth:
                sta = 0
                topDepth = None
            
            if self.__bagNodeValidation(current, threshold):
                if current.ifBag == False:
                    current.ifBag = True
                    if bagNum == 1:
                        firstTargetDepth = current.depth
                    
                    if sta == 0:
                        topDepth = current.depth
                        bagNode = BagNode(0, bagNum, current.nodeIndex)
                        bagNum += 1
                        bagNode.addTreeNode(current.treeNodeIndex)
                        res.append(bagNode)
                        sta = 1
                    else:
                        bagNode = BagNode(current.depth - topDepth, bagNum, current.nodeIndex)
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

    def topLevelSplit(self, res, firstTargetDepth, bagNum):
        targetLevelNodes = [] # Nodes
        for i in self.nodeArr:
            if i.depth == firstTargetDepth:
                targetLevelNodes.append(i)

        splitPoints = [] # node's index in targetLevelNodes
        for index in range(len(targetLevelNodes)):
            if targetLevelNodes[index].ifBag == True:
                splitPoints.append(index)

        splitPointCursor = 0
        targetCursor = 0
        startPoint = 0
        while targetCursor < len(targetLevelNodes):
            if splitPointCursor == len(splitPoints):  # the part on the right side of the last split point
                    addedNode = self.__mergeNodes( targetLevelNodes[startPoint:], targetLevelNodes[splitPoints[-1]],1)
                    newBag = BagNode(0, bagNum, addedNode.nodeIndex)
                    bagNum = bagNum + 1
                    for treeNodes in addedNode.children:
                        newBag.addTreeNode(treeNodes.treeNodeIndex)
                    res.append(newBag)
                    break
            
            if targetCursor == splitPoints[splitPointCursor]:
                #if abs(targetCursor - startPoint) <= 1:
                splitSection = self.__splitSectionFilter(targetCursor, startPoint, targetLevelNodes)
                if len(splitSection) <= 1:
                    targetCursor = targetCursor + 1
                    startPoint = targetCursor
                    splitPointCursor = splitPointCursor + 1

                else:
                    addedNode = self.__mergeNodes( splitSection, targetLevelNodes[splitPoints[splitPointCursor]], 0)
                    # create new bagNode the add it to the res
                    newBag = BagNode(0, bagNum, addedNode.nodeIndex)
                    bagNum = bagNum + 1
                    for treeNodes in addedNode.children:
                        newBag.addTreeNode(treeNodes.treeNodeIndex)
                    res.append(newBag)
                    startPoint = targetCursor + 1
                    splitPointCursor = splitPointCursor + 1
            targetCursor = targetCursor + 1
    
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

    def __bagNodeValidation(self, targetNode, sThreshold): # Boolean
        if not hasattr(targetNode, 'tokenNum') or targetNode.tokenNum == None:
            return False
        if targetNode.tokenNum > sThreshold:
            childs = targetNode.children
            if len(childs) == 0:
                return False
            
            flag = 0
            for i in childs:
                if not hasattr(i, 'tokenNum') or i.tokenNum == None:
                    continue
                if i.tokenNum <= sThreshold and i.tokenType == 2:
                    flag = flag | 1
                if i.tokenNum > sThreshold:
                    flag = flag | 2
            if flag == 3:
                return True
        else:
            return False
    
    def setDepth(self, depth):
        self.depth = depth
        return self

class BagNode():
    def __init__(self, granularity, bagId, bagNodeIndex):
        self.nodes = [] # treeNodeIndex
        self.granularity = granularity
        self.bagId = bagId
        self.bagNodeIndex = bagNodeIndex
    
    def addTreeNode(self, treeNodeIndex):
        self.nodes.append(treeNodeIndex)

class TokenBag():
    def __init__(self, fileId, granularity, bagId, bagNodeIndex):
        self.tokens = {}
        self.fileId = fileId
        self.bagId = bagId
        self.granularity = granularity
        self.startLine = None
        self.endLine = None
        self.startColumn = None 
        self.endColumn = None
        self.bagNodeIndex = bagNodeIndex
        self.tokenNum = 0
    
    def addToken(self, token):
        try:
            if token in self.tokens:
                self.tokens[token] += 1
            else:
                self.tokens[token] = 1
        except AttributeError:
            return True

    def setPosition(self,startToken, endToken):
        self.endLine = endToken.line
        self.startLine = startToken.line
        self.startColumn = startToken.column
        self.endColumn = endToken.column

        if endToken.text.find('\r\n') != -1:
            self.endLine = self.endLine - 1

    def setPositionO(self, startLine, endLine, startColumn, endColumn):
        self.startLine = startLine
        self.endLine = endLine
        self.startColumn = startColumn
        self.endColumn = endColumn

    def printBag(self):
        print('bagId:' + str(self.bagId) + ' fileId:' + str(self.fileId) + ' position: ' + str(self.startLine) + '-' + str(self.endLine))
        tokenString = "" 
        for i in self.tokens:
            tokenString = tokenString + i + ':' + str(self.tokens[i]) + '|_|'
        print(tokenString)
        print('------')

if True:
    b = 2