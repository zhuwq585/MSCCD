import os,sys,ujson
MSCCD_PATH = sys.path[0][:-8]


def cloneListGeneration(clonePath):
    res = []
    for cloneLine in open(clonePath, "r").readlines():
        res.append(ujson.loads(cloneLine[:-1]))
    
    return res

if __name__ == "__main__":
    taskId      = sys.argv[1]
    detectionId = sys.argv[2]
    outputFile  = sys.argv[3]
    
    cloneList = MSCCD_PATH + "/tasks/task" + taskId + "/detection" + detectionId + "/pairs.file"
    res = []
    
    if os.path.exists(cloneList):
        cloneListArr = cloneListGeneration(cloneList)
        for clone in cloneListArr:
            if len(clone) == 2: # pair
                if clone[0][0] != clone[1][0]:
                    res.append(clone)
            else: # class
                cursor = 1
                cloneClass = []
                cloneClass.append(clone[0])
                while cursor <= len(clone) - 1:
                    if clone[0][0] != clone[cursor][0]:
                        cloneClass.append(clone[cursor])
                    cursor += 1
                if len(cloneClass) > 1:
                    res.append(cloneClass)
                
                    
    with open(outputFile,"w") as f:
        for clone in res:
            f.write(ujson.dumps(clone)+"\n")
    
    print("Size: " + str(len(res)))
            