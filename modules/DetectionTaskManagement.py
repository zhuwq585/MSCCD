import os, ujson, sys
from typing import Tuple

class DetectionTaskManagement():
    def __init__(self):
        self.__taskNumber = self.__getTaskNumber()
        self.taskFolder = ""

    def __getTaskNumber(self):
        try:
            tStaFile = __file__[:-34]+'tasks/tNum.sta'
            staFile = open(tStaFile,'r')
            # staFile = open('tasks/tNum.sta','r')
        except FileNotFoundError :
            print('err: tNum.sta not found')
            return None
        else:
            sta = int(staFile.readlines()[0].replace('\n',''))
            staFile.close()
            return sta

    def __addTaskNumber(self):
        # be called only when createTask
        try:
            staFile = open('tasks/tNum.sta','w')
        except FileNotFoundError:
            print('err: tNum.sta not found')
            return False
        else:
            staFile.write(str(self.__taskNumber + 1))
            staFile.close()
            self.__taskNumber += 1
        
    
    def createTask(self, configObj, inputObj):
        newTaskId = int(self.__getTaskNumber()) + 1
        path = self.__initTaskFolder(newTaskId)
        self.__addTaskNumber()
        return DetectionTask(newTaskId, configObj, inputObj, path)


    def __initTaskFolder(self, newTaskId):
        path = 'tasks/task' + str(newTaskId)
        try:
            os.mkdir(path)
        except FileExistsError:
            pass
        self.taskFolder = os.path.abspath(path)
        staFile = open(path+'/d_Num.str','w')
        staFile.write('0')
        staFile.close()
        return path

    def saveTask(self, taskObj):
        saveObj = {"taskId":taskObj.taskId, "configObj":taskObj.configObj, "inputObj" : taskObj.inputObj}
        ujsonContent = ujson.dumps(saveObj)
        
        savePath = self.taskFolder + '/taskData.obj'
        file = open(savePath,'w')
        file.write(ujsonContent)
        file.close()

    def loadTask(self, taskId):
        loadPathFolder = os.path.dirname(__file__)[:-7] + 'tasks/task' + str(taskId)
        try:
            file = open(loadPathFolder + '/taskData.obj','r')
            data = file.readlines()[0] 
            taskObj = ujson.loads(data)
        except FileNotFoundError:
            print('loading task data wrong')
            return None
    
        return DetectionTask(taskObj['taskId'], taskObj['configObj'], taskObj['inputObj'], loadPathFolder)

class DetectionTask():
    def __init__(self, taskId, configObj, inputObj, path):
        self.taskId = taskId
        self.configObj = configObj
        try:
            self.inputObj = inputObj.fileList
        except AttributeError:
            self.inputObj = inputObj

        # keywordsSet = self.__createKeywordsSet()
        # if keywordsSet == None:
        #     return False
        # else:
        #     self.keywordsSet = keywordsSet

        self.taskFolderPath = path
        try:
            inputObj.saveFileList(self.taskFolderPath)
        except Exception:
            print("DetectionTaskManagemant.py:92 need to be modified  ")
    def getTaskId(self):
        return self.taskId

    def getConfigObj(self):
        return self.configObj
    
    def getInputObj(self):
        return self.inputObj

    def __createKeywordsSet(self):
        try:
            keywordPath = os.path.dirname(__file__)[:-7] + self.configObj['parser'] + '/' + self.configObj['grammarName'] + '.reserved'
            file = open(keywordPath,'r')
        except FileNotFoundError:
            print('keywords list file not found')
            return None
        
        kData = file.readlines()
        res = set()
        for i in kData:
            res.add(i.replace('\n',''))
        return res
    
    def getDetectionNum(self):
        try:
            numFile = open('tasks/task'+str(self.taskId) + '/d_Num.str')
        except FileNotFoundError:
            print('detection number file not found')
            return None
        
        return int(numFile.readlines()[0])