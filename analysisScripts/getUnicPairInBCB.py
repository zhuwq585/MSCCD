# input:  clone report in the BCB format


# DB Configuration ####
import psycopg2



DB_BCB   = 'bcb'
USER     = 'syu'
PASSWORD = 'jeffkb24ym11'
HOST     = '127.0.0.1'
PORT     = '5432'

def ifRes(conn,type1, file1, start1, end1,type2, file2, start2, end2):
    if start1 == '1' or start2 == '1':
        return 0

    # get id 1
    sql1 = "select id from functions where name='" + file1 + '\' and startline=' + start1 + ' and endline=' + end1 + ' and type=\'' + type1 + '\''
    cur = conn.cursor()
    cur.execute(sql1)
    row1 = cur.fetchone()
    cur.close()


    # get id 2
    sql2 = "select id from functions where name='" + file2 + '\' and startline=' + start2 + ' and endline=' + end2 + ' and type=\'' + type2 + '\''
    cur = conn.cursor()
    cur.execute(sql2)
    row2 = cur.fetchone()
    cur.close()


    if row1 == None or row2 == None:
        return 1

    # get clone
    id1 = str(row1[0])
    id2 = str(row2[0])

    sql3 = "select * from clones where function_id_one=" + id1 + " and function_id_two=" + id2 + "or function_id_one=" + id2 + "and function_id_two=" + id1
    cur = conn.cursor()
    cur.execute(sql3)
    rowRes = cur.fetchone()

    if rowRes == None:
        return 2
    else:
        return 3
    


conn = psycopg2.connect(database=DB_BCB, user=USER, password=PASSWORD, host=HOST, port=PORT)
file = open("/home/syu/workspace/MCCD/Evaluation/recall-BigCloneEval/55/resultForBCE", 'r')

lines = file.readlines()

numAll = len(lines)
numFileLevelUnsaved  = 0
numBlockLevelUnsaved = 0
numCloneUnsaved      = 0
numCloneUndetected   = 0

for line in lines:
    lineArr = line[:-1].split(',')
    type1   = lineArr[0]
    name1   = lineArr[1]
    start1  = lineArr[2]
    end1    = lineArr[3]
    type2   = lineArr[4]
    name2   = lineArr[5]
    start2  = lineArr[6]
    end2    = lineArr[7]

    res = ifRes(conn,type1,name1,start1,end1,type2,name2,start2, end2)
    if res == 1: # bcb未收录的块级代码块
        numBlockLevelUnsaved+=1
    elif res == 2: # 代码块已收录但克隆未收录
        numCloneUnsaved+=1
    elif res == 3: # 已收录
        numCloneUndetected+=1
    elif res == 0: # 未收录的文件级克隆
        numFileLevelUnsaved+=1

file.close()


print(numAll)
print(numFileLevelUnsaved)
print(numBlockLevelUnsaved)
print(numCloneUnsaved)
print(numCloneUndetected)