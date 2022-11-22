LANGUAGE = ["Java","C","Python","C++"]
SETINDEX = [0,1,2,3,4]
GROUPINDEX = [2,3,4]
#["/Users/syu/workspace/MultilingualCloneBench-CodeNet/precision/data/0/Java"]
# ["/Users/syu/workspace/BigCloneEval/ijadataset/bcb_reduced/2"]
with open("./inputProject","w") as f:
    for language in LANGUAGE:
        for setIndex in SETINDEX:
            for groupId in GROUPINDEX:
                f.write('["/Users/syu/workspace/MultilingualCloneBench-CodeNet/precision/data/group' + str(groupId) + "/" + str(setIndex) + '/' + language + '"]\n')

    # for index in range(2, 46):
    #     f.write('["/Users/syu/workspace/BigCloneEval/ijadataset/bcb_reduced/' + str(index) + '"]' + '\n')