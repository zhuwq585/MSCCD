import os
class InputProject():
    # data
    # Project path; file list; 
    # id-file saving
    def __init__(self, inputPathList, extNameArr):
        self.fileList    = [] # projectId-file
        self.projectList = inputPathList
        
        if len(extNameArr) <= 0:
            print('extName configuration error. Please check config.json.')
            return False
        else:
            self.__extName = set()
            for i in extNameArr:
                self.__extName.add(i)
        
        for projectId in range(len(inputPathList)):
            if self.__checkPath(inputPathList[projectId]):
                self.fileList.append(self.__addFiles(inputPathList[projectId]))
            else:
                print("path:" + inputPathList[projectId] + "not found.")
    
    def __addFiles(self, inputPath):
        res = []
        fileWalking = os.walk(inputPath)
        tmp = ''
        for path, dir_list, file_list in fileWalking:  
            for file_name in file_list: 
                tmp = os.path.abspath(path + '/' + file_name)
                if self.__ifTargetFile(tmp):
                    res.append(tmp)
        return res


    def addFile(self, filePath):
        if self.__ifTargetFile(filePath):
            self.fileList.append(filePath)

    def __ifTargetFile(self, filePath):
        extStr = os.path.splitext(filePath)[1]
        return {extStr}.issubset(self.__extName)

    def __checkPath(self,pathStr):
        return os.path.exists(pathStr)

    def saveFileList(self, folderPath):
        fileListPath = folderPath + '/fileList.txt'
        file = open(fileListPath,'w')
        for projectId in range(len(self.fileList)):
            for filePath in self.fileList[projectId]:
                file.write(str(projectId) + ',' + filePath + '\n')
        print("File list created in file:" + fileListPath)
        file.close()
