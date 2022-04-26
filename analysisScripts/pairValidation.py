import sys, os 
sys.path.append(sys.path[0][0:-16] + '/modules')

from Analysis import AnalysisController
from tokenBagGeneration import *
from DetectionTaskManagement import DetectionTaskManagement
from tokenBagGeneration import TokenBagGenerationController
# sys.argv += [202,0,22,1,40]

def getSizeFromTokenDict(dict):
    size = 0
    for i in dict:
        size += int(dict[i])
    return size

def getUnicToken(dictA, dictB):
    unicA = []
    unicB = []
    for token in dictA:
        if not token in dictB:
            unicA.append(token)
    for token in dictB:
        if not token in dictA:
            unicB.append(token)
    
    return (unicA, unicB)

if __name__ == '__main__':
    # if len(sys.argv) != 6:
    #     print('paraError')
    # else:
    
        for i in range(1, len(sys.argv)):
            sys.argv[i] = int(sys.argv[i])
        taskObj = DetectionTaskManagement().loadTask(sys.argv[1])
        bagCollectionArr = TokenBagGenerationController(taskObj).loadBagsFromFile()
        try:
            bagA = bagCollectionArr[sys.argv[2]][sys.argv[3]][sys.argv[4]]
            bagB = bagCollectionArr[sys.argv[5]][sys.argv[6]][sys.argv[7]]
        except IndexError:
            print(IndexError)


        uA, uB = getUnicToken(bagA.tokens, bagB.tokens)
        print(uA)
        print('B')
        print(uB)
        simi, overlap = AnalysisController().simiCalculation(bagA,bagB)
        print(str(simi) + ' ... ' + str(overlap))