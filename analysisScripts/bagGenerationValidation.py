import sys, os 
sys.path.append(sys.path[0][0:-16] + '/modules')

from tokenBagGeneration import *
from DetectionTaskManagement import DetectionTaskManagement
from tokenBagGeneration import TokenBagGenerationController

def sBagGeneration(str):
    s_bag = {}
    tokensArr = str.split('@#@')[1].split(',')
    for tokenStr in tokensArr:
        tokenArr = tokenStr.split('@@::@@')
        s_bag[tokenArr[0]] = tokenArr[1]
    return s_bag

def getSizeFromTokenDict(dict):
    size = 0
    for i in dict:
        size += int(dict[i])
    return size

def run(s_bag_content, m_bag_content):
    taskObj = DetectionTaskManagement().loadTask(sys.argv[1])
    m_bag = TokenBagGenerationController(taskObj).loadBags()[sys.argv[2]][sys.argv[3]].tokens
    s_bag = TokenBagGenerationController(taskObj).loadBags()[sys.argv[4]][sys.argv[5]].tokens
    # m_bag= sBagGeneration(m_bag_content)
    # s_bag = sBagGeneration(s_bag_content)
    # size 
    mSize = getSizeFromTokenDict(m_bag)
    sSize = getSizeFromTokenDict(s_bag)
    print(mSize  == sSize)
    # unic token
    m_unic = []
    s_unic = []
    for token in m_bag:
        if not token in s_bag:
            m_unic.append(token)

    for token in s_bag:
        if not token in m_bag:
            s_unic.append(token)

    # file print 
    file = open('m_bag.txt','w')
    for token in m_bag:
        file.write( str(token) + ' _ ' + str(m_bag[token]) + '\n')
    file.close()

    file = open('s_bag.txt','w')
    for token in s_bag:
        file.write( str(token) + ' _ ' + str(s_bag[token]) + '\n')
    file.close()

    file = open('s_unic.txt','w')
    for token in s_unic:
        file.write( token + ' _ ' + str(s_bag[token]) + '\n')
    file.close()

    file = open('m_unic.txt','w')
    for token in m_unic:
        file.write( token + ' _ ' + str(m_bag[token]) + '\n')
    file.close()

    pass



