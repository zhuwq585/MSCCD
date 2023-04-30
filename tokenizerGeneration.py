# step 1: init
# del * in folder parser

# step 2: config reading and copy files

# step 3: parser generation

# step 4: ParserController generation

# step 5: pack the tokenizer into jar file
import sys, os 
sys.path.append(sys.path[0] + '/modules')
from Config import Config

def parserControllerGeneration(grammarName, path, startRule):
    LEXIERNAME = grammarName + "Lexer"
    PARSERNAME = grammarName + "Parser"

    str = """package org.nagoya_u.ertl.sa;import java.nio.file.Files;import java.nio.file.Paths;import java.util.List;import org.antlr.v4.runtime.*;  import org.antlr.v4.runtime.tree.*;import org.nagoya_u.ertl.sa.parser.*;public class ParserController { public ParseTree pTree; public List<Token> lexicalUnits; ParserController(){  } public boolean run(String filePath){try{if (Files.lines(Paths.get(filePath)).count() > 30000){ System.out.println("too big file. ");    return false; }CharStream input = CharStreams.fromFileName(filePath);""" 
    str = str + LEXIERNAME + """ lexer = new """ 
    str = str + LEXIERNAME + """(input);\nCommonTokenStream tokens = new CommonTokenStream(lexer);\ntokens.getNumberOfOnChannelTokens();\n""" 
    str = str + PARSERNAME + """ parser = new """ + PARSERNAME + """(tokens);\nParseTree tree = parser.""" + startRule + """();pTree = tree;lexicalUnits = tokens.getTokens();}catch (Exception e){ System.out.println("File not found.");return false;}return true;}public ParseTree getPTree(){return pTree;}public List<Token> getLexicalUnits(){return lexicalUnits; }public void reset(){ pTree  = null;lexicalUnits = null; }}"""

    # str = """import java.io.IOException;\nimport java.util.List;\nimport org.antlr.v4.runtime.*;\nimport org.antlr.v4.runtime.tree.*;\npublic class ParserController {public ParseTree pTree;\npublic List<Token> lexicalUnits;\nParserController(){  } public void run(String filePath){try{CharStream input = CharStreams.fromFileName(filePath);\n  """ + LEXIERNAME + """ lexer = new """ + LEXIERNAME + """(input);\nCommonTokenStream tokens = new CommonTokenStream(lexer);\n""" + PARSERNAME + """ parser = new """ + PARSERNAME + """(tokens);\nParseTree tree = parser.""" + startRule + """();\npTree = tree;\n  lexicalUnits = tokens.getTokens();\n }catch (IOException e){ System.out.println("File not found.");\n }} public ParseTree getPTree(){  return pTree;\n } public List<Token> getLexicalUnits(){return lexicalUnits;\n    }    public void reset(){ pTree  = null;\n  lexicalUnits = null;\n }}"""

    filePath = path + '/ParserController.java'
    # filePath = path + "/tmp/ParserController.java"
    file = open(filePath, "w")
    file.write(str)
    file.close()

def addPackageDeclaration(rpath):
    fileList = []
    if os.path.exists(rpath):
        fileWalking = os.walk(rpath)
        for path, dir_list, file_list in fileWalking:
            for file_name in file_list:
                filePathTmp = os.path.abspath(path+"/"+file_name)
                if os.path.splitext(filePathTmp)[1] == ".java":
                    fileList.append(filePathTmp)
    
    for filePath in fileList:
        file = open(filePath, "r")
        content = "package org.nagoya_u.ertl.sa.parser;\n"
        for line in file.readlines():
            content = content + line
        file = open(filePath, 'w')
        file.write(content)


if __name__ == "__main__":

    CONFIG_FILE        = "./parserConfig.json"
    rootAbspath        = os.path.abspath(sys.path[0])
    buildingAbspath    = rootAbspath + '/modules/msccd_tokenizer/src/main/java/org/nagoya_u/ertl/sa'
    parserBuildingPath = buildingAbspath + "/parser"

    # rootAbspath     = os.path.abspath(sys.path[0])
    # buildingAbspath = rootAbspath + '/runtime'

    print("############################")
    print("#### Tokenizer generation started.")
    print("############################")

    # step1
    print("#### Clear building folder.")
    os.system("bash modules/shells/clearTokenizerBuildingFolder.sh " + parserBuildingPath)
    
    #step2
    print("#### Copy resources to building folder.")
    configObj   = Config(CONFIG_FILE).getData()
    parserSourcePath  = os.path.abspath(configObj['parser'])
    
    os.system("bash modules/shells/cpResources.sh " + parserSourcePath + " " + parserBuildingPath)
    # os.system("bash modules/shells/cpResources.sh " + parserSourcePath + " " + buildingAbspath)

    # step3 
    print("#### Generate a parser by ANTLR.")
    os.system("bash modules/shells/javaParserGeneration.sh " + parserBuildingPath)
    # os.system("bash modules/shells/javaParserGeneration.sh " + buildingAbspath)

    addPackageDeclaration(parserBuildingPath)

    # step4 
    print("#### Tokenizer generation. ")
    parserControllerGeneration(configObj['grammarName'] , buildingAbspath, configObj["startSymbol"])

    # step5
    os.system("bash modules/shells/package.sh " + rootAbspath + " " + configObj["grammarName"])

    print("###################")

    if os.path.exists("./tokenizers/" + configObj['grammarName'] + "/" +  configObj['grammarName'] + "_tokenizer.jar"):
        print("#### Tokenizer for " + str(configObj['grammarName']) + " is generated in ./tokenizers/" + str(configObj['grammarName']))
        print("#### You can use this tokenizer by configuring the field 'tokenizer' of ./config.json to '" + str(configObj['grammarName']) + "'")
        print("#### Over")
    else:
        print("Failed to generate tokenizer.")
        print("Check error report below.")
        print("Over")
    print("###################")
    # os.system("bash modules/shells/runtimeCreation.sh " + rootAbspath)
    pass



