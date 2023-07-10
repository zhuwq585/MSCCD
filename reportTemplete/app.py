from flask import *
import ujson, sys, os



app = Flask(__name__)
# app.app_context()

app.secret_key = 'secret'


MSCCD_ROOT  = sys.path[0][:-15]


##

def cloneListGeneration(clonePath):
    res = []
    for cloneLine in open(clonePath, "r").readlines():
        res.append(ujson.loads(cloneLine[:-1]))
    
    return res
    
def fileListGeneration(fileListPath):
    res = []
    splitTmp = None
    for dataLine in open(fileListPath,"r").readlines():
        splitTmp = dataLine[:-1].split(",")
        projectId = int(splitTmp[0])
        while len(res) - 1 < projectId:
            res.append([])
        res[projectId].append(splitTmp[1])

    
    return res

def tokenBagListGeneration(sourcePath):
    # not gain all the informations, only line number range
    res = []
    splitTmp = None
    for sourceline in open(sourcePath,"r").readlines():
        splitTmp  = sourceline[:-1].split("@ @")
        projectId = int(splitTmp[0])
        fileId    = int(splitTmp[1])
        bagId     = int(splitTmp[2])
        lineArr   = splitTmp[7].split(": :")
        startLine = int(lineArr[0])
        endLine   = int(lineArr[1])
        
        bag = {
            "startLine" : startLine,
            "endLine"   : endLine,
            "tokenNum"  : int(splitTmp[6]),
            "granularity" : int(splitTmp[3])
        }
        
        while len(res) - 1 < projectId:
            res.append([])
        while len(res[projectId]) - 1 < fileId:
            res[projectId].append([])
        res[projectId][fileId].append( bag  )
        if bagId != len(res[projectId][fileId]) - 1:
            print("err")
    
    return res

def getCodeContent(filePath, startLine, endLine):
    if os.path.exists(filePath):
        try:
            return open(filePath,"r").readlines()[startLine - 1:endLine]
        except IsADirectoryError:
            print(filePath)
            return "file not found"
    else:
        return "file not found"

def getCodeObj(classId, pairId,index):
    res = {}
    if index == 0:
        bagPosition = g.CloneList[classId][0]
    else:
        bagPosition = g.CloneList[classId][pairId]
        
    tokenBag = g.BagList[bagPosition[0]][bagPosition[1]][bagPosition[2]]
    
    
    
    # filePath
    filePath = g.FileList[bagPosition[0]][bagPosition[1]]

    res['filePath'] = filePath
    # position
    startLine = tokenBag['startLine']
    endLine = tokenBag['endLine']
    res['position'] = str(startLine) + " - " + str(endLine)
    # tokenNum
    res['tokenNum'] = str(tokenBag['tokenNum'])
    # granularity
    res['granularity'] = str(tokenBag['granularity'])
    
    res['content'] = getCodeContent(filePath,startLine,endLine)
    
    return res

def getReport(classId, pairId,taskId, detectionId):
    res = {
        "clones" : []
    }
    
    res['classSum'] = len(g.CloneList)
    res['classSize'] = len(g.CloneList[classId])
    res['classId'] = classId
    res['pairId'] = pairId
    
    res['clones'].append(getCodeObj(classId,pairId,0))
    res['clones'].append(getCodeObj(classId,pairId,1))
    res['taskId'] = taskId
    res['detectionId'] = detectionId
    
    return res

@app.before_request
def init():
    #global 
    g.TaskId      = None
    g.DetectionId = None
    g.FileList    = None
    g.CloneList   = None
    g.BagList     = None
    
    
@app.route('/index', methods=['GET', 'POST'])
def index():
    return render_template('index.html')


@app.route("/getPair", methods=['GET', 'POST'])
def getPair():
    if request.method == 'POST':
        taskId = request.form.get('taskId')
        detectionId = request.form.get("detectionId")
        classId = 0 if request.form.get("classId") == None else int(request.form.get("classId"))
        pairId = 0 if request.form.get("classId") == None else int(request.form.get("pairId"))


        print("####Inported: taskId: " + str(taskId) + " detectionId: " + str(detectionId) + " classId: " + str(classId) + " pairId: " + str(pairId))
        
        if g.FileList == None or g.CloneList == None or g.BagList == None or taskId != g.TaskId or g.DetectionId!= detectionId:
            g.TaskId = taskId
            g.DetectionId = detectionId
            print("generate FileList(...) for task " + str(g.TaskId))
            g.FileList = fileListGeneration(MSCCD_ROOT + "/tasks/task" + str(g.TaskId) + "/fileList.txt")
            g.BagList = tokenBagListGeneration(MSCCD_ROOT + "/tasks/task" + str(g.TaskId) + "/tokenBags")
            g.CloneList = cloneListGeneration(MSCCD_ROOT + "/tasks/task" + str(g.TaskId) + "/detection" + str(g.DetectionId) + "/pairs.file")
            # classId = 0
            # pairId  = 1
        
        
        
        
        
        return render_template("templete-pairs.html", report = getReport(classId, pairId,taskId,detectionId))