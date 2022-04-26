# This script is to find unic clone pairs between 2 result files in BigCloneEval format

import sys


def createSet(filePath):
    res = set()
    for line in open(filePath,'r').readlines():
        lineArr = line[:-1].split(',')
        fileNum1 = lineArr[1].split('.')[0]
        fileNum2 = lineArr[5].split('.')[0]

        if fileNum1 <= fileNum2:
            res.add(lineArr[0][0:1]+'-' + fileNum1+'-' + lineArr[2]+'-'+lineArr[3]+'-'+fileNum2 +'-'+ lineArr[6] + '-' + lineArr[7])
        else:
            res.add(lineArr[0][0:1] +'-'+ fileNum2+'-' + lineArr[6]+'-'+lineArr[7]+'-'+fileNum1 +'-'+ lineArr[2] + '-'+lineArr[3])


    return res



if __name__ == "__main__":
    # 21: java-java
    FILE1 = "/home/syu/workspace/MCCD/Evaluation/recall-BigCloneEval/21/resultForBCE"
    # 22: python-python
    FILE2 = "/home/syu/workspace/MCCD/Evaluation/recall-BigCloneEval/22/resultForBCE"

    set1 = createSet(FILE1)
    set2 = createSet(FILE2)

    unicPairIn1 = []
    for p in set1:
        if not p in set2:
            unicPairIn1.append(p)
    
    unicPairIn2 = []
    for p in set2:
        if not p in set1:
            unicPairIn2.append(p)

    
    # print("unic pair in p1: ")
    # print(len(unicPairIn1))
    # print(unicPairIn1)

    # print("####################")

    print("unic pair in p2: ")
    print(len(unicPairIn2))
    print(unicPairIn2)

    