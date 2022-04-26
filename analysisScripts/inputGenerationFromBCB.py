import psycopg2 
import shutil, os

# configuration ##############################
Functionality_id       = '10'
Syntactic_type         = '3'
Similarity_token_left  = '0.9' # [ )
Similarity_token_right = '1' # [ )
Min_token              = '50'
Min_line               = '6'
##############################################

# get data from bigclonebench#################
conn = psycopg2.connect(database="bcb",user="zhuwq",password='jeffkb24ym11',host="127.0.0.1", port="5433")
conn.set_client_encoding('UTF8')
cur = conn.cursor()
# SQLStr = 'SELECT function_id_one, function_id_two FROM clones WHERE functionality_id=' + Functionality_id +' and similarity_token >= ' + Similarity_token_left + ' and similarity_token < ' + Similarity_token_right + 'and min_tokens >= ' + Min_token
SQLStr = "select function_id_one, function_id_two from clones c where functionality_id = 10 and syntactic_type = 3 and similarity_line >=0.9 and similarity_line <1 and similarity_token >= 0.9 and similarity_token < 1 and min_size >= 6 and min_tokens >= 50"
cur.execute(SQLStr)
functionsPair = cur.fetchall()


pairs = []
for pair in functionsPair:
    id1 = str(pair[0])
    id2 = str(pair[1])

    SQLStr = 'SELECT name,type,startline,endline FROM functions WHERE id=' + id1
    cur.execute(SQLStr)
    bag1 = cur.fetchall()[0]

    SQLStr = 'SELECT name, type, startline, endline FROM functions WHERE id=' + id2
    cur.execute(SQLStr)
    bag2 = cur.fetchall()[0]

    pairsContent = Functionality_id+'/'+bag1[1]+'/'+bag1[0]+','+str(bag1[2])+','+str(bag1[3]) + ',' + Functionality_id+'/'+bag2[1]+'/'+bag2[0]+','+str(bag2[2])+','+str(bag2[3]) + '\n'
    pairs.append(pairsContent)
conn.close()
##############################################

# copy files from bcb_reduced#################
BCB_Path     = '/home/zhuwq/workspace/MCCD/Project/input/bcb_reduced'
targetFolder = Functionality_id + '-' + Syntactic_type + '-' + Similarity_token_left + '-' + Similarity_token_right
targetPath   = '/home/zhuwq/workspace/MCCD/Project/input/' + targetFolder
if not os.path.exists(targetPath):
    os.makedirs(targetPath)
else:
    shutil.rmtree(targetPath)
    os.makedirs(targetPath)

os.makedirs(targetPath+'/'+Functionality_id)
os.makedirs(targetPath+'/'+Functionality_id+'/sample')
os.makedirs(targetPath+'/'+Functionality_id+'/default')
os.makedirs(targetPath+'/'+Functionality_id+'/selected')

for pair in pairs:
    pairArr = pair.split(',')
    file1   = pairArr[0]
    file2   = pairArr[3]
    if not os.path.exists(targetPath+'/'+file1):
        shutil.copy(BCB_Path+'/'+file1, targetPath + '/' + file1)
    if not os.path.exists(targetPath+'/'+file2):
        shutil.copy(BCB_Path+'/'+file2, targetPath + '/' + file2)

print('Test instance created in input/' + targetFolder)
##############################################

# save info
if not os.path.exists(targetFolder):
    os.makedirs(targetFolder)

file = open(targetFolder+'/clones.csv','w')
for line in pairs:
    file.write(line)
file.close()
##############################################
