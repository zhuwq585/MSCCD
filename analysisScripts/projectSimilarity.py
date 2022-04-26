# calculate similarity between projects using line overlap similarity
import sys
sys.path.append(sys.path[0][0:-16] + '/modules')
from Analysis import AnalysisController
from tokenBagGeneration import *
from DetectionTaskManagement import DetectionTaskManagement
from tokenBagGeneration import TokenBagGenerationController
import  ujson


if __name__ == '__main__':
    # sys.argv += [10002,1,4,5]
    for i in range(1, len(sys.argv)):
            sys.argv[i] = int(sys.argv[i])
    TASK_ID      = sys.argv[1]
    DETECTION_ID = sys.argv[2]
    PID_A        = sys.argv[3]
    PID_B        = sys.argv[4]

    taskObj = DetectionTaskManagement().loadTask(TASK_ID)
    bagCollectionArr = TokenBagGenerationController(taskObj).loadBagsFromFile()
    
    # get result list
    ClonePairs = []
    ResultList = "/home/syu/workspace/MSCCD_ALL/Project/tasks/task" + str(TASK_ID) + "/detection" + str(DETECTION_ID) + "/pairs.file"
    ListFile = open(ResultList, 'r')
    for pairLine in ListFile.readlines():
        ClonePairs.append( ujson.loads(pairLine[:-1]))
    
    # find out all pair between target projects
    TargetPairs = []
    for clonePair in ClonePairs:
        if clonePair[0][0] == PID_A and clonePair[1][0] == PID_B:
            TargetPairs.append(clonePair)
        elif clonePair[0][0] == PID_B and clonePair[1][0] == PID_A:
            TargetPairs.append(clonePair)
        
    # similarity calculation
    
    Pro_A_AllLines = 0
    for tokenBagArr in bagCollectionArr[PID_A]:
        tmp = tokenBagArr[0]
        Pro_A_AllLines += tmp.endLine - tmp.startLine + 1
        
    Pro_B_AllLines = 0
    for tokenBagArr in bagCollectionArr[PID_B]:
        tmp = tokenBagArr[0]
        Pro_B_AllLines += tmp.endLine - tmp.startLine + 1    
    

    Pro_A_FileDict = [0] * len(bagCollectionArr[PID_A])
    Pro_B_FileDict = [0] * len(bagCollectionArr[PID_B])
    
    for clonePair in TargetPairs:
        if clonePair[0][0] == PID_A:
            tmpA = bagCollectionArr[clonePair[0][0]][clonePair[0][1]][clonePair[0][2]]
            tmpB = bagCollectionArr[clonePair[1][0]][clonePair[1][1]][clonePair[1][2]]
        else:
            tmpA = bagCollectionArr[clonePair[1][0]][clonePair[1][1]][clonePair[1][2]]
            tmpB = bagCollectionArr[clonePair[0][0]][clonePair[0][1]][clonePair[0][2]]

        if Pro_A_FileDict[tmpA.fileId] == 0:
            fileSize = bagCollectionArr[tmpA.projectId][tmpA.fileId][0].endLine - bagCollectionArr[tmpA.projectId][tmpA.fileId][0].startLine + 1
            tmpArr = [0] * fileSize
            Pro_A_FileDict[tmpA.fileId] = tmpArr
        
        for lineNumber in range(tmpA.startLine-1, tmpA.endLine):
            Pro_A_FileDict[tmpA.fileId][lineNumber] = 1
                
        if Pro_B_FileDict[tmpB.fileId] == 0:
            fileSize = bagCollectionArr[tmpB.projectId][tmpB.fileId][0].endLine - bagCollectionArr[tmpB.projectId][tmpB.fileId][0].startLine + 1
            tmpArr = [0] * fileSize
            Pro_B_FileDict[tmpB.fileId] = tmpArr
        
        for lineNumber in range(tmpB.startLine-1, tmpB.endLine):
            Pro_B_FileDict[tmpB.fileId][lineNumber] = 1
            
    
    Pro_A_ClonedLines = 0
    for lineArr in Pro_A_FileDict:
        for line in lineArr:
            if line == 1:
                Pro_A_ClonedLines += 1
    
    
    Pro_B_ClonedLines = 0
    for lineArr in Pro_B_FileDict:
        for line in lineArr:
            if line == 1:
                Pro_B_ClonedLines += 1
        
        
    print("cloned lines in project " + str(PID_A) + ": " + str(Pro_A_ClonedLines))
    print("cloned lines in project " + str(PID_B) + ": " + str(Pro_B_ClonedLines))
    
    maxLength = max(Pro_A_AllLines, Pro_B_AllLines)
    simi1 = Pro_A_ClonedLines / maxLength
    simi2 = Pro_B_ClonedLines / maxLength
    
    print(" Similarity: " + str(simi1) + " - " +str(simi2))