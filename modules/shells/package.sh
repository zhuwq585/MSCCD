# !/bin/bash

cd modules/msccd_tokenizer
mvn clean
mvn package -Dmaven.test.skip


if [ ! -d $1/tokenizers/$2 ];then
  mkdir $1/tokenizers/$2
  else
  echo " "
fi


cp $1/modules/msccd_tokenizer/target/msccd_tokenizer-1.0-SNAPSHOT.jar $1/tokenizers/$2/$2_tokenizer.jar   

mvn clean