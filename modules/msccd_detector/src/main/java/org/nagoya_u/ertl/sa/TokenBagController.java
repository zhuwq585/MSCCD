package org.nagoya_u.ertl.sa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class TokenBagController {

    public ArrayList<ArrayList<ArrayList<TokenBag>>> bagCollection;
    private int threadNum;
    private int minToken;
    public int minGranularity;

    TokenBagController(String sourcePath, TokenFrequency gtp, int thread_num, int minToken){
        minGranularity = 0;
        // load all token bags from source file and create gtp by token bags whose bagId is 0
        bagCollection = new ArrayList<ArrayList<ArrayList<TokenBag>>>();
        threadNum     = thread_num;
        this.minToken = minToken;

        loadBagsFromFile(sourcePath, gtp);
    }

    public void loadBagsFromFile(String sourcePath, TokenFrequency gtp){
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
                    if (tmpBag == null)
                        continue;

                    if(tmpBag.bagId == 0)
                        gtp.addItems(tmpBag);
                    
                    if(tmpBag.projectId >= bagCollection.size())
                        while(tmpBag.projectId >= bagCollection.size())
                            bagCollection.add(new ArrayList<ArrayList<TokenBag>>());
                
                    if(tmpBag.fileId >= bagCollection.get(tmpBag.projectId).size())
                        while(tmpBag.fileId>=bagCollection.get(tmpBag.projectId).size())
                            bagCollection.get(tmpBag.projectId).add( new ArrayList<TokenBag>());
                    
                    if(tmpBag.granularity > minGranularity)
                        minGranularity = tmpBag.granularity;

                    bagCollection.get(tmpBag.projectId).get(tmpBag.fileId).add(tmpBag);


                }
                input.close();
            }catch(Exception e){
                System.out.println("err in BufferrdReader for loading token bags from source file");
                System.out.println(e.getLocalizedMessage());
                System.out.println(str);
                e.printStackTrace();
            }
    }

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


    // this part is too slow!!!!!!
    public ArrayList<TokenBag> bagPoolGeneration(int roundId, int minToken, TokenFrequency gtp){
        ArrayList<TokenBag> res = new ArrayList<TokenBag>();
        for(ArrayList<ArrayList<TokenBag>> bagsForProject : bagCollection)
            for( ArrayList<TokenBag> i : bagsForProject)
                for(TokenBag j : i){
                    if(j.granularity == roundId && j.tokenNum >= minToken){
                    // if(j.granularity == roundId && j.symbolNum >= minToken)
                        res.add(j);
                    }
                }

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
            // h.join();
            
        for(Thread h : threadArr)
            try{
                h.join();
            }catch(InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
            
        return res;
    }
}

