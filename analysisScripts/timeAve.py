import sys, os 
sys.path.append(sys.path[0][0:-16] + '/modules')
import json

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print(' para error')
    else:
        taskId = sys.argv[1]
    try:
        dataFile = open('tasks/task'+str(taskId)+'/time.file','r')
        data = dataFile.readlines()
        dataFile.close()

        paserTime = 0
        tBagGenTime = 0
        file = 0
        for line in data:
            timeArr = line[0:-1].split(' ')
            paserTime += float(timeArr[1])
            tBagGenTime += float(timeArr[2])
            file += 1
        
        print( str(paserTime / file))
        print('....')
        print( str(tBagGenTime / file))
    except FileNotFoundError:
        print('file not found')