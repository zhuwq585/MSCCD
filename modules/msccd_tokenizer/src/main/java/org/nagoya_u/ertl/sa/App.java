package org.nagoya_u.ertl.sa;
import java.util.concurrent.ArrayBlockingQueue;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Input:
 *  minSize
 *  Keyword list file
 *  Output folder path
 *
 */
public class App 
{

    private static void outputRes(ArrayList<ArrayList<TokenBag>> res, String folderPath, ArrayList<String> fileList, TokenFrequency GTP){
        try{
            File file = new File(folderPath + "/tokenBags");
            if (!file.exists()){
                File dir = new File(file.getParent());
                dir.mkdirs();
                file.createNewFile();
            }
    
            String printString = "";
            ArrayList<TokenBag> bagList;
            for (int i = 0; i < res.size(); i++){
                bagList = res.get(i);
                if(bagList == null)
                    continue;
                for (int j = 0; j < bagList.size(); j++){
                    printString += bagList.get(j).outputBag();
                }
            }
    
            byte[] printByte = printString.getBytes();
            FileOutputStream outStream = new FileOutputStream(file);
            outStream.write(printByte);
            outStream.close();
           }catch(Exception e){
               e.printStackTrace();
           }

           GTP.store(folderPath+"/tokenFrequency");
    }


    // private static void printRes(ArrayList<ArrayList<TokenBag>> res, String folderPath, ArrayList<String> fileList){
    //    try{
    //     File file = new File(folderPath + "/tokenBags.txt");
    //     if (!file.exists()){
    //         File dir = new File(file.getParent());
    //         dir.mkdirs();
    //         file.createNewFile();
    //     }

    //     String printString = "";
    //     ArrayList<TokenBag> bagList;
    //     for (int i = 0; i < res.size(); i++){
    //         bagList = res.get(i);
    //         if(bagList == null)
    //             continue;
    //         printString += "file id: " + String.valueOf(i) + ": " + fileList.get(i) + "\n";
    //         for (int j = 0; j < bagList.size(); j++){
    //             printString += bagList.get(j).toString();
    //             printString += "----\n";
    //         }
    //         printString += "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n";
    //     }

    //     byte[] printByte = printString.getBytes();
    //     FileOutputStream outStream = new FileOutputStream(file);
    //     outStream.write(printByte);
    //     outStream.close();
    //    }catch(Exception e){
    //        e.printStackTrace();
    //    }
    // }

