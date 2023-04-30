## input: taskId, detectionId
## output: clone pair of file identifier
## parameters: taskId detectionId outputFile ["granularity keyword symbol token"]
import sys, os, ujson

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

if __name__ == "__main__":
    
    MSCCD_ROOT = sys.path[0][:-7]    
    taskId = sys.argv[1]
    detectionId = sys.argv[2]
    outputFile = sys.argv[3]
    
    # MSCCD_ROOT = "./"
    # taskId = '3'
    # detectionId = '1'
    # outputFile = "./text.csv"
    # sys.argv.append("token")
    # sys.argv.append("symbol")
    # sys.argv.append("keyword")
    
    
    itemName2Index = {
        "granularity" : 2,
        "keyword" : 3,
        "symbol": 4,
        "token": 5
    }
    
    infoItems = []
    if len(sys.argv) > 4:
        for argvIndex in range(4, len(sys.argv)):
            if sys.argv[argvIndex] in itemName2Index:
                infoItems.append(sys.argv[argvIndex])
            else:
                print(sys.argv[argvIndex] + " is not supported.")
    
    # taskId = "10"
    # detectionId = "1"
    # outputFile = 'output.txt'
    fileList  = MSCCD_ROOT + "tasks/task" + taskId + "/filelist.txt"
    cloneList = MSCCD_ROOT + "tasks/task" + taskId + "/detection" + detectionId + "/pairs.file"
    bagList   = MSCCD_ROOT + "tasks/task" + taskId + "/tokenBags"
    res = []
    
    if os.path.exists(fileList) and os.path.exists(cloneList):
        fileListArr  = fileListGeneration(fileList)
        cloneListArr = cloneListGeneration(cloneList)
        tokenBagListArr = tokenBagListGeneration(bagList)
        
        titleMsg = "code segment1 file,startline,endline,"
        for infoItem in infoItems:
            titleMsg = titleMsg + infoItem + ","
        titleMsg =titleMsg +  "code segment2 file,startline,endline,"
        for infoItem in infoItems:
            titleMsg = titleMsg + infoItem + ","
        if titleMsg[-1] == ",":
            titleMsg = titleMsg[:-1] + "\n"
        
        with open(outputFile, "w") as f:
            # f.write(titleMsg)
            for clone in cloneListArr:
                msg = fileListArr[clone[0][0]][clone[0][1]] + ","
                msg = msg + str(tokenBagListArr[clone[0][0]][clone[0][1]][clone[0][2]][0]) + ","
                msg = msg + str(tokenBagListArr[clone[0][0]][clone[0][1]][clone[0][2]][1]) + ","
                if len(infoItems) > 0:
                    for infoItem in infoItems:
                        msg = msg + str(tokenBagListArr[clone[0][0]][clone[0][1]][clone[0][2]][itemName2Index[infoItem]]) + ","
                
                
                msg = msg + fileListArr[clone[1][0]][clone[1][1]] + ","
                msg = msg + str(tokenBagListArr[clone[1][0]][clone[1][1]][clone[1][2]][0]) + ","
                msg = msg + str(tokenBagListArr[clone[1][0]][clone[1][1]][clone[1][2]][1]) + ","
                if len(infoItems) > 0:
                    for infoItem in infoItems:
                        msg = msg + str(tokenBagListArr[clone[1][0]][clone[1][1]][clone[0][2]][itemName2Index[infoItem]]) + ","

                if msg[-1] == ",":
                    msg = msg[:-1] + "\n"
                
                f.write(msg)
                
        

    else:
        print("File not exist.")    


