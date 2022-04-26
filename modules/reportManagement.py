import os, datetime, time
from jinja2 import Environment, FileSystemLoader 

class ReportController():
    def __init__(self, taskObj):
        self.taskObj = taskObj

        # get current detection number
        if not self.__getDetectionNum():
            return False
        
        # create new folder
        self.__createDetectionFolder(self.d_num + 1)
    
    def reportGeneration(self, timeArr, clonePairs=None, bagCollectionArr=None):
        # firstly, print the result to make it seem faster 
        # self.__resultPrint(clonePairs)
        
        # save the taskinfo(depth, threshold)
        self.__saveTaskinfo(timeArr)

        # save the detection result
        # self.__saveDetectionRes(clonePairs)

        # generate the HTML report

        # self.htmlReportGeneration_pairs(clonePairs,bagCollectionArr,timeArr)
        
        print('Check the report in ' + self.newDecFolder)

    def htmlReportGeneration(self, cloneSets, bagCollectionArr, timeArr):
        # data
        sourceCodeFile = {}

        report = {}
        report['time'] = str(datetime.date.today()) + '  ' + time.strftime("%H:%M:%S")
        report['threshold'] = str(self.taskObj.configObj['detectionThreshold'])
        report['cloneSum'] = len(cloneSets)
        report['minsize'] = str(self.taskObj.configObj['minsize'])
        report['wholetime'] = str(round(timeArr[2] - timeArr[0],2))
        report['bagtime'] = str(round(timeArr[1] - timeArr[0],2))
        report['detectiontime'] = str(round(timeArr[2] - timeArr[1],2))
        report['taskId'] = self.taskObj.taskId
        report['detectionId'] = self.d_num + 1


        cloneClassesData = []
        for i in range(len(cloneSets)):
            cloneClass = {}
            cloneClass['cloneClassIndex'] = i
            clones = []
            for j in cloneSets[i]:
                bag = bagCollectionArr[j[0]][j[1]]
                clone = {}
                clone['filePath'] = self.taskObj.inputObj[int(bag.fileId)]
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
            cloneClassesData.append(cloneClass)

        report['cloneClasses'] = cloneClassesData

        # HTML generate
        env = Environment(loader=FileSystemLoader('./'))
        template = env.get_template('reportTemplete/templete.html')
        with open(self.newDecFolder+'/report.html','w+') as HTMLFile:
            htmlContent = template.render(report=report)
            HTMLFile.write(htmlContent)
            HTMLFile.close()


    def htmlReportGeneration_pairs(self, cloneSets, bagCollectionArr, timeArr):
        # data
        sourceCodeFile = {}

        report = {}
        report['time'] = str(datetime.date.today()) + '  ' + time.strftime("%H:%M:%S")
        report['threshold'] = str(self.taskObj.configObj['detectionThreshold'])
        report['cloneSum'] = len(cloneSets)
        report['minsize'] = str(self.taskObj.configObj['minsize'])
        report['wholetime'] = str(round(timeArr[2] - timeArr[0],2))
        report['bagtime'] = str(round(timeArr[1] - timeArr[0],2))
        report['detectiontime'] = str(round(timeArr[2] - timeArr[1],2))
        report['taskId'] = self.taskObj.taskId
        report['detectionId'] = self.d_num + 1


        cloneClassesData = []
        for i in range(len(cloneSets)):
            cloneClass = {}
            cloneClass['cloneClassIndex'] = i
            cloneClass['similarity'] = cloneSets[i][2]
            cloneClass['overlap'] = cloneSets[i][3]
            clones = []
            for j in cloneSets[i][0:2]:
                bag = bagCollectionArr[j[0]][j[1]]
                clone = {}
                clone['filePath'] = self.taskObj.inputObj[int(bag.fileId)]
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
            cloneClassesData.append(cloneClass)

        report['cloneClasses'] = cloneClassesData

        # HTML generate
        env = Environment(loader=FileSystemLoader('./'))
        template = env.get_template('reportTemplete/templete-pairs.html')
        with open(self.newDecFolder+'/report-pairs.html','w+') as HTMLFile:
            htmlContent = template.render(report=report)
            HTMLFile.write(htmlContent)
            HTMLFile.close()


    def __saveDetectionRes(self, clonePairs):
        # filePath = self.newDecFolder + '/clones.file'
        # file = open(filePath, 'w')
        
        # if len(cloneClasses) == 0:
        #     file.write('No clones detected \n')

        # for i in range(len(cloneClasses)):
        #     file.write('Clone class ' + str(i) + ':')
        #     file.write(str(cloneClasses[i]) + ' \n')
        #     file.write('---- \n')
        
        # file.close()

        filePath = self.newDecFolder + '/pairs.file'
        file = open(filePath, 'w')
        
        if len(clonePairs) == 0:
            file.write('No clones detected \n')

        for i in range(len(clonePairs)):
            file.write(str(clonePairs[i]) + ' \n')
        file.close()

    def __saveTaskinfo(self, timeArr):
        filePath = self.newDecFolder + '/info.obj'
        file = open(filePath, 'w')
        file.write('Time: ' + str(datetime.date.today()) + '  ' + time.strftime("%H:%M:%S") + '\n')
        file.write('DetectionThreshold:' + str(self.taskObj.configObj['detectionThreshold']) + '\n')
        file.write('Bag generation time cost: ' + str(timeArr[1] - timeArr[0]) + 's\n')
        file.write('Clone detection time cost: ' + str(timeArr[2] - timeArr[1]) + 's\n')
        file.write('Time cost: ' + str(timeArr[2] - timeArr[0]) + 's\n')
        file.close()

    def __resultPrint(self, clonePairs):
        print(str(len(clonePairs)) + ' clones pairs are found.')
        # if len(cloneClasses) == 0:
        #     print('No clones detected')
        #     return True

        # for i in range(len(cloneClasses)):
        #     print('Clone class ' + str(i) + ':')
        #     print(str(cloneClasses[i]))
        #     print('----')


    def __getDetectionNum(self):
        filePath = 'tasks/task'+str(self.taskObj.taskId) + '/d_Num.str'
        try:
            file = open(filePath, 'r')
        except FileNotFoundError:
            print('Detection status file not found. faild to save detection report.')
            return False
        
        d_num = int(file.readlines()[0].replace('\n',''))
        self.d_num = d_num
        return True

    def __setDetectionNum(self, newNum):
        filePath = 'tasks/task'+str(self.taskObj.taskId) + '/d_Num.str'
        file = open(filePath, 'w')
        file.write(str(newNum))
        file.close()
    
    def __createDetectionFolder(self, dId):
        folderPath = 'tasks/task'+str(self.taskObj.taskId) + '/detection' + str(dId)
        try:
            os.mkdir(folderPath)
        except FileExistsError:
            return False

        self.__setDetectionNum(dId)
        self.newDecFolder = folderPath
        return True
    
    def getDecFolderpath(self):
        return self.newDecFolder
