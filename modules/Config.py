import ujson

# from pathlib import Path
class Config:
    def __init__(self, filePath):
        try:
            with open(filePath,"r") as file:
                self.__data = ujson.loads(file.read())
        except FileNotFoundError:
            print('Configuration file not found.')
            return None
    
    def setAbsUrl(self, absUrl):
        for i in self.__data["files"]:
                self.__data["files"][i] = absUrl + '/' + self.__data["files"][i]
        return self
        
    def getData(self):
        if self.__verifidation():
            return self.__data
        else:
            return None
    
    def __verifidation(self):
        return True
        if self.__data['minTokens'] <= 0:
            print('err: the configuration item minsize is invalid.')
            return False
        
        if self.__data['detectionThreshold'] > 1 or self.__data['detectionThreshold'] <= 0:
            print('err: the configuration item detectionThreshold is invalid.')
            return False       

        return True
# print(Config().getData())