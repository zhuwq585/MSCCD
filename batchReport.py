import os

SET_LIST = [1,2,3]
LANGUAGE = "C++"
GROUP_LIST = range(0,30)

taskId = 2271



for setid in SET_LIST:
    for groupid in GROUP_LIST:
        os.system("python3 ./scripts/filePairOutput.py " + str(taskId) + " 1 "  + str(setid) + "_" + LANGUAGE + "_" + str(groupid) + ".txt")
        
        
        taskId+=1
