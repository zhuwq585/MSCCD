LANGUAGE = ["Java","C","Python","C++"]
SETINDEX = [0,1,2,3,4,5,6,7,8,9]
#["/Users/syu/workspace/MultilingualCloneBench-CodeNet/precision/data/0/Java"]

with open("./inputProject","w") as f:
    for language in LANGUAGE:
        for setIndex in SETINDEX:
            f.write('["/Users/syu/workspace/MultilingualCloneBench-CodeNet/precision/data/' + str(setIndex) + '/' + language + '"]\n')