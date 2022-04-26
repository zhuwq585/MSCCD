import sys
class Logger(object):
    # type: 1: log 2: error
    def __init__(self, taskId, stream=sys.stdout, type=1):  
        self.terminal = stream
        self.taskFolder = 'tasks/task' + str(taskId)
        self.lType = type
        if taskId != None:
            try:
                if type == 1:
                    logFile = self.taskFolder + '/log.txt'
                elif type == 2:
                    logFile = self.taskFolder + '/err.txt'
                self.log = open(logFile, 'w')
            except:
                return False
    
    def write(self, msg):
        if self.lType == 1:
            self.terminal.write(msg)
        self.log.write(msg)

    def flush(self):
        pass

    def decLog(self, decFolderPath, type = 1):
        if type == 1:
            logFile = decFolderPath + '/log.txt'
        elif type == 2:
            logFile = decFolderPath + '/err.txt'
        self.log = open(logFile, 'a')