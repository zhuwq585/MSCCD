# MSCCD: a grammar pluggable code clone detecter

## Features

Coming soon.

See our [paper](https://arxiv.org/pdf/2204.01028.pdf) (accepted by ICPC2022).

## Environment dependence

We tested MSCCD on Ubuntu 18.04LTS and MacOS Monterey. 

MSCCD mainly depends on:
+ Python v3.6.9
+ Java v1.8 
+ Maven v3.8.5
+ jinja2 (pip3)

We added some interfaces and methods to ANTLR4.8 and packaged a .jar file for MSCCD. Please install the provided antlr-4.8-modified.jar to your local maven repository: 

`mvn install:install-file -Dfile=./lib/antlr-4.8-modified.jar -DgroupId=org.nagoya_u.ertl.sa -DartifactId=antlr-v4.8-modified -Dversion=4.8 -Dpackaging=jar`

## Generate a tokenizer for the target language

First, edit *./parserConfig.json* :

| item | description |
| --- | --- |
|parser | The path of the grammar folder, in which includes g4 files and sometimes java programs.|
|grammarName|The grammar name defined in the g4 file. It can also be checked in pom.xml (for grammars from grammarsv4)|
|startSymbol| Can be easily checked in pom.xml (entryPoint) or the g4 file|

Then, generate the tokenizer by:

`python3 tokenizerGeneration.py `


## Configure the tool

We can configure the tool by *./config.json*. Here are the items:

| item | description |
| --- | --- |
|inputProject|A list of paths. Each path presents a project you want to detect.|
|keywordsList|The path of the keywordslist.|
|languageExtensionName|A list of the extension names of the target language.|
|minTokens|The minimum size of the token bag in clone detection.|
|minTokensForBagGeneration|The minimum size of the token bag in tokenization. A smaller value will provide a larger range of token bag sizes in clone detection; a bigger one will make the tokenizer faster when you don’t want small bags.|
|detectionThreshold|The similarity threshold with a number in the range(0,1), which means 0% to 100%.
|maxRound|The max granularity value to detect.|
|tokenizer|The name of generated tokenizer. It is the same as “grammarName” in ./parserConfig.json |
|threadNum_tokenizer||
|threadNum_detection||


## Execute MSCCD

Users may always need to do several detections for the same project. So we can save the necessary data in a task object to save time for the execution next time.

### Execute for the first time
By this part, we will execute the tool by generating a new task from the configuration file.

1 Edit the *config.json* file, and check the grammar file, keyword list file, and your input file.

2 Run by `python3 controller.py`, and just wait for the result.

3 Check the information in *tasks/task[taskId]/*, for each execution, there will be a folder named *detection** to save the result files

### Execute from a generated task
By this part, we will execute the tool from a generated task. We can easily change the detection granularity(required) and threshold(optional) by command.

Just run it by **python3 controller.py [taskId] ([statementThreshold])**. 

For example, `python3 controller.py 1` means excute from tasks/task1. `python3 controller.py 2 0.9` means excute from tasks/task2, and set the detectionThreshold to 0.9

## Comming soon

+ Speed up 
+ Analysis scripts to make the detection results easier to read and use

