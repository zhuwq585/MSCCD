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
    minSize     = int(sys.argv[3])
    try:
        maxSize     = int(sys.argv[4])
    except IndexError:
        maxSize = 100000000
    
    # taskId      = '10001'
    # detectionId = '1'
    # minSize     = 10
    
    
    cloneList = MSCCD_PATH + "/tasks/task" + taskId + "/detection" + detectionId + "/pairs_cross.file"
    res = []
    
    if os.path.exists(cloneList):
        cloneListArr = cloneListGeneration(cloneList)
        for cloneIndex in range(len(cloneListArr)):
            if len(cloneListArr[cloneIndex]) > minSize and len(cloneListArr[cloneIndex]) < maxSize:
                print("id: " + str(cloneIndex) + " size: "+ str(len(cloneListArr[cloneIndex])))
                
                    
