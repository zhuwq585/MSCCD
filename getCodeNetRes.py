import os
LANGUAGE = ["Java","C","Python","C++"]

# Recall
PROBLEM_ID_RECALl = ['p02263', 'p00048', 'p00001', 'p00000', 'p02269', 'p02256', 'p02257', 'p02265', 'p00002', 'p00003', 'p00008', 'p00050', 'p02271', 'p00005']
PreprintedData_Folder_Path = "/root/preprintedData/"  # ..../preprintedData/

# PRECISION
Data_Folder_Path = "/root/data/" # ..../data/
PRECISION_GROUP_ID = [1,2,3]
PRECISION_SET_ID = range(0,30)


taskId = 1

with open("./inputProject","w") as f:
    with open("./outputFile","w") as outputFile:
        for language in LANGUAGE:
            # recall
            for problemId in PROBLEM_ID_RECALl:
                # f.write('["' + PreprintedData_Folder_Path + problemId + "/" + language + '"]' + "\n")
                # outputFile.write(problemId + "_" + language + ".csv@_@1\n")
                outputFile = "./CodeNetRes_MSCCD/" + language + "_" + problemId + ".csv"
                os.system("python3 scripts/blockPairOutput.py " + str(taskId) + " 1 " + outputFile)
                taskId = taskId + 1

            #precision
            for groupId in PRECISION_GROUP_ID:
                for setIndex in PRECISION_SET_ID:
                    # f.write('["' + Data_Folder_Path + str(groupId) + "/" + language+ "/" + str(setIndex) + '"]\n')
                    # outputFile.write(str(groupId) + "_" + language + "_" + str(setIndex) + ".csv@_@1\n")
                    outputFile = "./CodeNetRes_MSCCD/" + str(groupId) + "_" + language + "_" + str(setIndex) + ".csv"

                    os.system("python3 scripts/blockPairOutput.py " + str(taskId) + " 1 " + outputFile)
                    taskId = taskId + 1

    # for index in range(2, 46):
    #     f.write('["/Users/syu/workspace/BigCloneEval/ijadataset/bcb_reduced/' + str(index) + '"]' + '\n')
