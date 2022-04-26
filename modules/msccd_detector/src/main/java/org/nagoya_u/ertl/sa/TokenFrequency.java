package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.HashMap;

public class TokenFrequency {
    private HashMap<String, Integer[]> tokenFrequency;   // token: [id, freq]
    private ArrayList<String> tokenList;                 // tokenid: token
    public int tokenNum;

    TokenFrequency(){
        tokenFrequency = new HashMap<String, Integer[]>();
        tokenList = new ArrayList<String>();
        tokenNum = 0;
    }

    private void addItem(String tokenText){
        // System.out.println(tokenText + " added in GTP");
        if( tokenFrequency.containsKey(tokenText)){
            Integer[] item = tokenFrequency.get(tokenText);
            item[1] += 1;
            tokenFrequency.put(tokenText,item);
        }else{
            Integer[] newItem = {tokenList.size(), 1};
            tokenFrequency.put(tokenText, newItem);
            tokenList.add(tokenText);
        }
        tokenNum++;
    }

    private void addItem(String tokenText, Integer frequency){
        // System.out.println(tokenText);
        // System.out.println(tokenText + " added in GTP");
        if( tokenFrequency.containsKey(tokenText)){
            Integer[] item = tokenFrequency.get(tokenText);
            item[1] += frequency;
            tokenFrequency.put(tokenText, item);
        }else{
            Integer[] newItem = {tokenList.size(), frequency};
            tokenFrequency.put(tokenText, newItem);
            tokenList.add(tokenText);
        }
        tokenNum += frequency;

    }

    public int getFreqByToken(String token){
        return tokenFrequency.get(token)[1];
    }

    public int getFreqById(Integer id){
        return tokenFrequency.get(tokenList.get(id))[1];
    }

    public int getIdByToken(String token){
        return tokenFrequency.get(token)[0];
    }

    public void addItems(TokenBag tBag){
        for( String token : tBag.getAllToken()){
            addItem(token, tBag.tokenMap.get(token));
        }
    }


    public String getTokenById(Integer id){
        return tokenList.get(id);
    }
    
    // public String toString(){
    //     String res = "";

    //     for (Entry<String, Integer> entry: tokenFrequency.entrySet()){
    //         res += entry.getKey() + "@ @" + entry.getValue().toString() + "\n";
    //     }

    //     // Set<Map.Entry<String, Integer>> entrySet = tokenFrequency.entrySet();
    //     // for (Map.Entry<String,Integer> entry: entrySet)
    //     //     res += entry.getKey() + "@ @" + entry.getValue().toString() + '\n';

    //     return res;
    // }


    // public void store(String filePath){
    //     String sourceString = toString();
    //     byte[] sourceByte = sourceString.getBytes();

    //     if( sourceByte != null){
    //         try{

    //             File file = new File(filePath);
    //             if(!file.exists()){
    //                 File dir = new File(file.getParent());
    //                 if(!dir.exists())
    //                     dir.mkdirs();
    //                 file.createNewFile();
    //             }
    //             FileOutputStream outStream = new FileOutputStream(file);
    //             outStream.write(sourceByte);
    //             outStream.close();
    //         }catch(Exception e){
    //             System.out.println(e.getLocalizedMessage());
    //         }
    //     }
    // }
}