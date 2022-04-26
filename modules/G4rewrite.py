# author: zhuwq
# date: 2020.10.27
# content: This class implements a feature that find the identifies in the input g4 file which is the same as anyone in Python keywords or Python runtime function names, to prevent from keywords confliction in 
#          parser generation. To make this easier, the words in comments will also be rewritten. 


# problem   type() also be rewrited
import os, sys
print(os.getcwd())
sys.path.append(os.getcwd()[:-7]+'parsers/ANTLRv4')
sys.path.append(os.getcwd()+'/parsers/ANTLRv4')
import datetime,time
from antlr4 import *
from ANTLRv4Lexer import ANTLRv4Lexer 
from ANTLRv4Parser import ANTLRv4Parser
from ANTLRv4ParserListener import ANTLRv4ParserListener


class G4Rewrite():
    pythonKeywords = set({'and','as','assert','break','class','continue','def','del','elif','else','except','finally','for','from','global','False','if','import','in','is','lambda','None','nonlocal','not','or','pass','raise','return','True','try','while','with','yield','ArithmeticError','AssertionError','AttributeError','BaseException','BlockingIOError','BrokenPipeError','BufferError','BytesWarning','ChildProcessError','ConnectionAbortedError','ConnectionError','ConnectionRefusedError','ConnectionResetError','DeprecationWarning','EOFError','Ellipsis','EnvironmentError','Exception','False','FileExistsError','FileNotFoundError','FloatingPointError','FutureWarning','GeneratorExit','IOError','ImportError','ImportWarning','IndentationError','IndexError','InterruptedError','IsADirectoryError','KeyError','KeyboardInterrupt','LookupError','MemoryError','NameError','None','NotADirectoryError','NotImplemented','NotImplementedError','OSError','OverflowError','PendingDeprecationWarning','PermissionError','ProcessLookupError','RecursionError','ReferenceError','ResourceWarning','RuntimeError','RuntimeWarning','StopAsyncIteration','StopIteration','SyntaxError','SyntaxWarning','SystemError','SystemExit','TabError','TimeoutError','True','TypeError','UnboundLocalError','UnicodeDecodeError','UnicodeEncodeError','UnicodeError','UnicodeTranslateError','UnicodeWarning','UserWarning','ValueError','Warning','ZeroDivisionError','__IPYTHON__','__IPYTHON__active','__build_class__','__debug__','__doc__','__import__','__loader__','__name__','__package__','__spec__','abs','all','any','ascii','bin','bool','bytearray','bytes','callable','chr','classmethod','compile','complex','copyright','credits','delattr','dict','dir','divmod','dreload','enumerate','eval','exec','filter','float','format','frozenset','get_ipython','getattr','globals','hasattr','hash','help','hex','id','input','int','isinstance','issubclass','iter','len','license','list','locals','map','max','memoryview','min','next','object','oct','open','ord','pow','print','property','range','repr','reversed','round','set','setattr','slice','sorted','staticmethod','str','sum','super','tuple','type','vars','zip'})

    def __rewriteStr(self, string):
    # make a prefix of 're_' in which the identify in the g4 file are same with anyone in Python
        if set({string}).issubset(self.pythonKeywords):
            return 're_'+string
        return string

    def run(self, file):
        res = ''
        inputStream= FileStream(file, encoding='UTF-8', errors='ignore')
        lexer = ANTLRv4Lexer(inputStream)
        stream = CommonTokenStream(lexer)
        parser = ANTLRv4Parser(stream)
        astTree = parser.grammarSpec()
        for token in stream.tokens[:-1]:
            if token.type == 2:
                token.text = self.__rewriteStr(token.text)
            res = res + token.text
        outputFile = open(file, 'w')
        outputFile.write(res)
        outputFile.write('\n//This file has been rewrote at ' + str(datetime.date.today()) + '  ' + time.strftime("%H:%M:%S"))
        outputFile.close()
        return True


# if __name__ == '__main__':
#     G4Rewrite().run('Hello.g4')