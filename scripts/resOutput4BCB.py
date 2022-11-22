# output a report for BigCloneBench
import sys, os, ujson
MSCCD_ROOT = sys.path[0][:-8]


def cloneListGeneration(clonePath):
    res = []
    for cloneLine in open(clonePath, "r").readlines():
        res.append(ujson.loads(cloneLine[:-1]))
    
    return res
    
def fileListGeneration(fileListPath):
    res = []
    splitTmp = None
    for dataLine in open(fileListPath,"r").readlines():
        splitTmp = dataLine[:-1].split(",")
        projectId = int(splitTmp[0])
        while len(res) - 1 < projectId:
            res.append([])
        res[projectId].append(splitTmp[1])
    
    return res

def tokenBagListGeneration(sourcePath):
    # not gain all the informations, only line number range
    res = []
    splitTmp = None
    for sourceline in open(sourcePath,"r").readlines():
        splitTmp  = sourceline[:-1].split("@ @")
        projectId = int(splitTmp[0])
        fileId    = int(splitTmp[1])
        bagId     = int(splitTmp[2])
        
        granularity    = int(splitTmp[3])
        keywordsNum    = int(splitTmp[4])
        symbolNum      = int(splitTmp[5])
        tokenNum       = int(splitTmp[6])
        
        
        lineArr   = splitTmp[7].split(": :")
        startLine = int(lineArr[0])
        endLine   = int(lineArr[1])
        
        while len(res) - 1 < projectId:
            res.append([])
        while len(res[projectId]) - 1 < fileId:
            res[projectId].append([])
        while len(res[projectId][fileId]) - 1 < bagId:
            res[projectId][fileId].append([])
        
        res[projectId][fileId][bagId] = [startLine, endLine,granularity,keywordsNum,symbolNum,tokenNum] 
    
    return res

def filePath2BCBMsg(path): # "subfolder,fileName"
    tmp = path.split("/")
    res = tmp[-2] + "," + tmp[-1]
    return res

if __name__ == "__main__":
    res = []
    
    taskIdStart = int(sys.argv[1])
    taskIdEnd   = int(sys.argv[2])
    outputFile  = sys.argv[3]
    # taskIdStart = 1
    # taskIdEnd   = 44
    # outputFile  = "./out.txt"
    
    taskIdList = range(taskIdStart, taskIdEnd + 1)
    for taskId in taskIdList:
        fileListFile = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/fileList.txt"
        resultFile   = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/detection1/pairs.file"
        bagFile      = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/tokenBags"


        if (os.path.exists(fileListFile) and os.path.exists(resultFile)):
            bagList   = tokenBagListGeneration(bagFile)
            fileList  = fileListGeneration(fileListFile)
            cloneList = cloneListGeneration(resultFile)
            for clone in cloneList:
                msg = ""
                msg = msg + filePath2BCBMsg( fileList[clone[0][0]][clone[0][1]]) + ","
                msg = msg + str(bagList[clone[0][0]][clone[0][1]][clone[0][2]][0]) + ","
                msg = msg + str(bagList[clone[0][0]][clone[0][1]][clone[0][2]][1]) + ","
                
                msg = msg + filePath2BCBMsg( fileList[clone[1][0]][clone[1][1]]) + ","
                msg = msg + str(bagList[clone[1][0]][clone[1][1]][clone[1][2]][0]) + ","
                msg = msg + str(bagList[clone[1][0]][clone[1][1]][clone[1][2]][1])
                
                res.append(msg)

    
    with open(outputFile,"w") as f:
        for line in res:
            f.write(line + "\n")
    
        