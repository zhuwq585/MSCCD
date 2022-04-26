# to process the token frequency in the project and save it 
import os
import ujson, pickle

class GlobalTokenfrequency():
    def __init__(self, tokensDict={}, idsArray=[]):
        self.__tokens = dict(tokensDict) # [frequency, id]
        self.__id = list(idsArray)
            
    def searchFrequencyById(self, tokenId):
        try:
            return self.__tokens[self.__id[tokenId]][0]
        except:
            print('err: the tokenId ' + str(tokenId) + ' not found in GTP')
    
    def searchIdByToken(self, tokenContent):
        try:
            return self.__tokens[tokenContent][1]
        except KeyError:
            print('err: the token ' + tokenContent + ' not found in GTP.')
            return None

    def searchFrequencyByToken(self, tokenContent):
        try:
            return self.__tokens[tokenContent][0]
        except KeyError:
            print('err: the token ' + tokenContent + ' not found in GTP.')
            return None

    def addItem(self, token):
        if token in self.__tokens:
            self.__tokens[token][0] += 1
        else:
            newId = len(self.__id)
            self.__id.append(token)
            self.__tokens[token] = [1, newId]
    
    def addItemOutside(self, token, tokensDict, idsArray):
        if token in tokensDict:
            newItem = [tokensDict[token][0] + 1, tokensDict[token][1]]
            tokensDict[token]= newItem
        else:
            newId = len(idsArray)
            idsArray.append(token)
            tokensDict[token] = [1, newId]

    def addItemWithFrequency(self, token, freq):
        freq = int(freq)
        if token in self.__tokens:
            self.__tokens[token][0] += freq
        else:
            newId = len(self.__id)
            self.__id.append(token)
            self.__tokens[token] = [freq, newId]

    def saveGTP(self, taskId):
        filePath = 'tasks/task' + str(taskId) + '/gtp.file'
        with open(filePath, 'wb') as f:
            pickle.dump(self, f)
        
    def loadGTP(self, taskId):
        filePath = 'tasks/task' + str(taskId) + '/gtp.file'
        try:
            with open(filePath, 'rb') as f:
                return pickle.load(f)
        except FileNotFoundError:
            print('err: gtp.file not found')

    def loadGTPFromBagCollectionArr(self, bagCollectionArr):
        res = GlobalTokenfrequency()
        for fileBagArr in bagCollectionArr:
            if fileBagArr == None or fileBagArr == 0:
                continue
            else:
                for token in fileBagArr[0].tokens:
                    res.addItemWithFrequency(token, fileBagArr[0].tokens[token])

        return res

    def loadGTPFromFile(self, path):
        path = os.path.abspath(path)
        SEPARATOR_ITEM = "_ _"
        SEPARATOR_FREQ = ": :"
        res = GlobalTokenfrequency()
        try:
            tmp = None
            tmp2 = None
            with open(path,"r") as f:
                for tokenItem in f.readlines():
                    tmp = tokenItem.split(SEPARATOR_ITEM)[:-1]
                    for frequecnctItem in tmp:
                        tmp2 = frequecnctItem.split(SEPARATOR_FREQ)
                        res.addItemWithFrequency(tmp2[0], int(tmp2[1]))


                    # try:
                    #     if len(tmp == 2):
                    #         res.addItemWithFrequency(tmp[0], int(tmp[1]))
                    #     elif len(tmp > 2):
                    #         i = 0
                    #         while i < len(tmp):
                    #             res.addItemWithFrequency(tmp[i], tmp[i+1])
                    #             i += 2
                    # except IndexError:
                    #     print("Index Error in loadGTPFromFile")
                    #     continue
        except FileNotFoundError:
            print("GTP not found")
            return
        
        return res

    # def saveGTP(self, taskId):
    #     filePath = 'tasks/task' + str(taskId) + '/gtp.file'
    #     ujsonContent = ujson.dumps(self.__tokens)

    #     file = open(filePath,'w')
    #     file.write(ujsonContent)
    #     file.close()

    # def loadGTP(self, taskId):
    #     filePath = 'tasks/task' + str(taskId) + '/gtp.file'
    #     try:
    #         file = open(filePath, 'r')
    #         data = file.readlines()[0]
    #         gtpData = ujson.loads(data)
    #     except FileNotFoundError:
    #         print('gtp data load error')
    #         return None
    #     self.__tokens = gtpData
    #     return self

