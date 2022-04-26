package org.nagoya_u.ertl.sa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ResultReport {
    
    public void saveResult(ArrayList<Integer[]> pairList,  String outputPath){
        String outputFile = outputPath + "/pairs.file";
        try{
            File newFile = new File(outputFile);
            newFile.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            String writeStringTmp = "";
            for ( Integer[] clonePair : pairList){
                writeStringTmp = "[[" + String.valueOf(clonePair[0]) + ", " + String.valueOf(clonePair[1]) + ", " + String.valueOf(clonePair[2]) + "], [" + String.valueOf(clonePair[3]) + ", " + String.valueOf(clonePair[4]) + ", " + String.valueOf(clonePair[5]) + "]]\n";
                bufferedWriter.write(writeStringTmp);

            }
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