if __name__ == '__main__':
    s_bag_content = '1,197,7723,469,fc609a586e24500adcf9c4e18b2a5660@#@CsvReader@@::@@182,all@@::@@2,setDelimiter@@::@@3,getHeaderCount@@::@@1,extends@@::@@1,getRawRecord@@::@@74,test2@@::@@1,ByteBuffer@@::@@22,setUseComments@@::@@2,Test@@::@@4,setTextQualifier@@::@@3,outputStream@@::@@1,test7@@::@@1,true@@::@@15,Object@@::@@4,Jr@@::@@6,0@@::@@113,finally@@::@@2,getMessage@@::@@5,writeRecord@@::@@5,junit@@::@@6,columns@@::@@1,invoke@@::@@3,get@@::@@148,assertEquals@@::@@455,void@@::@@108,999@@::@@1,util@@::@@1,ical@@::@@1,IOException@@::@@10,import@@::@@25,@Test@@::@@105,icane@@::@@1,temp@@::@@7,quotes@@::@@24,ArrayList@@::@@5,t3@@::@@6,method@@::@@15,try@@::@@17,test54@@::@@1,test57@@::@@1,test56@@::@@1,test51@@::@@1,test50@@::@@1,test52@@::@@1,println@@::@@8,IllegalArgumentException@@::@@7,99999@@::@@1,the@@::@@36,getClass@@::@@3,tearDown@@::@@2,readRecord@@::@@164,3L@@::@@4,fail@@::@@4,close@@::@@128,Rider@@::@@15,append@@::@@8,index@@::@@1,said@@::@@9,Run@@::@@16,headers@@::@@4,Bruce@@::@@12,getName@@::@@9,4@@::@@9,3@@::@@49,r@@::@@75,toString@@::@@26,closed@@::@@3,it@@::@@34,new@@::@@117,July@@::@@3,public@@::@@111,ings@@::@@1,csvreader@@::@@2,C@@::@@2,createNewFile@@::@@1,xfa@@::@@4,error@@::@@3,setRecordDelimiter@@::@@9,equals@@::@@2,here@@::@@9,getRecordDelimiter@@::@@4,100@@::@@6,101@@::@@4,getCaptureRawRecord@@::@@5,0L@@::@@53,generateString@@::@@24,actual@@::@@3,ESCAPE_MODE_DOUBLED@@::@@2,test12@@::@@1,conta@@::@@2,test15@@::@@1,u0041@@::@@4,delimiter@@::@@3,getTextQualifier@@::@@4,test79@@::@@1,test78@@::@@1,test77@@::@@1,test76@@::@@1,bob@@::@@9,test74@@::@@1,test73@@::@@1,test72@@::@@1,test71@@::@@1,test70@@::@@1,test146@@::@@1,test147@@::@@1,test144@@::@@1,PrintWriter@@::@@10,test143@@::@@1,crazy@@::@@1,private@@::@@3,test149@@::@@1,test82@@::@@1,test83@@::@@1,boolean@@::@@2,nmore@@::@@2,test87@@::@@1,test84@@::@@1,Reader@@::@@3,10000@@::@@3,exceptionThrown@@::@@3,test89@@::@@1,Method@@::@@9,java@@::@@18,x41@@::@@4,to@@::@@6,contains@@::@@22,add@@::@@2,been@@::@@3,throw@@::@@1,u0AFA@@::@@4,StringBuffer@@::@@2,expected@@::@@8,Barber@@::@@8,more@@::@@1,Adagio@@::@@7,Writer@@::@@2,testAnnotation@@::@@6,xFA@@::@@4,StringBuilder@@::@@8,else@@::@@1,setTrimWhitespace@@::@@2,8@@::@@6,Str@@::@@1,20000@@::@@1,catch@@::@@16,setEscapeMode@@::@@22,an@@::@@2,Starting@@::@@1,endRecord@@::@@23,parse@@::@@69,exception@@::@@1,Ch@@::@@1,r2@@::@@3,f@@::@@6,this@@::@@3,setup@@::@@2,getSafetySwitch@@::@@2,6L@@::@@1,as@@::@@24,n@@::@@54,test19@@::@@1,test18@@::@@1,newInstance@@::@@1,can@@::@@7,v@@::@@4,test11@@::@@1,test10@@::@@1,test13@@::@@1,property@@::@@3,CsvWriter@@::@@62,test14@@::@@1,test17@@::@@1,test16@@::@@1,test120@@::@@1,test121@@::@@1,test122@@::@@1,test123@@::@@1,test124@@::@@1,io@@::@@14,stream@@::@@97,is@@::@@26,Charset@@::@@53,backslash@@::@@5,escaped@@::@@12,Brian@@::@@5,somefilethatdoesntexist@@::@@2,in@@::@@26,ight@@::@@1,getDelimiter@@::@@7,failed@@::@@2,lengths@@::@@2,write@@::@@55,f@@::@@2,1@@::@@263,writer@@::@@181,FileOutputStream@@::@@2,getForceQualifier@@::@@2,100001@@::@@5,csv@@::@@12,assertTrue@@::@@113,test24@@::@@1,UTF@@::@@6,nio@@::@@2,isPublic@@::@@2,test26@@::@@1,ByteArrayInputStream@@::@@5,reflect@@::@@2,4th@@::@@3,test115@@::@@1,characters@@::@@2,data@@::@@152,test75@@::@@1,test33@@::@@1,test32@@::@@1,test31@@::@@1,test30@@::@@1,test37@@::@@1,test36@@::@@1,test35@@::@@1,test34@@::@@1,i@@::@@20,com@@::@@2,test39@@::@@1,test38@@::@@1,user_id@@::@@12,After@@::@@2,Read@@::@@2,8859@@::@@45,123@@::@@4,does@@::@@1,File@@::@@6,getCurrentRecord@@::@@85,tearDowns@@::@@2,M�nchen@@::@@2,test22@@::@@1,getAnnotation@@::@@5,test1@@::@@1,test3@@::@@1,charset@@::@@3,test5@@::@@1,test4@@::@@1,quoted@@::@@11,test6@@::@@1,test9@@::@@1,test8@@::@@1,setForceQualifier@@::@@3,Hey@@::@@9,getHeaders@@::@@4,5L@@::@@1,test145@@::@@1,comma@@::@@16,SafetySwitch@@::@@3,bunch@@::@@1,Assert@@::@@640,field@@::@@33,character@@::@@6,Mac@@::@@6,getUseTextQualifier@@::@@4,test46@@::@@1,test47@@::@@1,test44@@::@@1,test45@@::@@1,test42@@::@@1,test43@@::@@1,test40@@::@@1,test41@@::@@1,o101@@::@@4,main@@::@@1,InputStreamReader@@::@@7,Done@@::@@1,test48@@::@@1,test49@@::@@1,isStatic@@::@@2,return@@::@@1,greater@@::@@2,read@@::@@1,Maximum@@::@@3,fileName@@::@@6,test148@@::@@1,2L@@::@@6,getComment@@::@@4,test173@@::@@1,nline@@::@@8,Adag@@::@@1,name@@::@@12,userid@@::@@4,testClass@@::@@7,test81@@::@@1,ield@@::@@2,t@@::@@45,setups@@::@@4,DisposeCalled@@::@@4,readLine@@::@@3,AllTests@@::@@2,setSafetySwitch@@::@@4,test85@@::@@1,some@@::@@23,System@@::@@8,200010@@::@@3,u0afa@@::@@4,getColumnCount@@::@@85,test23@@::@@1,static@@::@@3,ex@@::@@30,exceeded@@::@@3,Expected@@::@@1,Parameter@@::@@7,test88@@::@@1,ider@@::@@1,out@@::@@5,setCaptureRawRecord@@::@@2,test55@@::@@1,String@@::@@82,for@@::@@17,getEscapeMode@@::@@4,avoid@@::@@3,Samuel@@::@@8,úૺúૺ@@::@@2,getCause@@::@@3,per@@::@@1,1L@@::@@16,re@@::@@3,stuff@@::@@24,tests@@::@@2,reader@@::@@820,Set@@::@@3,Class@@::@@3,be@@::@@7,None@@::@@1,escapedi@@::@@1,This@@::@@25,readHeaders@@::@@2,args@@::@@1,Ignore@@::@@3,getModifiers@@::@@2,if@@::@@12,test113@@::@@1,org@@::@@6,byte@@::@@24,Modifier@@::@@5,super@@::@@1,Strings@@::@@7,thrown@@::@@2,on@@::@@16,flush@@::@@1,r1@@::@@4,8L@@::@@1,column@@::@@7,of@@::@@7,4L@@::@@2,test58@@::@@1,length@@::@@3,000@@::@@6,expecting@@::@@3,100000@@::@@12,test86@@::@@1,Before@@::@@2,throws@@::@@105,already@@::@@3,tblah@@::@@2,setUseTextQualifier@@::@@20,ISO@@::@@45,wrap@@::@@21,FileInputStream@@::@@2,getUseComments@@::@@2,has@@::@@3,setHeaders@@::@@2,decode@@::@@21,ESCAPE_MODE_BACKSLASH@@::@@24,2@@::@@100,modifiers@@::@@6,record@@::@@4,a@@::@@53,Exception@@::@@123,test137@@::@@1,test136@@::@@1,test135@@::@@1,FileNotFoundException@@::@@2,test138@@::@@1,Kn@@::@@1,but@@::@@24,test91@@::@@1,test90@@::@@1,R@@::@@1,z@@::@@4,Boswell@@::@@6,FailingReader@@::@@4,OutputStreamWriter@@::@@4,line@@::@@8,holder@@::@@12,than@@::@@3,count@@::@@5,b@@::@@14,Love@@::@@16,Classical@@::@@7,Toni@@::@@4,double@@::@@28,expectedException@@::@@6,zAAAAA@@::@@2,inputStream@@::@@1,blah@@::@@20,matter@@::@@24,toByteArray@@::@@25,getTrimWhitespace@@::@@2,Peter@@::@@4,delete@@::@@3,false@@::@@34,assertException@@::@@15,test132@@::@@1,int@@::@@11,isQualified@@::@@1,d065@@::@@4,test131@@::@@1,doesn@@::@@24,ins@@::@@2,skipRecord@@::@@1,somefile@@::@@1,exist@@::@@1,Th@@::@@2,null@@::@@31,getIndex@@::@@5,test25@@::@@1,char@@::@@2,test27@@::@@1,test20@@::@@1,test21@@::@@1,Chicane@@::@@15,quote@@::@@6,not@@::@@9,nb@@::@@1,7L@@::@@1,test28@@::@@1,test29@@::@@1,skipLine@@::@@1,instance@@::@@7,Knight@@::@@15,writeComment@@::@@2,Knife@@::@@4,test@@::@@16,you@@::@@3,junk@@::@@2,test119@@::@@1,test118@@::@@1,buffer@@::@@78,test114@@::@@1,test117@@::@@1,getDeclaredMethods@@::@@2,test112@@::@@1,75@@::@@6,letter@@::@@2,ByteArrayOutputStream@@::@@49,The@@::@@4,class@@::@@11,lang@@::@@2,forName@@::@@51,e@@::@@8,getHeader@@::@@5,setComment@@::@@2,setSkipEmptyRecords@@::@@2,BufferedReader@@::@@4,test92@@::@@1,2005@@::@@3,assertFalse@@::@@71,n1@@::@@13,n2@@::@@6,with@@::@@1,getSkipEmptyRecords@@::@@6'

    m_bag_content = '1,461,7723,469,fc609a586e24500adcf9c4e18b2a5660@#@CsvReader@@::@@182,all@@::@@2,setDelimiter@@::@@3,getHeaderCount@@::@@1,extends@@::@@1,getRawRecord@@::@@74,test2@@::@@1,ByteBuffer@@::@@22,setUseComments@@::@@2,Test@@::@@4,setTextQualifier@@::@@3,outputStream@@::@@1,test7@@::@@1,true@@::@@15,Object@@::@@4,Jr@@::@@6,0@@::@@113,finally@@::@@2,getMessage@@::@@5,writeRecord@@::@@5,junit@@::@@6,columns@@::@@1,invoke@@::@@3,get@@::@@148,assertEquals@@::@@455,void@@::@@108,999@@::@@1,util@@::@@1,ical@@::@@1,IOException@@::@@10,import@@::@@25,@Test@@::@@105,icane@@::@@1,temp@@::@@7,quotes@@::@@24,ArrayList@@::@@5,t3@@::@@6,method@@::@@15,try@@::@@17,test54@@::@@1,test57@@::@@1,test56@@::@@1,test51@@::@@1,test50@@::@@1,test52@@::@@1,println@@::@@8,IllegalArgumentException@@::@@7,99999@@::@@1,the@@::@@36,getClass@@::@@3,tearDown@@::@@2,readRecord@@::@@164,3L@@::@@4,fail@@::@@4,close@@::@@128,Rider@@::@@15,append@@::@@8,index@@::@@1,said@@::@@9,Run@@::@@16,headers@@::@@4,Bruce@@::@@12,getName@@::@@9,4@@::@@9,3@@::@@49,r@@::@@75,toString@@::@@26,closed@@::@@3,it@@::@@34,new@@::@@117,July@@::@@3,public@@::@@111,ings@@::@@1,csvreader@@::@@2,C@@::@@2,createNewFile@@::@@1,xfa@@::@@4,error@@::@@3,setRecordDelimiter@@::@@9,equals@@::@@2,here@@::@@9,getRecordDelimiter@@::@@4,100@@::@@6,101@@::@@4,getCaptureRawRecord@@::@@5,0L@@::@@53,generateString@@::@@24,actual@@::@@3,ESCAPE_MODE_DOUBLED@@::@@2,test12@@::@@1,conta@@::@@2,test15@@::@@1,u0041@@::@@4,delimiter@@::@@3,getTextQualifier@@::@@4,test79@@::@@1,test78@@::@@1,test77@@::@@1,test76@@::@@1,bob@@::@@9,test74@@::@@1,test73@@::@@1,test72@@::@@1,test71@@::@@1,test70@@::@@1,test146@@::@@1,test147@@::@@1,test144@@::@@1,PrintWriter@@::@@10,test143@@::@@1,crazy@@::@@1,private@@::@@3,test149@@::@@1,test82@@::@@1,test83@@::@@1,boolean@@::@@2,nmore@@::@@2,test87@@::@@1,test84@@::@@1,Reader@@::@@3,10000@@::@@3,exceptionThrown@@::@@3,test89@@::@@1,Method@@::@@9,java@@::@@18,x41@@::@@4,to@@::@@6,contains@@::@@22,add@@::@@2,been@@::@@3,throw@@::@@1,u0AFA@@::@@4,StringBuffer@@::@@2,expected@@::@@8,Barber@@::@@8,more@@::@@1,Adagio@@::@@7,Writer@@::@@2,testAnnotation@@::@@6,xFA@@::@@4,StringBuilder@@::@@8,else@@::@@1,setTrimWhitespace@@::@@2,8@@::@@6,Str@@::@@1,20000@@::@@1,catch@@::@@16,setEscapeMode@@::@@22,an@@::@@2,Starting@@::@@1,endRecord@@::@@23,parse@@::@@69,exception@@::@@1,Ch@@::@@1,r2@@::@@3,f@@::@@6,this@@::@@3,setup@@::@@2,getSafetySwitch@@::@@2,6L@@::@@1,as@@::@@24,n@@::@@54,test19@@::@@1,test18@@::@@1,newInstance@@::@@1,can@@::@@7,v@@::@@4,test11@@::@@1,test10@@::@@1,test13@@::@@1,property@@::@@3,CsvWriter@@::@@62,test14@@::@@1,test17@@::@@1,test16@@::@@1,test120@@::@@1,test121@@::@@1,test122@@::@@1,test123@@::@@1,test124@@::@@1,io@@::@@14,stream@@::@@97,is@@::@@26,Charset@@::@@53,backslash@@::@@5,escaped@@::@@12,Brian@@::@@5,somefilethatdoesntexist@@::@@2,in@@::@@26,ight@@::@@1,getDelimiter@@::@@7,failed@@::@@2,lengths@@::@@2,write@@::@@55,f@@::@@2,1@@::@@263,writer@@::@@181,FileOutputStream@@::@@2,getForceQualifier@@::@@2,100001@@::@@5,csv@@::@@12,assertTrue@@::@@113,test24@@::@@1,UTF@@::@@6,nio@@::@@2,isPublic@@::@@2,test26@@::@@1,ByteArrayInputStream@@::@@5,reflect@@::@@2,4th@@::@@3,test115@@::@@1,characters@@::@@2,data@@::@@152,test75@@::@@1,test33@@::@@1,test32@@::@@1,test31@@::@@1,test30@@::@@1,test37@@::@@1,test36@@::@@1,test35@@::@@1,test34@@::@@1,i@@::@@20,com@@::@@2,test39@@::@@1,test38@@::@@1,user_id@@::@@12,After@@::@@2,Read@@::@@2,8859@@::@@45,123@@::@@4,does@@::@@1,File@@::@@6,getCurrentRecord@@::@@85,tearDowns@@::@@2,M�nchen@@::@@2,test22@@::@@1,getAnnotation@@::@@5,test1@@::@@1,test3@@::@@1,charset@@::@@3,test5@@::@@1,test4@@::@@1,quoted@@::@@11,test6@@::@@1,test9@@::@@1,test8@@::@@1,setForceQualifier@@::@@3,Hey@@::@@9,getHeaders@@::@@4,5L@@::@@1,test145@@::@@1,comma@@::@@16,SafetySwitch@@::@@3,bunch@@::@@1,Assert@@::@@640,field@@::@@33,character@@::@@6,Mac@@::@@6,getUseTextQualifier@@::@@4,test46@@::@@1,test47@@::@@1,test44@@::@@1,test45@@::@@1,test42@@::@@1,test43@@::@@1,test40@@::@@1,test41@@::@@1,o101@@::@@4,main@@::@@1,InputStreamReader@@::@@7,Done@@::@@1,test48@@::@@1,test49@@::@@1,isStatic@@::@@2,return@@::@@1,greater@@::@@2,read@@::@@1,Maximum@@::@@3,fileName@@::@@6,test148@@::@@1,2L@@::@@6,getComment@@::@@4,test173@@::@@1,nline@@::@@8,Adag@@::@@1,name@@::@@12,userid@@::@@4,testClass@@::@@7,test81@@::@@1,ield@@::@@2,t@@::@@45,setups@@::@@4,DisposeCalled@@::@@4,readLine@@::@@3,AllTests@@::@@2,setSafetySwitch@@::@@4,test85@@::@@1,some@@::@@23,System@@::@@8,200010@@::@@3,u0afa@@::@@4,getColumnCount@@::@@85,test23@@::@@1,static@@::@@3,ex@@::@@30,exceeded@@::@@3,Expected@@::@@1,Parameter@@::@@7,test88@@::@@1,ider@@::@@1,out@@::@@5,setCaptureRawRecord@@::@@2,test55@@::@@1,String@@::@@82,for@@::@@17,getEscapeMode@@::@@4,avoid@@::@@3,Samuel@@::@@8,úૺúૺ@@::@@2,getCause@@::@@3,per@@::@@1,1L@@::@@16,re@@::@@3,stuff@@::@@24,tests@@::@@2,reader@@::@@820,Set@@::@@3,Class@@::@@3,be@@::@@7,None@@::@@1,escapedi@@::@@1,This@@::@@25,readHeaders@@::@@2,args@@::@@1,Ignore@@::@@3,getModifiers@@::@@2,if@@::@@12,test113@@::@@1,org@@::@@6,byte@@::@@24,Modifier@@::@@5,super@@::@@1,Strings@@::@@7,thrown@@::@@2,on@@::@@16,flush@@::@@1,r1@@::@@4,8L@@::@@1,column@@::@@7,of@@::@@7,4L@@::@@2,test58@@::@@1,length@@::@@3,000@@::@@6,expecting@@::@@3,100000@@::@@12,test86@@::@@1,Before@@::@@2,throws@@::@@105,already@@::@@3,tblah@@::@@2,setUseTextQualifier@@::@@20,ISO@@::@@45,wrap@@::@@21,FileInputStream@@::@@2,getUseComments@@::@@2,has@@::@@3,setHeaders@@::@@2,decode@@::@@21,ESCAPE_MODE_BACKSLASH@@::@@24,2@@::@@100,modifiers@@::@@6,record@@::@@4,a@@::@@53,Exception@@::@@123,test137@@::@@1,test136@@::@@1,test135@@::@@1,FileNotFoundException@@::@@2,test138@@::@@1,Kn@@::@@1,but@@::@@24,test91@@::@@1,test90@@::@@1,R@@::@@1,z@@::@@4,Boswell@@::@@6,FailingReader@@::@@4,OutputStreamWriter@@::@@4,line@@::@@8,holder@@::@@12,than@@::@@3,count@@::@@5,b@@::@@14,Love@@::@@16,Classical@@::@@7,Toni@@::@@4,double@@::@@28,expectedException@@::@@6,zAAAAA@@::@@2,inputStream@@::@@1,blah@@::@@20,matter@@::@@24,toByteArray@@::@@25,getTrimWhitespace@@::@@2,Peter@@::@@4,delete@@::@@3,false@@::@@34,assertException@@::@@15,test132@@::@@1,int@@::@@11,isQualified@@::@@1,d065@@::@@4,test131@@::@@1,doesn@@::@@24,ins@@::@@2,skipRecord@@::@@1,somefile@@::@@1,exist@@::@@1,Th@@::@@2,null@@::@@31,getIndex@@::@@5,test25@@::@@1,char@@::@@2,test27@@::@@1,test20@@::@@1,test21@@::@@1,Chicane@@::@@15,quote@@::@@6,not@@::@@9,nb@@::@@1,7L@@::@@1,test28@@::@@1,test29@@::@@1,skipLine@@::@@1,instance@@::@@7,Knight@@::@@15,writeComment@@::@@2,Knife@@::@@4,test@@::@@16,you@@::@@3,junk@@::@@2,test119@@::@@1,test118@@::@@1,buffer@@::@@78,test114@@::@@1,test117@@::@@1,getDeclaredMethods@@::@@2,test112@@::@@1,75@@::@@6,letter@@::@@2,ByteArrayOutputStream@@::@@49,The@@::@@4,class@@::@@11,lang@@::@@2,forName@@::@@51,e@@::@@8,getHeader@@::@@5,setComment@@::@@2,setSkipEmptyRecords@@::@@2,BufferedReader@@::@@4,test92@@::@@1,2005@@::@@3,assertFalse@@::@@71,n1@@::@@13,n2@@::@@6,with@@::@@1,getSkipEmptyRecords@@::@@6'
    # if len(sys.argv) != 4:
    #     print('paraError')

    # else:
    #     run(s_bag_content)
    sys.argv += [158,1,0,2,0]
    run(s_bag_content, m_bag_content)
