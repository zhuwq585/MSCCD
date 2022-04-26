package org.nagoya_u.ertl.sa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileController {
    private ArrayList<SourceFile> fileList;
    
    FileController(){
        fileList = new ArrayList<SourceFile>();
    }

    ArrayList<SourceFile> getFileList(){
        return fileList;
    }

    FileController setFileArr(String file){
        FileReader openedFile = null;
        try{
            openedFile = new FileReader(file);
        }catch(FileNotFoundException e){
            System.out.println("File list not found.");
            // return null;
        }

        BufferedReader input = new BufferedReader(openedFile);
        String str;
        int currentProject = -1;
        int fileIdCursor   = 0;
        try{
            while( (str = input.readLine()) != null){
                String[] fileLine = str.subSequence(0, str.length()).toString().split(",");
                // String[] fileLine = str.subSequence(0, str.length());
                String filePath   = fileLine[1];
                int    pId        = Integer.valueOf(fileLine[0]);
                if (currentProject != pId){ // new project
                    fileIdCursor   = 0;
                    currentProject = pId;
                }
                fileList.add( new SourceFile(pId, fileIdCursor, filePath));
                fileIdCursor++;
            }
            input.close();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        return this;
    }
}
