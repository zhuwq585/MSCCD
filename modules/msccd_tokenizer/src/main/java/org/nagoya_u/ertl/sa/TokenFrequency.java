package org.nagoya_u.ertl.sa;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;


public class TokenFrequency {
    private HashMap<String, Integer> tokenFrequency;
    private int tokenNum;

    TokenFrequency(){
        tokenFrequency = new HashMap<String, Integer>();
        tokenNum = 0;
    }

    public void addItem(String tokenText){
        // System.out.println(tokenText + " added in GTP");
        if( tokenFrequency.containsKey(tokenText)){
            tokenFrequency.put(tokenText, tokenFrequency.get(tokenText)+1);
        }else{
            tokenFrequency.put(tokenText, 1);
        }
        tokenNum++;
    }

    public void addItem(String tokenText, int frequency){
        // System.out.println(tokenText + " added in GTP");
        if( tokenFrequency.containsKey(tokenText)){
            tokenFrequency.put(tokenText, tokenFrequency.get(tokenText)+frequency);
        }else{
            tokenFrequency.put(tokenText, frequency);
        }
        tokenNum += frequency;

    }

    public void addItems(TokenBag tBag){
        for( String token : tBag.getAllToken()){
            addItem(token, tBag.tokenMap.get(token));
        }
    }

    public String toString(){
        String res = "";

        for (Map.Entry<String, Integer> entry: tokenFrequency.entrySet()){
            res += entry.getKey() + "@ @" + entry.getValue().toString() + "\n";
        }

        // Set<Map.Entry<String, Integer>> entrySet = tokenFrequency.entrySet();
        // for (Map.Entry<String,Integer> entry: entrySet)
        //     res += entry.getKey() + "@ @" + entry.getValue().toString() + '\n';

        return res;
    }

    public void store(String filePath){
        String sourceString = toString();
        byte[] sourceByte = sourceString.getBytes();

        if( sourceByte != null){
            try{

                File file = new File(filePath);
                if(!file.exists()){
                    File dir = new File(file.getParent());
                    if(!dir.exists())
                        dir.mkdirs();
                    file.createNewFile();
                }
                FileOutputStream outStream = new FileOutputStream(file);
                outStream.write(sourceByte);
                outStream.close();
            }catch(Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}