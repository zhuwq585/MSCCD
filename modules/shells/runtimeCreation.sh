# !/bin/bash


cp $1/tmp/*.java $1/runtime/
# cp $1/parser/*.java $1/runtime/
javac $1/runtime/*.java