### ver1: Do not see clone set as a requvelant class
# # convert class.file into pair.file
import os,sys,ujson

# if __name__ == "__main__":
#     inputFile = sys.argv[1]
#     outputFile = sys.argv[2]
    
#     if os.path.exists(inputFile):
#         pairs = []
        
#         with open(inputFile,"r") as f:
#             for cloneClassLine in f.readlines():
#                 cloneClass = ujson.loads(cloneClassLine)
                
#                 centerNode = cloneClass[0]
#                 index = 1
#                 while index < len(cloneClass):
#                     pairs.append([centerNode, cloneClass[index]])
#                     index += 1
                    
        
#         with open(outputFile,"w") as f:
#             for clonePair in pairs:
#                 f.write(ujson.dumps(clonePair) + "\n")


#### ver 2

def compareTokenBagId(tokenBagIdArrA, tokenBagIdArrB):
    # -1: A < B 0 A = B 1 A > B
    if tokenBagIdArrA[0] < tokenBagIdArrB[0]:
        return -1
    elif tokenBagIdArrA[0] > tokenBagIdArrB[0]:
        return 1
    else:
        if tokenBagIdArrA[1] < tokenBagIdArrB[1]:
            return -1
        elif tokenBagIdArrA[1] > tokenBagIdArrB[1]:
            return 1
        else:
            if tokenBagIdArrA[2] < tokenBagIdArrB[2]:
                return -1
            elif tokenBagIdArrA[2] > tokenBagIdArrB[2]:
                return 1
            else:
                return 0

def ifCodeCloneIdentical(cloneA, cloneB):
    if compareTokenBagId(cloneA[0],cloneB[0]) == 0 and compareTokenBagId(cloneA[1], cloneB[1]) == 0:
        return True
    else:
        return False

def ifOverlapped(addedCloneList, candicateClone):
    if compareTokenBagId(candicateClone[0], candicateClone[1]) == 0:
        return True
    
    for clone in addedCloneList:
        if ifCodeCloneIdentical(clone, candicateClone):
            return True
    
    return False

if __name__ == "__main__":
    inputFile = sys.argv[1]
    outputFile = sys.argv[2]
    
    # inputFile = 'tasks/task50002/detection11/class.file'
    # outputFile = "./test.txt"
    
    if os.path.exists(inputFile):
        pairs = []
        
        with open(inputFile,"r") as f:
            for cloneClassLine in f.readlines():
                cloneClass = ujson.loads(cloneClassLine)
                
                centerNodeIndex = 0
                while centerNodeIndex < len(cloneClass) - 1:
                    centerNode = cloneClass[centerNodeIndex]
                    index = 1
                    while index < len(cloneClass):
                        candidateClone = None
                        if compareTokenBagId(centerNode, cloneClass[index])<= 0:
                            candidateClone = [centerNode, cloneClass[index]]
                        else:
                            candidateClone = [cloneClass[index], centerNode]
                        
                        if not ifOverlapped(pairs, candidateClone):
                            pairs.append(candidateClone)
                        
                        index += 1
                    centerNodeIndex += 1
                    
        
        with open(outputFile,"w") as f:
            for clonePair in pairs:
                f.write(ujson.dumps(clonePair) + "\n")