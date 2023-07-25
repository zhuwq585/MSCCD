from flask import *
import ujson, sys, os
from Manager import Manager


app = Flask(__name__)
# app.app_context()

app.secret_key = 'secret'


MSCCD_ROOT  = sys.path[0][:-15]


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
    g.manager = None

    
    
@app.route('/index', methods=['GET', 'POST'])
@app.route('/', methods=['GET', 'POST'])
def index():
    return render_template('index.html')


# @app.route("/getMaxClass", methods=['GET','POST'])
# def getMaxClass():
#     taskId = request.form.get('taskId')
#     detectionId = request.form.get("detectionId")
#     if g.manager == None:
#         g.manager = Manager(taskId, detectionId,cloneOrigin)
#     elif g.manager.taskId != taskId or g.manager.detectionId != detectionId:
#         g.manager = Manager(taskId, detectionId,cloneOrigin)
    
#     return None

@app.route("/getClassesByBoth", methods=['GET','POST'])
def getClassesByBoth():
    taskId = request.form.get('taskId')
    detectionId = request.form.get("detectionId")
    lSize = int(request.form.get("lSize"))
    rSize = int(request.form.get('rSize'))
    gValue = int(request.form.get("gValue"))

    classId = 0 if request.form.get("classId") == None else int(request.form.get("classId"))
    pairId = 0 if request.form.get("classId") == None else int(request.form.get("pairId"))
    
    cloneOrigin = request.form.get("cloneOrigin")
    
    if g.manager == None or g.manager.taskId != taskId or g.manager.detectionId != detectionId or cloneOrigin != g.manager.cloneOrigin:
        g.manager = Manager(taskId, detectionId,cloneOrigin)
    
    if g.manager.CloneListByBoth == None or g.manager.lSize != lSize or g.manager.rSize != rSize:
        g.manager.generateCloneListByBoth(gValue,lSize,rSize)
    return render_template("templete-pairsBoth.html", report = g.manager.generateReport(classId, pairId,[gValue, lSize,rSize]))


@app.route("/getClassesBySize", methods=['GET','POST'])
def getClassesBySize():
    taskId = request.form.get('taskId')
    detectionId = request.form.get("detectionId")
    lSize = int(request.form.get("lSize"))
    rSize = int(request.form.get('rSize'))
    classId = 0 if request.form.get("classId") == None else int(request.form.get("classId"))
    pairId = 0 if request.form.get("classId") == None else int(request.form.get("pairId"))
    
    cloneOrigin = request.form.get("cloneOrigin")
    
    if g.manager == None or g.manager.taskId != taskId or g.manager.detectionId != detectionId or cloneOrigin != g.manager.cloneOrigin:        
        g.manager = Manager(taskId, detectionId,cloneOrigin)
    
    if g.manager.CloneListBySize == None or g.manager.lSize != lSize or g.manager.rSize != rSize:
        g.manager.generateCloneListBySize(lSize,rSize)
    
    return render_template("templete-pairsSize.html", report = g.manager.generateReport(classId, pairId,[lSize,rSize]))


@app.route("/getClassesByGValue", methods=['GET','POST'])
def getPairByGValue():
    taskId = request.form.get('taskId')
    detectionId = request.form.get("detectionId")
    print(request.form.get("gValue"))
    gValue = int(request.form.get("gValue"))
    classId = 0 if request.form.get("classId") == None else int(request.form.get("classId"))
    pairId = 0 if request.form.get("classId") == None else int(request.form.get("pairId"))
    
    cloneOrigin = request.form.get("cloneOrigin")
    
    if g.manager == None or g.manager.taskId != taskId or g.manager.detectionId != detectionId or cloneOrigin != g.manager.cloneOrigin:
        g.manager = Manager(taskId, detectionId,cloneOrigin)
    
    if g.manager.CloneListByGranularity == None:
        g.manager.generateCloneListByGValue()
    
    return render_template("templete-pairsGValue.html", report = g.manager.generateReport(classId, pairId,[gValue]))
    

@app.route("/getClasses", methods=['GET', 'POST'])
def getPair():
    taskId = request.form.get('taskId')
    detectionId = request.form.get("detectionId")
    classId = 0 if request.form.get("classId") == None else int(request.form.get("classId"))
    pairId = 0 if request.form.get("classId") == None else int(request.form.get("pairId"))


    print("####Inported: taskId: " + str(taskId) + " detectionId: " + str(detectionId) + " classId: " + str(classId) + " pairId: " + str(pairId))
    
    cloneOrigin = request.form.get("cloneOrigin")
    if g.manager == None or g.manager.taskId != taskId or g.manager.detectionId != detectionId or cloneOrigin != g.manager.cloneOrigin:        
        g.manager = Manager(taskId, detectionId,cloneOrigin)
  
    
    
    return render_template("templete-pairs.html", report = g.manager.generateReport(classId, pairId))

if __name__ == "__main__":
    app.run()