    public static void fullyTokenize(String[] args){

        // // TESTING 
        int minToken = 2;
        String fileListPath = "/Users/syu/workspace/MSCCD/tasks/task18/fileList.txt";
        String keywordsListPath = "/Users/syu/workspace/MSCCD/grammarDefinations/java/Java.reserved";
        String outputFilePath = "/home/syu/workspace/test.txt";
        int threadNum = 1;

        // int    minToken         = Integer.valueOf(args[1]); 
        // String fileListPath     = args[2]; 
        // String keywordsListPath = args[3]; 
        // String outputFilePath   = args[4]; 
        // int    threadNum        = Integer.valueOf(args[5]); 
        
        ArrayList<SourceFile> fileList = (new FileController()).setFileArr(fileListPath).getFileList();
        ArrayBlockingQueue<ArrayList<TokenBag>> q = new ArrayBlockingQueue<ArrayList<TokenBag>>(fileList.size());
        KeywordsSet k = new KeywordsSet(keywordsListPath);


        // concurrent execution start
        // build sub thread
        ArrayList<SubTokenizer> threadArr = new ArrayList<SubTokenizer>();
        for(int i = 0; i < threadNum; i++)
            threadArr.add(new SubTokenizer(null, k, minToken, q));
        
        int cursor = 0;
        for (SourceFile tmpFile : fileList){
            threadArr.get(cursor).addFile(tmpFile);
            cursor++;
            if(cursor >= threadNum)
                cursor = 0;
        }

        // start sub thread
        for(int i = 0; i < threadArr.size(); i++)
            // threadArr.get(i).start();
            threadArr.get(i).run();
        
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath));

            // get all tBag from Queuq
            ArrayList<TokenBag> bagArraytmp;

            int gotNum = 0, i;
            TokenBag bagTmp = null;
            String printStringTmp = "";

            while(gotNum < fileList.size()){
                bagArraytmp = q.poll();
                if(bagArraytmp == null){
                    try{
                        Thread.sleep(5000);
                        System.out.print("#### Waiting for a new element from bagArray queue.\n");
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else{
                    if(bagArraytmp.size() != 0){
                        for(i = 0; i < bagArraytmp.size(); i++){
                            bagTmp = bagArraytmp.get(i);
                            printStringTmp = bagTmp.outputBag();
                            bufferedWriter.write(printStringTmp);
                        }
                    }
                    gotNum++;
                }
            }
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        // synchrinism execution for debuging
        // SubTokenizer t = new SubTokenizer(fileList, k, 2, 0, q);
        // ArrayList<ArrayList<TokenBag>> allBag = t.run_s();
        // for(int i=0; i < allBag.size(); i++){
        //     ArrayList<TokenBag> tmp = allBag.get(i);
        //     for(int j = 0; j < tmp.size(); j++){
        //         if(tmp.get(j).bagId == 0){
        //             GTP.addItems(tmp.get(j));
        //             break;
        //         }
        //     }
        // }          
        // outputRes(allBag, outputFolderPath, fileList, GTP);
        // printRes(allBag, outputFolderPath, fileList);

    }

    public static void simplyTokenize(String[] args){
        // arguments: filePath, keywordsListPath, outputFilePath
        String filePath         = args[1]; 
        String keywordsListPath = args[2]; 
        String outputFilePath   = args[3]; 

        KeywordsSet k = new KeywordsSet(keywordsListPath);
        ParseTreeController pController = new ParseTreeController(k, 1);
        TokenBag res = pController.runSimplyTokenize(filePath);

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath));
            bufferedWriter.write(res.outputBag());
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    // main arguments: minToken, fileListPath, keywordsListPath, outputFolderPath, threadNum
    public static void main( String[] args )
    {
        
        // // // TESTING 
        // int minToken = 2;
        // String fileListPath = "/Users/syu/workspace/MSCCD/tasks/task2046/fileList.txt";
        // String keywordsListPath = "/Users/syu/workspace/MSCCD/grammarDefinations/python3/Python.reserved";
        // String outputFilePath = "/home/syu/workspace/test.txt";
        // int threadNum = 1;

        int    minToken         = Integer.valueOf(args[1]); 
        String fileListPath     = args[2]; 
        String keywordsListPath = args[3]; 
        String outputFilePath   = args[4]; 
        int    threadNum        = Integer.valueOf(args[5]); 
        
        ArrayList<SourceFile> fileList = (new FileController()).setFileArr(fileListPath).getFileList();
        ArrayBlockingQueue<ArrayList<TokenBag>> q = new ArrayBlockingQueue<ArrayList<TokenBag>>(fileList.size());
        KeywordsSet k = new KeywordsSet(keywordsListPath);


        // concurrent execution start
        // build sub thread
        ArrayList<SubTokenizer> threadArr = new ArrayList<SubTokenizer>();
        for(int i = 0; i < threadNum; i++)
            threadArr.add(new SubTokenizer(null, k, minToken, q));
        
        int cursor = 0;
        for (SourceFile tmpFile : fileList){
            threadArr.get(cursor).addFile(tmpFile);
            cursor++;
            if(cursor >= threadNum)
                cursor = 0;
        }

        // start sub thread
        for(int i = 0; i < threadArr.size(); i++)
            threadArr.get(i).start();
            // threadArr.get(i).run();
        
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath));

            // get all tBag from Queuq
            ArrayList<TokenBag> bagArraytmp;

            int gotNum = 0, i;
            TokenBag bagTmp = null;
            String printStringTmp = "";

            while(gotNum < fileList.size()){
                bagArraytmp = q.poll();
                if(bagArraytmp == null){
                    try{
                        Thread.sleep(5000);
                        System.out.print("#### Waiting for a new element from bagArray queue.\n");
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else{
                    if(bagArraytmp.size() != 0){
                        for(i = 0; i < bagArraytmp.size(); i++){
                            bagTmp = bagArraytmp.get(i);
                            printStringTmp = bagTmp.outputBag();
                            bufferedWriter.write(printStringTmp);
                        }
                    }
                    gotNum++;
                }
            }
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
