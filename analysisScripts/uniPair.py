import sys, os 
sys.path.append(sys.path[0][0:-16] + '/modules')
import json
from jinja2 import Environment, FileSystemLoader 
from tokenBagGeneration import TokenBagGenerationController
from DetectionTaskManagement import DetectionTaskManagement
from CloneDetection import CloneDetectionContraller

def htmlReportGeneration_pairs(cloneSets1, cloneSets2, bagCollectionArr,taskObj,dec1, dec2):
    # data
    sourceCodeFile = {}

    report = {}
    report['dec1len'] = str(len(cloneSets1))
    report['dec2len'] = str(len(cloneSets2))
    report['threshold'] = str(taskObj.configObj['detectionThreshold'])
    # report['cloneSum'] = len(cloneSets)
    report['minsize'] = str(taskObj.configObj['minsize'])
    # report['wholetime'] = str(round(timeArr[2] - timeArr[0],2))
    # report['bagtime'] = str(round(timeArr[1] - timeArr[0],2))
    # report['detectiontime'] = str(round(timeArr[1] - timeArr[0],2))
    # report['taskId'] = taskObj.taskId
    # report['detectionId'] = self.d_num + 1


    cloneClassesData1 = []
    cloneClassesData2 = []
    for i in range(len(cloneSets1)):
        cloneClass = {}
        cloneClass['cloneClassIndex'] = i
        cloneClass['similarity'] = cloneSets1[i][2]
        cloneClass['overlap'] = cloneSets1[i][3]
        clones = []
        for j in cloneSets1[i][0:2]:
            bag = bagCollectionArr[j[0]][j[1]]
            clone = {}
            clone['filePath'] = taskObj.inputObj[int(bag.fileId)]
            clone['position'] = str(bag.startLine) + '-' + str(bag.endLine)
            clone['tokenNum'] = str(bag.tokenNum)
            clone['bagIndex'] = str(j[0]) + '-' + str(j[1])
            clone['granularity'] = str(bag.granularity)

            try:
                # clone['content'] = ''.join(sourceCodeFile[clone['file']][int(bag.startLine): int(bag.endLine) + 1])
                clone['content'] = sourceCodeFile[clone['file']][int(bag.startLine) - 1: int(bag.endLine)]
            except KeyError:
                file = open(clone['filePath'], 'r')
                content = file.readlines()
                file.close()
                sourceCodeFile[clone['filePath']] = content
                # clone['content'] = ''.join(content[int(bag.startLine): int(bag.endLine) + 1])
                clone['content'] = content[int(bag.startLine) - 1: int(bag.endLine)]

            clones.append(clone)
        cloneClass['clones'] = clones
        cloneClassesData1.append(cloneClass)

    for i in range(len(cloneSets2)):
        cloneClass = {}
        cloneClass['cloneClassIndex'] = i
        cloneClass['similarity'] = cloneSets2[i][2]
        cloneClass['overlap'] = cloneSets2[i][3]
        clones = []
        for j in cloneSets2[i][0:2]:
            bag = bagCollectionArr[j[0]][j[1]]
            clone = {}
            clone['filePath'] = taskObj.inputObj[int(bag.fileId)]
            clone['position'] = str(bag.startLine) + '-' + str(bag.endLine)
            clone['tokenNum'] = str(bag.tokenNum)
            clone['bagIndex'] = str(j[0]) + '-' + str(j[1])
            clone['granularity'] = str(bag.granularity)

            try:
                # clone['content'] = ''.join(sourceCodeFile[clone['file']][int(bag.startLine): int(bag.endLine) + 1])
                clone['content'] = sourceCodeFile[clone['file']][int(bag.startLine) - 1: int(bag.endLine)]
            except KeyError:
                file = open(clone['filePath'], 'r')
                content = file.readlines()
                file.close()
                sourceCodeFile[clone['filePath']] = content
                # clone['content'] = ''.join(content[int(bag.startLine): int(bag.endLine) + 1])
                clone['content'] = content[int(bag.startLine) - 1: int(bag.endLine)]

            clones.append(clone)
        cloneClass['clones'] = clones
        cloneClassesData2.append(cloneClass)    

    report['cloneClasses1'] = cloneClassesData1
    report['cloneClasses2'] = cloneClassesData2

    # HTML generate
    env = Environment(loader=FileSystemLoader('./'))
    template = env.get_template('reportTemplete/templete-pairs-unic.html')
    with open('tasks/task' + str(taskObj.taskId) + '/report-pairs-' + str(dec1) + '---' + str(dec2) + '.html','w+') as HTMLFile:
        htmlContent = template.render(report=report)
        HTMLFile.write(htmlContent)
        HTMLFile.close()

def findSamePair(sortPair, pairs, cController, bagCollection): # pair: [bag1, bag2] 
    for i in pairs:
        if i[0][0] == sortPair[0][0] and i[1][0] == sortPair[1][0]:
            if cController.ifBagOverlap(bagCollection[i[0][0]][i[0][1]], bagCollection[sortPair[0][0]][sortPair[0][1]]) and cController.ifBagOverlap(bagCollection[i[1][0]][i[1][1]], bagCollection[sortPair[1][0]][sortPair[1][1]]):
                return i
        if i[1][0] == sortPair[0][0] and i[0][0] == sortPair[1][0]:
            if cController.ifBagOverlap(bagCollection[i[0][0]][i[0][1]], bagCollection[sortPair[1][0]][sortPair[1][1]]) and cController.ifBagOverlap(bagCollection[i[1][0]][i[1][1]], bagCollection[sortPair[0][0]][sortPair[0][1]]):
                return i

    return None


if __name__ == '__main__':
    sys.argv += [1,1,3]

    if len(sys.argv) != 4:
        print(' para error')
    else:
        taskId = sys.argv[1]
        dec1 = sys.argv[2]
        dec2 = sys.argv[3]
    # taskId = 136
    # dec1 = 1
    # dec2 = 5

    rootUrl = "/home/syu/workspace/MCCD/Project/"

    taskController = DetectionTaskManagement()
    taskObj = taskController.loadTask(taskId)
    bagCollectionArr = TokenBagGenerationController(taskObj).loadBagsFromFile()
    cController = CloneDetectionContraller(taskObj,None,None)

    dec1data = open(rootUrl + 'tasks/task'+str(taskId)+'/detection'+str(dec1)+'/pairs.file','r').readlines()
    dec1pairs = []
    for line in dec1data:
        pairArr = json.loads(line[0:-2])
        dec1pairs.append(pairArr)

    dec2data = open(rootUrl + 'tasks/task'+str(taskId)+'/detection'+str(dec2)+'/pairs.file','r').readlines()
    dec2pairs = []
    for line in dec2data:
        pairArr = json.loads(line[0:-1])
        dec2pairs.append(pairArr)

    uniPairs1 = []
    uniPairs2 = []
    #search
    for sortPair1 in dec1pairs:
        res = findSamePair(sortPair1, dec2pairs, cController, bagCollectionArr)
        if  res == None:
            uniPairs1.append(sortPair1)

    for sortPair2 in dec2pairs:
        res = findSamePair(sortPair2, dec1pairs, cController, bagCollectionArr)
        if  res == None:
            uniPairs2.append(sortPair2)

    #search over
    print('uniPairs1')
    print(uniPairs1)

    print('uniPairs2')
    print(uniPairs2)



    # htmlReportGeneration_pairs(uniPairs1,uniPairs2, bagCollectionArr, taskObj,dec1,dec2)


