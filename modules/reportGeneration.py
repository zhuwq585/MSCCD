import os, datetime, time, sys
from jinja2 import Environment, FileSystemLoader

## 

## 

## 

## 


if __name__ == '__main__':
    taskId      = sys.argv[1]
    detectionId = sys.argv[2]

    ROOT_ABSPATH = os.path.abspath(sys.path[0])
    
    taskFolder = ROOT_ABSPATH + '/' + 'tasks/task' + str(taskId)
    if not os.path.exists(taskFolder):
        print("task not found.")
        quit()
    
    detectionFolder = taskFolder + '/detection' + str(detectionId)
    if not os.path.exists(detectionFolder):
        print("detection not found.")
        quit()
    
