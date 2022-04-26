# author: zhuwq
# data: 2020.10.27
# content: This class is to check if the parser is ready to be used. If not, initial the parser.

# from Project.modules.TreeStructure import Tree
from G4rewrite import G4Rewrite
import os, sys

os.chdir(sys.path[0])
class ParserManagement():
    # change patterns of parser status
    ChangeSta_keywordAdded = 1
    ChangeSta_g4rewritten = 2
    ChangeSta_parserGenerated = 4


    def __init__(self, parserPath, grammarName):
        self._parserPath = parserPath
        self._staPath = parserPath + '/psr.sta'
        self.__grammarName = grammarName
        self.sta = self.__getSta()

    def parserReady(self):
        if self.__ifReady():
            return True
        else:
            while self.sta != 7:
                if not self.__handler():
                    return False
            return True

    def __ifReady(self):
        # read status from file. Use it when start a process.
        return self.sta == 7

    def __getSta(self):
        try:
            staFile = open(self._staPath,'r')
        except FileNotFoundError:
            print('sta file not found')
            createStaFile = open(self._parserPath+'/psr.sta','w')
            createStaFile.write('0')
            createStaFile.close()
            print('sta file created')
            return False
        else:
            sta = int(staFile.readlines()[0].replace('\n',''))
            staFile.close()
            return sta
    
    def __changeSta(self, changePatten):
        try:
            staFile = open(self._staPath,'w')
        except FileNotFoundError:
            print('sta file not found')
            return False
        else:
            newSta = self.sta | changePatten
            staFile.write(str(newSta))
            staFile.close()
            self.sta = newSta
            return True

    def __handler(self): # Boolean
        if self.sta & 1 == 0:
            # keyword file not found
            print(self._parserPath + '/' + self.__grammarName + '.reserved')
            if os.path.exists(self._parserPath + '/' + self.__grammarName + '.reserved'):
                self.__changeSta(self.ChangeSta_keywordAdded)
            else:
                print('keyword file not found in ' + self._parserPath + ', progrom terminated')
                return False
        elif self.sta & 2 == 0:
            # g4 file has not be rewritten
            if self.__g4rewrite():
                self.__changeSta(self.ChangeSta_g4rewritten)
            else:
                print('Something wrong in g4 file rewrite. Program terminated')
                return False
        elif self.sta & 4 == 0: 
            # the parser has not been generated
            if self.__parserGeneration():
                self.__changeSta(self.ChangeSta_parserGenerated)
            else:
                print('Something wrong when parser generation.')
                return False
        return True
    def __g4rewrite(self): # Boolean
        rewriteHanler = G4Rewrite()
        
        g4FileList = []
        files = os.walk(self._parserPath)
        for path,dir_list,file_list in files:  
            for file_name in file_list: 
                 if os.path.splitext(file_name)[1] == '.g4':
                     g4FileList.append(file_name)
        
        ifSuc = 1
        for i in g4FileList:
            tmp = rewriteHanler.run(self._parserPath+'/'+i)
            ifSuc = ifSuc & int(tmp)
        return ifSuc
    
    def __parserGeneration(self): # Boolean
        shellPath = 'modules/shells/parserGeneration.sh'
        if os.path.exists(shellPath):
            os.system('bash ' + shellPath + ' ' + self._parserPath)
            if self.__parserCheck():
                return True
            else:
                print('Parser generation unsuccess, please check the information.')
                return False
        else:
            print('error: parserGeneration.sh not found')
            return False

    def __parserCheck(self):
        lexerPath = self._parserPath + '/' + self.__grammarName + 'Lexer.py'
        paserPath = self._parserPath + '/' + self.__grammarName + 'Parser.py'    
        if os.path.exists(lexerPath) and os.path.exists(paserPath):
            return True
        else:
            return False   