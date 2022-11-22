import multiset
# 1: test/s156524271.java
# 2 : s602616508

def simi(mSet1, mSet2):
    intersectionA = mSet1.intersection(mSet2)
    if len(mSet1) >= len(mSet2):
        return float(len(intersectionA) / len(mSet1))
    else:
        return float(len(intersectionA) / len(mSet2))


if __name__ == "__main__":
    msccd_seg1_str = "Scanner: :3_ _NO: :1_ _import: :1_ _YES: :1_ _for: :1_ _main: :1_ _String: :1_ _while: :1_ _System: :3_ _out: :2_ _sc: :5_ _println: :2_ _java: :1_ _public: :1_ _else: :1_ _class: :1_ _if: :2_ _EOF: :1_ _10: :1_ _new: :1_ _a: :3_ _b: :3_ _static: :1_ _void: :1_ _c: :2_ _in: :1_ _count: :3_ _i: :7_ _hasNext: :1_ _nextInt: :3_ _int: :3_ _args: :1_ _0: :1_ _1: :1_ _util: :1_ _4: :1_ _Main: :1_ _20: :1"
    msccd_seg2_str = "Scanner: :3_ _NO: :1_ _import: :2_ _YES: :1_ _main: :1_ _String: :1_ _System: :3_ _out: :2_ _sc: :5_ _println: :2_ _java: :2_ _public: :2_ _else: :1_ _class: :1_ _if: :1_ _EOF: :1_ _new: :1_ _a: :2_ _b: :3_ _static: :2_ _void: :1_ _c: :2_ _in: :3_ _io: :1_ _InputStream: :2_ _nextInt: :3_ _throws: :1_ _Exception: :1_ _int: :3_ _args: :1_ _util: :1_ _Main: :1"
    scc_seg1_str = "import@@::@@1,java@@::@@1,util@@::@@1,Scanner@@::@@3,class@@::@@1,Main@@::@@1,public@@::@@1,static@@::@@1,void@@::@@1,main@@::@@1,String@@::@@1,args@@::@@1,sc@@::@@5,new@@::@@1,System@@::@@3,in@@::@@1,while@@::@@1,hasNext@@::@@1,int@@::@@3,a@@::@@3,nextInt@@::@@3,b@@::@@3,c@@::@@2,count@@::@@3,0@@::@@1,for@@::@@1,i@@::@@7,1@@::@@1,10@@::@@1,if@@::@@2,20@@::@@1,4@@::@@1,out@@::@@2,println@@::@@2,NO@@::@@1,else@@::@@1,YES@@::@@1"
    scc_seg2_str = "import@@::@@2,java@@::@@2,io@@::@@1,InputStream@@::@@2,util@@::@@1,Scanner@@::@@3,public@@::@@2,class@@::@@1,Main@@::@@1,static@@::@@2,sc@@::@@5,void@@::@@1,main@@::@@1,String@@::@@1,args@@::@@1,throws@@::@@1,Exception@@::@@1,in@@::@@3,System@@::@@3,new@@::@@1,int@@::@@3,a@@::@@2,nextInt@@::@@3,b@@::@@3,c@@::@@2,if@@::@@1,out@@::@@2,println@@::@@2,YES@@::@@1,else@@::@@1,NO@@::@@1"

    msccd_seg1 = multiset.Multiset()
    msccd_seg2 = multiset.Multiset()
    scc_seg1 = multiset.Multiset()
    scc_seg2 = multiset.Multiset()

    splitTmp = None
    for tokens in msccd_seg1_str.split("_ _"):
        splitTmp = tokens.split(": :")
        for i in range(int(splitTmp[1])):
            msccd_seg1.add(splitTmp[0])
    for tokens in msccd_seg2_str.split("_ _"):
        splitTmp = tokens.split(": :")
        for i in range(int(splitTmp[1])):
            msccd_seg2.add(splitTmp[0])

    for tokens in scc_seg1_str.split(","):
        splitTmp = tokens.split("@@::@@")
        for i in range(int(splitTmp[1])):
            scc_seg1.add(splitTmp[0])


    for tokens in scc_seg2_str.split(","):
        splitTmp = tokens.split("@@::@@")
        for i in range(int(splitTmp[1])):
            scc_seg2.add(splitTmp[0])
            

    print(  str(simi(msccd_seg1,msccd_seg2)) )            
    print(  str(simi(scc_seg1,scc_seg2)) )
    print(scc_seg1.difference(msccd_seg1))
    print(scc_seg2.difference(msccd_seg2))
    print(msccd_seg2.difference(scc_seg2))
    print(msccd_seg1.difference(scc_seg1))
