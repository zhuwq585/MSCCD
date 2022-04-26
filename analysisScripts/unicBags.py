import sys, ujson, pickle
# rootUrl = sys.path[0][0:-30]
rootUrl  = "/home/syu/workspace/MCCD/Project"
sys.path.append(rootUrl + '/modules')

from tokenBagGeneration import TokenBagGenerationController
from DetectionTaskManagement import DetectionTaskManagement


# get bagCollection1
taskId1  =  1
taskController1 = DetectionTaskManagement()
taskObj1        = taskController1.loadTask(taskId1)
tokenBagCollection1 = TokenBagGenerationController(taskObj1).loadBagsFromFile()
if tokenBagCollection1 == None:
    tokenBagCollection1 = TokenBagGenerationController(taskObj1).loadBags()
fileList1 = taskObj1.inputObj


# build dic for bagCollection1
dic1 = {}
for fileId in range(len(tokenBagCollection1)):
    fileArr = fileList1[fileId].split("/")
    fileKey = fileArr[-2][0:2] + fileArr[-1].split(".")[0]
    dic1[fileKey] = set()
    for tokenBag in tokenBagCollection1[fileId]:
        bagStr = str(tokenBag.startLine) + '-' + str(tokenBag.endLine)
        # if tokenBag.startLine == 1:
        #     bagStr = str(tokenBag.startLine) + '-' + str(tokenBag.endLine-1)
        # else:
        #     bagStr = str(tokenBag.startLine) + '-' + str(tokenBag.endLine)
        dic1[fileKey].add(bagStr)

# get bagCollection2
taskId2 = 3
tokenBagCollection2 = pickle.load(open(rootUrl+'/tasks/task'+str(taskId2)+'/bags.file','rb'))
fileList2 = ujson.loads(open(rootUrl+'/tasks/task'+str(taskId2)+'/taskData.obj','r').readlines()[0])['inputObj']

# build dic for bagCollection2
dic2 = {}
for fileId in range(len(tokenBagCollection2)):
    fileArr = fileList1[fileId].split("/")
    fileKey = fileArr[-2][0:2] + fileArr[-1].split(".")[0]
    dic2[fileKey] = set()
    for tokenBag in tokenBagCollection2[fileId]:
        bagStr = str(tokenBag.startLine) + '-' + str(tokenBag.endLine)
        dic2[fileKey].add(bagStr)

# ....
bagNumDiff = []
for fileKey in dic1:
    if len(dic1[fileKey]) != len(dic2[fileKey]):
        bagNumDiff.append(fileKey)

# find unic bag in bagCollection2
unic2 = []
for fileKey in dic2:
    for bagStr in dic2[fileKey]:
        if not bagStr in dic1[fileKey]:
            unic2.append(fileKey + ':' + bagStr)
print(unic2)


# find unic bag in bagCollection1
unic1 = []
for fileKey in dic1:
    for bagStr in dic1[fileKey]:
        if not bagStr in dic2[fileKey]:
            unic1.append(fileKey + ':' + bagStr)
print(unic1)

print()