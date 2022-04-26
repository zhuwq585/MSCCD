package org.nagoya_u.ertl.sa;

import java.util.*;
import java.io.*;


public class KeywordsSet {
    private Set<String> keywordsSet = new HashSet<String>();    
    private Boolean filterAvailable;
    private int keywordsNum;

    KeywordsSet(String file){
        filterAvailable = true;
        this.initSet(file);
    }

    private void initSet(String file){
        keywordsNum = 0;
        FileReader openedFile = null;
        try {
            openedFile = new FileReader(file);
            BufferedReader input = new BufferedReader(openedFile);
            String str;
            while( (str = input.readLine()) != null)
                this.addItem(str.substring(0,str.length()));
            input.close();
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            filterAvailable = false;
            System.out.println("Exception caught in KeywordSet generation. Keywords filter unavaliable.");
        }

        if(keywordsNum == 0)
            filterAvailable = false;
        return;
    }

    private void addItem(String str){
        if(str.length() > 0)
            this.keywordsSet.add(str);
            keywordsNum++;
    }

    public boolean checkKeywords(String str){
        if (filterAvailable == false)
            return true;
        return this.keywordsSet.contains(str);
    }

    // public static void main(String[] args){
    //     // KeywordsSet a = new KeywordsSet("./CPP.reserved");
    //     // boolean res = a.checkKeywords("class");
    //     int a = 3/2;
    //     return;
    // }
}
