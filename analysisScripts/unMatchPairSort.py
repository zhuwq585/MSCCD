###############
# This script is to find out the clone pairs that were not detected by MCCD
#
###############
import sys,os
import pickle
import ujson

# configuration ############
Data_Folder      = '10-3-0.9-1'
Project_Path     = os.getcwd()[:-15]
TaskId           = 202
DetectionId      = 2
Functionality_id = 10
sys.path.append(Project_Path + 'modules')

############################

# functions ################
def getSubdirectory(urlStr):
    arr = urlStr.split('/')
    return (arr[-2],arr[-1])

def convertTaskResult(taskId, detectionId, Project_Path):
    res = []
    try:
        tokenBagCollection = pickle.load(open(Project_Path+'tasks/task'+str(taskId)+'/bags.file','rb'))
        fileList = ujson.loads(open(Project_Path+'tasks/task'+str(taskId)+'/taskData.obj','r').readlines()[0])['inputObj']
        result = open(Project_Path+'tasks/task'+str(taskId)+'/detection'+str(detectionId) + '/pairs.file', 'r')
        for resultLine in result.readlines():
            resultArr = ujson.loads(resultLine[0:-1])
            cf1_subdir,cf1_filename = getSubdirectory(fileList[resultArr[0][0]])
            cf2_subdir,cf2_filename = getSubdirectory(fileList[resultArr[1][0]])
            cf1Bag = tokenBagCollection[resultArr[0][0]][resultArr[0][1]]
            cf2Bag = tokenBagCollection[resultArr[1][0]][resultArr[1][1]]
            cf1_leftline = cf1Bag.startLine
            cf1_endline = cf1Bag.endLine
            cf2_leftline = cf2Bag.startLine
            cf2_endline = cf2Bag.endLine

            res.append([str(Functionality_id)+'/'+cf1_subdir+'/'+cf1_filename , str(cf1_leftline) , str(cf1_endline) , str(Functionality_id)+'/'+cf2_subdir+'/'+cf2_filename , str(cf2_leftline) , str(cf2_endline)])

            if cf1_leftline == 186 and cf1_endline == 207 and cf2_leftline == 398 and cf2_endline == 419:
                print('dasdasd')
    except:
        print('ERR in task' + str(taskId))
    return res
def coverageMatcher(m_start, m_end, s_start, s_end): 
    m_start = int(m_start)
    m_end = int(m_end)
    s_start = int(s_start)
    s_end = int(s_end)
    if m_start <= s_start and m_end >= s_end:
        if (m_end-m_start+1) / (s_end-s_start+1) >= 0.7:
            return True
        else:
            return False
    else:
        return False
############################

# get BCB data #############
referenceClone = open(Data_Folder+'/clones.csv','r').readlines()
for line in range(len(referenceClone)):
    referenceClone[line] = referenceClone[line][:-1].split(',')
############################

# get MCCD result ##########
mccdClone = convertTaskResult(TaskId,DetectionId,Project_Path)
############################

# find out unmatched pairs #
unmatchedPair_m = []
unmatchedPair_s = []
matchedPair = []

for mPair in mccdClone:
    matched = 0
    for rPair in referenceClone:
        if mPair[0] == rPair[0]:
            if mPair[3] == rPair[3]:
                if coverageMatcher(mPair[1],mPair[2],rPair[1], rPair[2]) and coverageMatcher(mPair[4],mPair[5],rPair[4], rPair[5]):
                    matched = 1
                    matchedPair.append(mPair)
                    rPair.append(0)
                    continue
        if mPair[0] == rPair[3]:
            if mPair[3] == rPair[0]:
                if coverageMatcher(mPair[1],mPair[2],rPair[4], rPair[5]) and coverageMatcher(mPair[4],mPair[5],rPair[1], rPair[2]):
                    matched = 1
                    matchedPair.append(mPair)
                    rPair.append(0)
                    continue
    if matched == 0:
        unmatchedPair_m.append(mPair)

for pair in referenceClone:
    if len(pair) == 6:
        unmatchedPair_s.append(pair[0:6])
############################

# output ###################
print('unmatched pairs in sourcerercc:' + str(len(unmatchedPair_s)) + '\n')
print('unmatched pairs in mccd:' + str(len(unmatchedPair_m)) + '\n')
print('matched pairs:' + str(len(matchedPair)))
resFile = open(Data_Folder+'/unmatched_s.csv','w')
for pair in unmatchedPair_s:
    resFile.write(",".join(pair))
    resFile.write('\n')
resFile = open(Data_Folder+'/matched.csv','w')
for pair in matchedPair:
    resFile.write(",".join(pair))
    resFile.write('\n')
resFile = open(Data_Folder+'/matched_m.csv','w')
for pair in unmatchedPair_m:
    resFile.write(",".join(pair))
    resFile.write('\n')
############################

# copy unmatched files #####
