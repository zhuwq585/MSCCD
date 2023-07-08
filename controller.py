import sys, os 
sys.path.append(sys.path[0] + '/modules')

# from ParserManagement import ParserManagement
from Config import Config
from DetectionTaskManagement import DetectionTaskManagement
from InputManagement import InputProject
from reportManagement import ReportController
from Logger import Logger
import pickle, time

class MainController():
    def __init__(self):
        pass

    def launch(self):
        print("################################################")
        print("#### Multilingual Syntactic Code Clone Detector")
        print("################################################")
        
        timeStart = time.time()
                
        if len(sys.argv) == 2:
            taskObj = self.createTask_new()
            if taskObj == None:
                print('#### Can not get taskObj. Detector terminated.')
                return
        else:
            taskId = sys.argv[2]
            
            try:
                newDetectionThreshold = float(sys.argv[3])
            except IndexError:
                newDetectionThreshold = None
            
            try:
                newMinsize = int(sys.argv[4])
            except IndexError:
                newMinsize = None
            
            taskController = DetectionTaskManagement()
            taskObj        = taskController.loadTask(taskId)
            taskObj.configObj['detectionThreshold'] = newDetectionThreshold if newDetectionThreshold != None else taskObj.configObj['detectionThreshold']
            taskObj.configObj['minTokens'] = newMinsize if newMinsize != None else taskObj.configObj['minTokens']


        mode = sys.argv[1]
        
        reportController = ReportController(taskObj)
        decFolderPath    = reportController.getDecFolderpath()
        if len(sys.argv) == 1:
            sys.stdout.decLog(decFolderPath)
            sys.stderr.decLog(decFolderPath,2)
        else:
            sys.stdout = Logger(taskObj.taskId)
            sys.stdout.decLog(decFolderPath )
            sys.stderr = Logger(taskObj.taskId, sys.stderr, 2)
            sys.stderr.decLog(decFolderPath ,2)

        if taskObj == None:
            print('Err: Failed to load task' + str(taskId))
            return False

        # Clone Detection
        print("################################################")
        print("#### Code clone detection.")
        print("################################################")
        print('#### Starting detection with threshold ' + str(taskObj.configObj['detectionThreshold']) + ' ,minsize: ' + str(taskObj.configObj['minTokens']))        
        timeBagGeneration = time.time()

       
        # detector parameters
        # outputFolder: decFolderPath
        tokenBagSourcePath   = taskObj.taskFolderPath + '/tokenBags'
        minToken             = taskObj.configObj['minTokens']
        similarity_threahold = taskObj.configObj['detectionThreshold']
        thread_num           = taskObj.configObj['threadNum_detection']
        max_round            = taskObj.configObj['maxRound']
        #####

        os.system("java -Xmx32g -jar modules/msccd_detector.jar" + ' ' + decFolderPath + ' ' + tokenBagSourcePath + ' ' + str(minToken) + ' ' + str(similarity_threahold) + " " + str(thread_num) + " " + str(max_round) + " " + mode)

        timeFinish = time.time()
        
        # Report 
        reportController.reportGeneration([timeStart,timeBagGeneration,timeFinish])




    def createTask_new(self): # Boolean
        
        print('#### Starting by creating a new task.')
        configObj = Config("./config.json").getData()
        if configObj == None:
            print("#### Unsuccess to get congurations from config.json")
            return None
       
        inputObj       = InputProject(configObj["inputProject"], configObj["languageExtensionName"])

        taskController = DetectionTaskManagement()
        taskObj        = taskController.createTask(configObj, inputObj) 
        taskController.saveTask(taskObj) # need to be refactoried   ########
        inputObj.saveFileList(taskObj.taskFolderPath)
        print('#### Task created. (TaskId:' + str(taskObj.taskId) + ') Check the data in tasks/task' + str(taskObj.taskId) + '/taskData.obj')

        print("################################################")
        print("#### Token bag generation")
        print("################################################")
                
        sys.stdout = Logger(taskObj.taskId)
        sys.stderr = Logger(taskObj.taskId, sys.stderr, 2)


        para_mintoken       = taskObj.configObj['minTokensForBagGeneration']
        para_fileList       = os.path.abspath(taskObj.taskFolderPath + '/fileList.txt')
        para_keywords       = os.path.abspath(taskObj.configObj['keywordsList'] )
        para_outputFilePath = os.path.abspath(taskObj.taskFolderPath) + '/tokenBags'
        para_threadNum      = taskObj.configObj['threadNum_tokenizer']
        tokenizer           = os.path.abspath("./tokenizers/" + taskObj.configObj['tokenizer'] + "/" + taskObj.configObj['tokenizer'] + "_tokenizer.jar")
        
        
        os.system("java -Xmx4800m -jar " + tokenizer + ' 1 ' + str(para_mintoken) + ' ' + para_fileList + ' ' + para_keywords + " " + para_outputFilePath + " " + str(para_threadNum))


        print("#### Finished.")
        return taskObj
        



if __name__ == "__main__":
    MainController().launch()
