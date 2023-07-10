import os, datetime, time, sys, ujson
from jinja2 import Environment, FileSystemLoader
MSCCD_PATH = sys.path[0][:-8]
PAGENUM = 200
## 
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
        lineArr   = splitTmp[7].split(": :")
        startLine = int(lineArr[0])
        endLine   = int(lineArr[1])
        
        bag = {
            "startLine" : startLine,
            "endLine"   : endLine,
            "tokenNum"  : int(splitTmp[6]),
            "granularity" : int(splitTmp[3])
        }
        
        while len(res) - 1 < projectId:
            res.append([])
        while len(res[projectId]) - 1 < fileId:
            res[projectId].append([])
        res[projectId][fileId].append( bag  )
        if bagId != len(res[projectId][fileId]) - 1:
            print("err")
    
    return res


 
def htmlReportGeneration_pairs(taskId, detectionId, fileList, cloneList, bagList, outputFile):
        # data
        sourceCodeFile = {}

        report = {}
        report['CSS_PATH'] = MSCCD_PATH + "/reportTemplete/report.css"
        report['time'] = str(datetime.date.today()) + '  ' + time.strftime("%H:%M:%S")
        # report['threshold'] = str(self.taskObj.configObj['detectionThreshold'])
        report['cloneSum'] = len(cloneList)
        # report['minsize'] = str(self.taskObj.configObj['minsize'])
        report['taskId'] = taskId
        report['detectionId'] = detectionId


        cursor = 0
        pageNum = 0
        while cursor < len(cloneList):

            cloneClassesData = []
            clonePairIndex = cursor
            while clonePairIndex < cursor + PAGENUM and clonePairIndex < len(cloneList):
                cloneClass = {}
                cloneClass['cloneClassIndex'] = clonePairIndex
                # cloneClass['similarity'] = cloneList[i][2]
                # cloneClass['overlap'] = cloneList[i][3]
                clones = []
                for codeBlockIndexes in cloneList[clonePairIndex]:
                    bag = bagList[codeBlockIndexes[0]][codeBlockIndexes[1]][codeBlockIndexes[2]]


                    clone = {}
                    clone['filePath'] = fileList[codeBlockIndexes[0]][codeBlockIndexes[1]]
                    clone['position'] = str(bag['startLine']) + '-' + str(bag['endLine'])
                    clone['tokenNum'] = str(bag['tokenNum'])
                    # clone['bagIndex'] = str(j[0]) + '-' + str(j[1])
                    clone['granularity'] = str(bag['granularity'])

                    try:
                        # clone['content'] = ''.join(sourceCodeFile[clone['file']][int(bag['startLine']): int(bag['endLine']) + 1])
                        clone['content'] = sourceCodeFile[clone['file']][int(bag['startLine']) - 1: int(bag['endLine'])]
                    except KeyError:
                        file = open(clone['filePath'], 'r')
                        content = file.readlines()
                        sourceCodeFile[clone['filePath']] = content
                        # clone['content'] = ''.join(content[int(bag['startLine']): int(bag['endLine']) + 1])
                        clone['content'] = content[int(bag['startLine']) - 1: int(bag['endLine'])]
                        file.close()

                    clones.append(clone)
                cloneClass['clones'] = clones
                cloneClassesData.append(cloneClass)
                clonePairIndex += 1

            report['cloneClasses'] = cloneClassesData

            # HTML generate
            env = Environment(loader=FileSystemLoader('./'))
            template = env.get_template('reportTemplete/templete-pairs.html')
            with open(outputFile + str(pageNum) + ".html",'w') as HTMLFile:
                htmlContent = template.render(report=report)
                HTMLFile.write(htmlContent)
                HTMLFile.close()
            
            cursor += PAGENUM
            pageNum += 1
            if cursor >= len(cloneList):
                cursor = len(cloneList) - 1
## 

## 


if __name__ == '__main__':
    taskId      = sys.argv[1]
    detectionId = sys.argv[2]
    outputFile  = sys.argv[3]
    inputCloneList = None
    
    # taskId      = '2000011'
    # detectionId = '1'
    # outputFile = './test.html'
    # inputCloneList = "../csharp_crossproj_class.pair"
    
    try:
        inputCloneList = sys.argv[4]
    except IndexError:
        inputCloneList = None
    
    # taskId = "1"
    # detectionId = "1"
    # outputFile = "test.html"

    fileList  = MSCCD_PATH + "/tasks/task" + taskId + "/fileList.txt"
    cloneList = MSCCD_PATH + "/tasks/task" + taskId + "/detection" + detectionId + "/pairs.file"
    bagList   = MSCCD_PATH + "/tasks/task" + taskId + "/tokenBags"

    if os.path.exists(fileList) and os.path.exists(cloneList):
        fileListArr  = fileListGeneration(fileList)
        if inputCloneList == None:
            cloneListArr = cloneListGeneration(cloneList)
        else:
            cloneListArr = cloneListGeneration(inputCloneList)
        tokenBagListArr = tokenBagListGeneration(bagList)
        
        htmlReportGeneration_pairs(taskId, detectionId, fileListArr, cloneListArr, tokenBagListArr, outputFile)
    else:
        print("File not exist")