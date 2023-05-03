package org.nagoya_u.ertl.sa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class TokenBagController {

    public ArrayList<ArrayList<TokenBag>> bagCollection_granuIndex;
    public ArrayList<ArrayList<ArrayList<TokenBag>>> bagCollection_idIndex;
    private int threadNum;
    private int minToken;
    private int maxRound;
    public int minGranularity;

    TokenBagController(String sourcePath, TokenFrequency gtp, int thread_num, int minToken, int maxRound){
        minGranularity = 0;
        // load all token bags from source file and create gtp by token bags whose bagId is 0
        bagCollection_idIndex = new ArrayList<ArrayList<ArrayList<TokenBag>>>(); //fileid -> bagid -> tokenbag
        bagCollection_granuIndex = new ArrayList<ArrayList<TokenBag>>(); // granularity -> tokenbags
        threadNum     = thread_num;
        this.minToken = minToken;
        this.maxRound = maxRound;

        loadBagsFromFile(sourcePath, gtp);
    }

    public void loadBagsFromFile(String sourcePath, TokenFrequency gtp){ //
        FileReader openedFile;
        try{
            openedFile = new FileReader(sourcePath);
        }catch(FileNotFoundException e){
            System.out.println("Token bag source file not found");
            return ;
        }

        BufferedReader input = new BufferedReader(openedFile);
        String str = null;
        try{
            while( (str = input.readLine()) != null){

                TokenBag tmpBag = createBagFromStr(str);

                if (tmpBag.granularity > maxRound)
                    continue;

                if(tmpBag.bagId == 0)
                    gtp.addItems(tmpBag);
                
                tmpBag.freeHashMap(gtp);
                
                // granularity index generation
                if(tmpBag.granularity >= bagCollection_granuIndex.size())
                    while(tmpBag.granularity >= bagCollection_granuIndex.size())
                        bagCollection_granuIndex.add(new ArrayList<TokenBag>());
                
                if (tmpBag.tokenNum >= this.minToken)
                    bagCollection_granuIndex.get(tmpBag.granularity).add(tmpBag);
                
                if(tmpBag.granularity > minGranularity)
                    minGranularity = tmpBag.granularity;

                // id index generation
                if(tmpBag.projectId >= bagCollection_idIndex.size())
                    while(tmpBag.projectId >= bagCollection_idIndex.size())
                        bagCollection_idIndex.add(new ArrayList<ArrayList<TokenBag>>());
                
                if(tmpBag.fileId >= bagCollection_idIndex.get(tmpBag.projectId).size())
                    while(tmpBag.fileId>=bagCollection_idIndex.get(tmpBag.projectId).size())
                        bagCollection_idIndex.get(tmpBag.projectId).add( new ArrayList<TokenBag>());
                
                
                if(tmpBag.bagId >= bagCollection_idIndex.get(tmpBag.projectId).get(tmpBag.fileId).size()){
                    while(tmpBag.bagId >= bagCollection_idIndex.get(tmpBag.projectId).get(tmpBag.fileId).size()){
                        bagCollection_idIndex.get(tmpBag.projectId).get(tmpBag.fileId).add(null);
                    }
                }

                bagCollection_idIndex.get(tmpBag.projectId).get(tmpBag.fileId).set(tmpBag.bagId,tmpBag);
            }
            input.close();
        }catch(Exception e){
            System.out.println("err in BufferrdReader for loading token bags from source file");
            System.out.println(e.getLocalizedMessage());
            System.out.println(str);
            e.printStackTrace();
        }
    }   

    // public void loadBagsFromFile_fbt(String sourcePath, TokenFrequency gtp){ // fileid -> bagid -> tokenbag
    //         FileReader openedFile;
    //         try{
    //             openedFile = new FileReader(sourcePath);
    //         }catch(FileNotFoundException e){
    //             System.out.println("Token bag source file not found");
    //             return ;
    //         }

    //         BufferedReader input = new BufferedReader(openedFile);
    //         String str = null;
    //         try{
    //             while( (str = input.readLine()) != null){

    //                 TokenBag tmpBag = createBagFromStr(str);
    //                 if (tmpBag == null)
    //                     continue;

    //                 if(tmpBag.bagId == 0)
    //                     gtp.addItems(tmpBag);
                    
    //                 if(tmpBag.projectId >= bagCollection.size())
    //                     while(tmpBag.projectId >= bagCollection.size())
    //                         bagCollection.add(new ArrayList<ArrayList<TokenBag>>());
                
    //                 if(tmpBag.fileId >= bagCollection.get(tmpBag.projectId).size())
    //                     while(tmpBag.fileId>=bagCollection.get(tmpBag.projectId).size())
    //                         bagCollection.get(tmpBag.projectId).add( new ArrayList<TokenBag>());
                    
    //                 if(tmpBag.granularity > minGranularity)
    //                     minGranularity = tmpBag.granularity;

    //                 bagCollection.get(tmpBag.projectId).get(tmpBag.fileId).add(tmpBag);


    //             }
    //             input.close();
    //         }catch(Exception e){
    //             System.out.println("err in BufferrdReader for loading token bags from source file");
    //             System.out.println(e.getLocalizedMessage());
    //             System.out.println(str);
    //             e.printStackTrace();
    //         }
    // }

    private TokenBag createBagFromStr(String sourceLine){
        String infoArr[]     = sourceLine.split("@ @");

        if (infoArr.length != 9)
            return null;

        int    tokenNum      = Integer.valueOf(infoArr[6]);
        int    projectId     = Integer.valueOf(infoArr[0]);
        int    fileId        = Integer.valueOf(infoArr[1]);
        int    bagId         = Integer.valueOf(infoArr[2]);
        int    granularity   = Integer.valueOf(infoArr[3]);
        int    symbolNum     = Integer.valueOf(infoArr[5]);
        String positionStr[] = infoArr[7].split(": :");

        TokenBag res = new TokenBag(fileId, bagId, granularity, symbolNum, projectId, tokenNum);

        if (tokenNum < minToken && bagId != 0)
            return res;

        res.setPosition(Integer.valueOf(positionStr[0]), Integer.valueOf(positionStr[1]));

        String tokenArr[] = infoArr[8].split("_ _");
        String tokenTmp[];
        for(int i=0; i < tokenArr.length; i++){
            tokenTmp = tokenArr[i].split(": :");
            res.addToken(tokenTmp[0], Integer.valueOf(tokenTmp[1]));
        }
        return res;
    }

    public ArrayList<TokenBag> getTokenBagsByGranularity(int granularity){
        try{
            return this.bagCollection_granuIndex.get(granularity);
        }catch (java.lang.IndexOutOfBoundsException e){
            System.out.println("No bags at granularity " + String.valueOf(granularity));
            return null;
        }
    }


    public ArrayList<TokenBag> bagPoolGeneration(int roundId, int minToken, TokenFrequency gtp){
   
        ArrayList<TokenBag> res = getTokenBagsByGranularity(roundId);
        
        if(res == null){
            return null;
        }
        // for(ArrayList<ArrayList<TokenBag>> bagsForProject : bagCollection)
        //     for( ArrayList<TokenBag> i : bagsForProject)
        //         for(TokenBag j : i){
        //             if(j.granularity == roundId && j.tokenNum >= minToken){
        //             // if(j.granularity == roundId && j.symbolNum >= minToken)
        //                 res.add(j);
        //             }
        //         }

        ArrayList<TokenSorter> threadArr = new ArrayList<TokenSorter>();
        for (int i = 0; i < threadNum; i++)
            threadArr.add(new TokenSorter(gtp));
        
        int cursor = 0;
        for (int i = 0; i < res.size(); i++)
            threadArr.get(cursor).addBag(res.get(i));
            cursor++;
            if(cursor >= threadNum)
                cursor = 0;
        
        for(Thread h : threadArr)
            h.start();
            // h.run();
            // h.join();
            
        for(Thread h : threadArr)
            try{
                h.join();
            }catch(InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
            
        return res;
    }



    // public ArrayList<TokenBag> bagPoolGeneration_old(int roundId, int minToken, TokenFrequency gtp){
        
    //     ArrayList<TokenBag> res = new ArrayList<TokenBag>();
    //     for(ArrayList<ArrayList<TokenBag>> bagsForProject : bagCollection_idIndex)
    //         for( ArrayList<TokenBag> i : bagsForProject)
    //             for(TokenBag j : i){
    //                 if(j.granularity == roundId && j.tokenNum >= minToken){
    //                 // if(j.granularity == roundId && j.symbolNum >= minToken)
    //                     res.add(j);
    //                 }
    //             }

    //     ArrayList<TokenSorter> threadArr = new ArrayList<TokenSorter>();
    //     for (int i = 0; i < threadNum; i++)
    //         threadArr.add(new TokenSorter(gtp));
        
    //     int cursor = 0;
    //     for (int i = 0; i < res.size(); i++)
    //         threadArr.get(cursor).addBag(res.get(i));
    //         cursor++;
    //         if(cursor >= threadNum)
    //             cursor = 0;
        
    //     for(Thread h : threadArr)
    //         h.start();
    //         // h.join();
            
    //     for(Thread h : threadArr)
    //         try{
    //             h.join();
    //         }catch(InterruptedException e){
    //             System.out.println(e.getLocalizedMessage());
    //         }
            
    //     return res;
    // }

    // // static public void main(String[] argv){
    // //     LinkedList<Integer> a = new LinkedList<>();
    // //     a.set(5,10);
    // //     System.out.println(a.get(5).toString());
    // // }
}

