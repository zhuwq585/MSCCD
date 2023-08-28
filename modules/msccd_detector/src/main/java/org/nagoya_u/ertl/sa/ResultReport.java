package org.nagoya_u.ertl.sa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ResultReport {
    
    public void saveResult(ArrayList<ArrayList<Integer>> classList,  String outputPath, String mode){
        String outputFile;
        if(mode.equals("pair")){
            outputFile = outputPath + "/pairs.file";
        }
        else if(mode.equals("class")){
            outputFile = outputPath + "/class.file";
        }
        else{
            return;
        }

        try{
            File newFile = new File(outputFile);
            newFile.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            String writeStringTmp = "";
            for ( ArrayList<Integer> clonePair : classList){
                writeStringTmp = "[";

                int tBagIndex = 0;
                int maxIndex = clonePair.size()/3 - 1;
                while (tBagIndex <= maxIndex){
                    writeStringTmp = writeStringTmp + "[" + String.valueOf(clonePair.get(tBagIndex*3)) + ", " + String.valueOf(clonePair.get(tBagIndex*3 + 1)) + ", " + String.valueOf(clonePair.get(tBagIndex*3 + 2)) + "]";

                    if(tBagIndex != maxIndex){
                        writeStringTmp = writeStringTmp + ",";
                    }
                    tBagIndex += 1;
                }
                



                writeStringTmp = writeStringTmp + "]\n";

                // writeStringTmp = "[[" + String.valueOf(clonePair[0]) + ", " + String.valueOf(clonePair[1]) + ", " + String.valueOf(clonePair[2]) + "], [" + String.valueOf(clonePair[3]) + ", " + String.valueOf(clonePair[4]) + ", " + String.valueOf(clonePair[5]) + "]]\n";
                bufferedWriter.write(writeStringTmp);

            }
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
