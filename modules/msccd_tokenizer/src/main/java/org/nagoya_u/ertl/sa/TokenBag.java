package org.nagoya_u.ertl.sa;

import java.util.HashMap;
import java.util.Set;

import org.antlr.runtime.Token;

public class TokenBag{

    public HashMap<String, Integer> tokenMap;
    public int projectId;
    public int fileId;
    public int bagId;
    public int granularity;
    public int startLine;
    public int endLine;
    public int num_keywords;
    public int tokenNum;
    public int symbolNum;

    // TokenBag(int fileId, int bagId, int granularity, int symbolNum, int pId){
    TokenBag(int fileId, int granularity, int symbolNum, int pId){
        tokenMap = new HashMap<String, Integer>();

        this.fileId       = fileId;
        this.granularity  = granularity;
        // this.bagId        = bagId;
        this.symbolNum    = symbolNum;
        this.projectId    = pId;

        tokenNum     = 0;
        num_keywords = 0;
    }

    public void setBagId(int bagId){
        this.bagId = bagId;
    }

    public void addToken(String str){
        if(str.length() < 1)
            return;
            
        str = this.removeEnter(str);
        try{
            if ( tokenMap.containsKey(str))
                tokenMap.put(str, tokenMap.get(str)+1);
            else
                tokenMap.put(str, 1);    
            
            tokenNum++;
        }catch(OutOfMemoryError e){
            e.printStackTrace();
        }
    }

    private String removeEnter(String str){
        if (str.equalsIgnoreCase(str)){
            str = str.replaceAll("\n", "");
        }
        return str;
    }

    public String[] getAllToken(){
        Set<String> keyset = tokenMap.keySet();
        return keyset.toArray(new String[keyset.size()]);
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
        res += String.valueOf(projectId) + separator;
        res += String.valueOf(fileId) + separator + String.valueOf(bagId) + separator;
        res += String.valueOf(granularity) + separator;
        res += String.valueOf(num_keywords) + separator;
        res += String.valueOf(symbolNum) + separator;
        res += String.valueOf(tokenNum) + separator;
        res += getPosition() + separator;
        res += getTokens() + "\n";
        return res;
    }
    // projectId @@ fileId @@ bagId @@ granularity @@ num_keywords @@ symbolN @@ tokenN @@ startline -- endline @@ tokens...........

    // public static void main(String args[]){
    //     TokenBag test = new TokenBag(0, 0, 0, 0);

    //     String a = "/";
    //     System.out.println(a);
    //     System.out.println(test.removeEnter(a));
    //     System.out.println(test.removeEnter(a));
    // }
}