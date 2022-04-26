import sys, os 
sys.path.append('modules')

from Config import Config
from DetectionTaskManagement import DetectionTaskManagement
from InputManagement import InputProject


if __name__ == '__main__':
    if len(sys.argv) == 1:
        configObj = Config().getData()
        fileList = InputProject(configObj['inputProject'], configObj['languageExtensionName']).fileList
    else:
        taskId = sys.argv[1]
        taskController = DetectionTaskManagement()
        fileList = taskController.loadTask(taskId).inputObj
    print(len(fileList))
    fileNum = 0
    lineNum = 0
    for file in fileList:
        try:
            lines = open(file, 'r', encoding='utf-8').readlines()
        except UnicodeDecodeError:
            lines = open(file, 'r', encoding="unicode_escape").readlines()
        lineNum = lineNum + len(lines)
        fileNum = fileNum + 1
    
    print('fileNum:' + str(fileNum) + '___ lineNum: ' + str(lineNum))