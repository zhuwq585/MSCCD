import os,sys,ujson
MSCCD_PATH = sys.path[0][:-8]


def fileListGeneration(taskId):
    fileListPath = MSCCD_PATH + "/tasks/task" + str(taskId) + "/fileList.txt"
    res = []
    splitTmp = None
    for dataLine in open(fileListPath,"r").readlines():
        splitTmp = dataLine[:-1].split(",")
        projectId = int(splitTmp[0])
        while len(res) - 1 < projectId:
            res.append([])
        res[projectId].append(splitTmp[1])

    return res

def cloneFilter( cloneArr, fileList) -> bool: # true: target
    return pathFilter(fileList[cloneArr[0]][cloneArr[1]])

def pathFilter( path) -> bool :
    filteroutFolderSet = {"node_modules"}
    for name in path.split("/"):
        if name in filteroutFolderSet:
            return False
    
    return True

def cloneListGeneration(clonePath, fileListArr):
    res = []
    for cloneLine in open(clonePath, "r").readlines():
        cloneClass = ujson.loads(cloneLine[:-1])
        if cloneFilter(cloneClass[0], fileListArr):
            res.append(cloneClass)
    return res

def tokenBagListGeneration(taskId):
    # not gain all the informations, only line number range
    sourcePath = MSCCD_PATH + "/tasks/task" + str(taskId) + "/tokenBags"
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


if __name__ == "__main__":
    taskId      = sys.argv[1]
    detectionId = sys.argv[2]
    
    minSize     = int(sys.argv[3])
    maxSize     = int(sys.argv[4])
    
    minGran     = int(sys.argv[5])
    maxGran     = int(sys.argv[6])
    
    
    cloneOrigin = sys.argv[7]
    
    targetClassSize = int(sys.argv[8])
    
    
    
    # taskId      = '20001'
    # detectionId = '1'
    
    # minSize     = 1
    # maxSize     = 1111111
    
    # minGran     = 2
    # maxGran     = 2
    
    
    # cloneOrigin = "cross"
    # targetClassSize = 10
    
    # taskId      = '10001'
    # detectionId = '1'
    # minSize     = 10
    
    
    cloneList = MSCCD_PATH + "/tasks/task" + taskId + "/detection" + detectionId + "/pairs.file"
    res = []
    
    if os.path.exists(cloneList):
        tokenBagListArr = tokenBagListGeneration(taskId)
        fileListArr = fileListGeneration(taskId)
        cloneListArr = cloneListGeneration(cloneList, fileListArr)
        
        # print(len(cloneListArr))
        
        candidates = []
        
        for cloneIndex in range(len(cloneListArr)):
            cloneClass = cloneListArr[cloneIndex]
            
            if minGran == -1 or maxGran == -1 or minSize == -1 or maxSize == -1:
                if len(cloneClass) > minSize and len(cloneClass) < maxSize:
                    candidates.append((cloneIndex,cloneClass))
                    # print("id: " + str(cloneIndex) + " size: "+ str(len(cloneClass)))
            else: # search by gValue and size
                firstTBag = tokenBagListArr[cloneClass[0][0]][cloneClass[0][1]][cloneClass[0][2]]
                gran = firstTBag['granularity']
                size = firstTBag['tokenNum']
                if len(cloneClass) >= minSize and len(cloneClass) <= maxSize:
                    if gran >= minGran and gran <= maxGran and size<=maxSize and size >= minSize:
                        candidates.append((cloneIndex,cloneClass))

                        # print("id: " + str(cloneIndex) + " size: "+ str(len(cloneClass)))
        
        if cloneOrigin == "all":
            for candidate in candidates:
                if len(candidate[1]) >= targetClassSize:
                    print("id: " + str(candidate[0]) + " size: "+ str(len(candidate[1])))
        
        elif cloneOrigin == "intra":
            for candidate in candidates:
                cursor = 1
                cloneClass = []
                cloneClass.append(candidate[1][0])
                while cursor <= len(candidate[1]) - 1:
                    if candidate[1][0][0] ==  candidate[1][cursor][0]:
                        cloneClass.append(candidate[1][cursor])
                    cursor += 1
                
                if len(cloneClass) >= targetClassSize:
                    print("id: " + str(candidate[0]) + " size: "+ str(len(cloneClass)))
        
        elif cloneOrigin == "cross":
            
            for candidate in candidates:
                cursor = 1
                cloneClass = []
                cloneClass.append(candidate[1][0])
                while cursor <= len(candidate[1]) - 1:
                    if candidate[1][0][0] !=  candidate[1][cursor][0]:
                        cloneClass.append(candidate[1][cursor])
                    cursor += 1
                
                if len(cloneClass) >= targetClassSize:
                    print("id: " + str(candidate[0]) + " size: "+ str(len(cloneClass)) + "  content:" + str(cloneClass))   
