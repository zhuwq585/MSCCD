import ujson, os

def getList(filePath):
    res = []
    try:
        lineTmp  = ""
        splitTmp = None
        for line in open(filePath,"r").readlines():
            if line[-1] == "\n":
                lineTmp = line[:-1]
            else:
                lineTmp = line
            
            splitTmp = line.split("@_@")
            if len(splitTmp) == 1:        
                res.append(line)
            else:
                for i in range(int(splitTmp[1])):
                    res.append(splitTmp[0])
    except FileNotFoundError:
        return None
    return res

def getList_json(filePath):
    res = []
    try:
        lineTmp  = ""
        splitTmp = None
        for line in open(filePath,"r").readlines():
            lineTmp = line if line[-1] != '\n' else line[:-1]
            
            splitTmp = lineTmp.split("@_@")
            if len(splitTmp) == 1:
                res.append(ujson.loads(line))
            else:
                for i in range(int(splitTmp[-1])):
                    res.append(ujson.loads(splitTmp[0]))
    except FileNotFoundError:
        return None
    return res

if __name__ == "__main__":
    ### config ### 
    TASK_NUM = 40
    configItem_normal = ["keywordsList", "tokenizer"]
    configItem_json   = ["inputProject", "languageExtensionName"]
    configItem_dict   = {}
    for item in configItem_normal:
        configItem_dict[item] = getList("./batchExecutionConfig/" + item)
    for item in configItem_json:
        configItem_dict[item] = getList_json("./batchExecutionConfig/" + item)
    
    ### check ###
    checkRes = True
    for item in configItem_dict:
        if len(configItem_dict[item]) != TASK_NUM:
            checkRes = False
            print("Provided batch execution configurations are not matched in TASK_NUM = " + str(TASK_NUM))
            break
        
    if checkRes:
        configObj = ujson.loads("".join(open("./config.json","r").readlines()))
        taskId = int(open("./tasks/tNum.sta","r").readlines()[0][:-1]) + 1
        # 
        for taskIndex in range(0, TASK_NUM):
            for configuredItem in configItem_json + configItem_normal:
                configObj[configuredItem] = configItem_dict[configuredItem][taskIndex]
        
            # save configFile
            with open("./config.json","w") as f:
                f.write(ujson.dumps(configObj, indent=4))
            
            # execute MSCCD
            os.system("python3 controller.py")
            
            # pairFileOutput
            os.system("python3 ./scripts/filePairOutput.py " + str(taskId) + " 1 " + configObj['inputProject'][0].split("/")[-1] + "_" + configObj['inputProject'][0].split("/")[-2] + ".txt")
            #
            taskId += 1
            

    
