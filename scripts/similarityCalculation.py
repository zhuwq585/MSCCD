## MSCCD don not output similarity (shared tokens) for detected code clone. (Detection stoped when similarity higher than threshold)
## Similarity data is useful for clone analysis 
## This script is used to calculate for pairs.file 

import ujson, os, sys, multiset
MSCCD_ROOT = sys.path[0][:-8]

def cloneListGeneration(taskId,detectionId):
    clonePath = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/detection" + str(detectionId) + "/pairs.file"
    res = []
    for cloneLine in open(clonePath, "r").readlines():
        res.append(ujson.loads(cloneLine[:-1]))
        
    return res

def tokenBagListGeneration(taskId):
    # not gain all the informations, only line number range
    sourcePath = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/tokenBags"
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
        tokensStr = splitTmp[8]
        
        bag = {
            "startLine" : startLine,
            "endLine"   : endLine,
            "tokenNum"  : int(splitTmp[6]),
            "granularity" : int(splitTmp[3]),
            "tokensSet" : multiset.Multiset()
        }
        
        for tokens in tokensStr.split("_ _"):
            tokenSplitTmp = tokens.split(": :")
            if len(tokenSplitTmp) == 2:
                for i in range(int(tokenSplitTmp[1])):
                    bag['tokensSet'].add(tokenSplitTmp[0])
        
        while len(res) - 1 < projectId:
            res.append([])
        while len(res[projectId]) - 1 < fileId:
            res[projectId].append([])
        res[projectId][fileId].append( bag  )
        if bagId != len(res[projectId][fileId]) - 1:
            print("err")
    
    return res

def overlapSimi(mSet1, mSet2):
    intersection = mSet1.intersection(mSet2)
    
    return round(float(len(intersection) / len(mSet1)),2) if len(mSet1) >= len(mSet2) else round(float(len(intersection) / len(mSet2)),2)


if __name__ == "__main__":
    taskId = sys.argv[1]
    detectionId = sys.argv[2]
    
    outputFile = MSCCD_ROOT + "/tasks/task" + str(taskId) + "/detection" + str(detectionId) + "/similarity.csv"
    
    cloneList = cloneListGeneration(taskId, detectionId)
    bagList   = tokenBagListGeneration(taskId)
    
    with open(outputFile,"w") as f:
        for cloneIndex in range(len(cloneList)):
            bagA = bagList[cloneList[cloneIndex][0][0]][cloneList[cloneIndex][0][1]][cloneList[cloneIndex][0][2]]
            bagB = bagList[cloneList[cloneIndex][1][0]][cloneList[cloneIndex][1][1]][cloneList[cloneIndex][1][2]]
            
            simi = overlapSimi(bagA["tokensSet"], bagB["tokensSet"])
            
            f.write(str(cloneIndex) + "," + str(simi) + "\n")
    
    print("Similarity logged in " + outputFile)
            
        
    
    