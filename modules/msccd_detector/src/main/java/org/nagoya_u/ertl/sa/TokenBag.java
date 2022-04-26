package org.nagoya_u.ertl.sa;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class TokenBag{

    public HashMap<String, Integer> tokenMap;
    public LinkedList<Integer> sortedBag;
    public int projectId;
    public int fileId;
    public int bagId;
    public int granularity;
    public int startLine;
    public int endLine;
    public int num_keywords;
    public int tokenNum;
    public int symbolNum;

    TokenBag(int fileId, int bagId, int granularity, int symbolNum, int pId, int tokenNum){
        tokenMap = new HashMap<String, Integer>();

        this.fileId       = fileId;
        this.granularity  = granularity;
        this.bagId        = bagId;
        this.symbolNum    = symbolNum;
        this.tokenNum     = tokenNum;
        this.projectId    = pId;

        num_keywords = 0;

        sortedBag = null;
    }


    public void addToken(String str){
        if(str.length() < 1)
            return;
            
        try{
            if ( tokenMap.containsKey(str))
                tokenMap.put(str, tokenMap.get(str)+1);
            else
                tokenMap.put(str, 1);    
            
            // tokenNum++;
        }catch(OutOfMemoryError e){
            System.out.println(str);
            e.printStackTrace();
        }
    }

    public void addToken(String str, int freq){
        if(str.length() < 1)
            return;
            
        try{
            if ( tokenMap.containsKey(str))
                tokenMap.put(str, tokenMap.get(str)+freq);
            else
                tokenMap.put(str, freq);    
            
            // tokenNum+=freq;
        }catch(OutOfMemoryError e){
            System.out.println(str);
            e.printStackTrace();
        }
    }

    public String[] getAllToken(){
        Set<String> keyset = tokenMap.keySet();
        return keyset.toArray(new String[keyset.size()]);
    }

    public LinkedList<String> getAllTokens(){
        LinkedList<String> res = new LinkedList<String>();

        for(String token : getAllToken()){
            int i = 0;
            while(i < tokenMap.get(token)){
                res.add(token);
                i++;
            }
        }

        return res;
    }

    public void setPosition(int startLine, int endLint){
        this.startLine = startLine;
        this.endLine   = endLint;
    }

    public void addKeywords(){
        num_keywords++;
    }

    public String getPosition(){
        String res = String.valueOf(startLine) + ": :" + String.valueOf(endLine);
        return res;
    }

    public String getTokens(){
        String res = "";
        Object[] tokens = getAllToken();
        for(int i = 0; i < tokens.length; i++)
            res += tokens[i] + ": :" + tokenMap.get(tokens[i]) + "_ _";
        return res;
    }

    public String toString(){
        String res = "";
        // res += "file id: " + String.valueOf(fileId) + " path:" + filePath + "\n";
        res += "bag id: " + String.valueOf(bagId) + "\n";
        res += "lines: " + getPosition() + '\n';
        res += getTokens() + '\n';
        return res;
    }

    public String outputBag(){
        String res = "";
        String separator = "@ @";
        res += String.valueOf(fileId) + separator + String.valueOf(bagId) + separator;
        res += String.valueOf(granularity) + separator;
        res += String.valueOf(num_keywords) + separator;
        res += String.valueOf(symbolNum) + separator;
        res += getPosition() + separator;
        res += getTokens() + "\n";
        return res;
    }
    // fileId @@ bagId @@ granularity @@ num_keywords @@ symbolN @@ startline -- endline @@ tokens...........
}