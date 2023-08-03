import ujson,sys,os

MSCCD_ROOT  = sys.path[0][:-15]

print(MSCCD_ROOT)
class Manager:
    def __init__(self,taskId,detectionId,cloneOrigin) -> None:
        self.TaskId = taskId
        self.DetectionId = detectionId
        self.FileList = self.fileListGeneration()
        self.CloneList = self.cloneListGeneration(cloneOrigin)
        self.BagList = self.tokenBagListGeneration()
        self.CloneListByGranularity = None
        self.CloneListBySize = None
        self.CloneListByBoth = None
        self.lSize = None
        self.rSize = None
        self.cloneOrigin = cloneOrigin
        pass
    
    # def getMaxClassId(self):
    #     maxSize = 0
    #     maxIndex = None
        
    #     for cloneClass in self.CloneList:
    #         if len(cloneClass) > 
    
    def generateCloneListByBoth(self, gValue, lSize, rSize):
        res = []
        
        for cloneClass in self.CloneList:
            gValue = self.BagList[cloneClass[0][0]][cloneClass[0][1]][cloneClass[0][2]]['granularity']
            size = self.BagList[cloneClass[0][0]][cloneClass[0][1]][cloneClass[0][2]]['tokenNum']
            if size >= lSize and lSize <= rSize:
                while gValue > len(res) - 1:
                    res.append([])
                res[gValue].append(cloneClass)
        
        self.CloneListByBoth = res
        self.lSize = lSize;
        self.rSize = rSize;
        return res
    
    
    def generateCloneListBySize(self, lSize, rSize):
        res = []
        for cloneClass in self.CloneList:
            size = self.BagList[cloneClass[0][0]][cloneClass[0][1]][cloneClass[0][2]]['tokenNum']
            if size >= lSize and lSize <= rSize:
                res.append(cloneClass)
        
        self.CloneListBySize = res
        self.lSize = lSize;
        self.rSize = rSize;
        return res
    
    def generateCloneListByGValue(self):
        res = []
        
        for cloneClass in self.CloneList:
            gValue = self.BagList[cloneClass[0][0]][cloneClass[0][1]][cloneClass[0][2]]['granularity']
            while gValue > len(res) - 1:
                res.append([])
            res[gValue].append(cloneClass)
        
        self.CloneListByGranularity = res
        return res
        
    
    def getCodeContent(self, filePath, startLine, endLine):
        if os.path.exists(filePath):
            try:
                return open(filePath,"r").readlines()[startLine - 1:endLine]
            except IsADirectoryError:
                print(filePath)
                return "file not found"
        else:
            return "file not found"
    
    
    def generateReport(self, classId, pairId, typeArray = None): # typeArray [tGValue], [lSize,rSize], [GValue,lSize,rSize]
        
        res = {
            "clones" : [],
            "cloneOrigin" : self.cloneOrigin
        
        }
        
     
        
        if typeArray == None: # normal
        
            res['classSum'] = len(self.CloneList)
            res['classSize'] = len(self.CloneList[classId])
            res['classId'] = classId
            res['pairId'] = pairId
            
            res['clones'].append(self.getCodeObj(classId,0))
            res['clones'].append(self.getCodeObj(classId,pairId))
            res['taskId'] = self.TaskId
            res['detectionId'] = self.DetectionId
            
        elif len(typeArray) == 1: # GValue index
            gValue = typeArray[0]
            res['classSum'] = len(self.CloneListByGranularity[gValue])
            res['classSize'] = len(self.CloneListByGranularity[gValue][classId])
            res['classId'] = classId
            res['pairId'] = pairId
            
            res['clones'].append(self.getCodeObj(classId,0,1,gValue))
            res['clones'].append(self.getCodeObj(classId,pairId,1,gValue))
            res['taskId'] = self.TaskId
            res['detectionId'] = self.DetectionId
            res['gValue'] = gValue
        
        elif len(typeArray)  == 2: #size
            lSize = typeArray[0]
            rSize = typeArray[1]
            
            res['classSum'] = len(self.CloneListBySize)
            res['classSize'] = len(self.CloneListBySize[classId])
            res['classId'] = classId
            res['pairId'] = pairId
            
            res['clones'].append(self.getCodeObj(classId,0,2))
            res['clones'].append(self.getCodeObj(classId,pairId,2))
            res['taskId'] = self.TaskId
            res['detectionId'] = self.DetectionId
            res['lSize'] = lSize
            res['rSize'] = rSize
            
        elif len(typeArray)  == 3: #both
            gValue = typeArray[0]
            lSize = typeArray[1]
            rSize = typeArray[2]
            gValue = typeArray[0]
            res['classSum'] = len(self.CloneListByBoth[gValue])
            res['classSize'] = len(self.CloneListByBoth[gValue][classId])
            res['classId'] = classId
            res['pairId'] = pairId
            
            res['clones'].append(self.getCodeObj(classId,0,3,gValue))
            res['clones'].append(self.getCodeObj(classId,pairId,3,gValue))
            res['taskId'] = self.TaskId
            res['detectionId'] = self.DetectionId
            res['gValue'] = gValue
            res['lSize'] = lSize
            res['rSize'] = rSize
            
        return res
    
    def getCodeObj(self, classId, pairId,type = 0, gValue = 0):
        res = {}
        if type == 0:
  
            bagPosition = self.CloneList[classId][pairId]
        elif type == 1:

            bagPosition = self.CloneListByGranularity[gValue][classId][pairId]
        elif type == 2:

            bagPosition = self.CloneListBySize[classId][pairId]
        elif type == 3:

            bagPosition = self.CloneListByBoth[gValue][classId][pairId]
        
            
        tokenBag = self.BagList[bagPosition[0]][bagPosition[1]][bagPosition[2]]
        
        
        
        # filePath
        filePath = self.FileList[bagPosition[0]][bagPosition[1]]

        res['filePath'] = filePath
        # position
        startLine = tokenBag['startLine']
        endLine = tokenBag['endLine']
        res['position'] = str(startLine) + " - " + str(endLine)
        # tokenNum
        res['tokenNum'] = str(tokenBag['tokenNum'])
        # granularity
        res['granularity'] = str(tokenBag['granularity'])
        
        res['content'] = self.getCodeContent(filePath,startLine,endLine)
        
        return res
    
    def cloneListGeneration(self, cloneOrigin):
        
        res = []
        clonePath = MSCCD_ROOT + "/tasks/task" + str(self.TaskId) + "/detection" + str(self.DetectionId) + "/pairs.file"
        
        if cloneOrigin == 'all':
            for cloneLine in open(clonePath, "r").readlines():
                cloneTmp = ujson.loads(cloneLine[:-1])
                if self.cloneFilter(cloneTmp[0]):
                    res.append(cloneTmp)
        else:
            if cloneOrigin == 'intra':
                for cloneLine in open(clonePath, "r").readlines():
                    cloneTmp = ujson.loads(cloneLine[:-1])
                    if len(cloneTmp) == 2:
                        if cloneTmp[0][0] == cloneTmp[1][0]:
                            if self.cloneFilter(cloneTmp[0]):

                                res.append(cloneTmp)
                    else: 
                        cursor = 1
                        cloneClass = []
                        cloneClass.append(cloneTmp[0])
                        while cursor <= len(cloneTmp) - 1:
                            if cloneTmp[0][0] == cloneTmp[1][0]:
                                cloneClass.append(cloneTmp[cursor])
                            cursor += 1
                        
                        if len(cloneClass) > 1:
                            if self.cloneFilter(cloneTmp[0]):

                                res.append(cloneClass)
                        
            elif cloneOrigin == "cross":
                for cloneLine in open(clonePath, "r").readlines():
                    cloneTmp = ujson.loads(cloneLine[:-1])
                    if len(cloneTmp) == 2:
                        if cloneTmp[0][0] != cloneTmp[1][0]:
                            if self.cloneFilter(cloneTmp[0]):
                            
                                res.append(cloneTmp)
                    else: 
                        cursor = 1
                        cloneClass = []
                        cloneClass.append(cloneTmp[0])
                        while cursor <= len(cloneTmp) - 1:
                            if cloneTmp[0][0] != cloneTmp[1][0]:
                                cloneClass.append(cloneTmp[cursor])
                            cursor += 1
                        
                        if len(cloneClass) > 1:
                            if self.cloneFilter(cloneTmp[0]):

                                res.append(cloneClass)
        return res
    
    def fileListGeneration(self):
        fileListPath = MSCCD_ROOT + "/tasks/task" + str(self.TaskId) + "/fileList.txt"
        res = []
        splitTmp = None
        for dataLine in open(fileListPath,"r").readlines():
            splitTmp = dataLine[:-1].split(",")
            projectId = int(splitTmp[0])
            while len(res) - 1 < projectId:
                res.append([])
            res[projectId].append(splitTmp[1])

        
        return res

    def cloneFilter(self, cloneArr) -> bool: # true: target
        return self.pathFilter(self.FileList[cloneArr[0]][cloneArr[1]])

    def pathFilter(self, path) -> bool :
        filteroutFolderSet = {"node_modules"}
        for name in path.split("/"):
            if name in filteroutFolderSet:
                return False
        
        return True

    def tokenBagListGeneration(self):
        # not gain all the informations, only line number range
        sourcePath = MSCCD_ROOT + "/tasks/task" + str(self.TaskId) + "/tokenBags"
        res = []
        splitTmp = None
        for sourceline in open(sourcePath,"r").readlines():
            splitTmp  = sourceline[:-1].split("@ @")
            projectId = int(splitTmp[0])
            fileId    = int(splitTmp[1])
            bagId     = int(splitTmp[2])
            lineArr   = splitTmp[7].split(": :")
            startLine = int(lineArr[0])
            endLine   = int(lineArr[1])
            
            bag = {
                "startLine" : startLine,
                "endLine"   : endLine,
                "tokenNum"  : int(splitTmp[6]),
                "granularity" : int(splitTmp[3])
            }
            
            while len(res) - 1 < projectId:
                res.append([])
            while len(res[projectId]) - 1 < fileId:
                res[projectId].append([])
            res[projectId][fileId].append( bag  )
            if bagId != len(res[projectId][fileId]) - 1:
                print("err")
        
        return res
