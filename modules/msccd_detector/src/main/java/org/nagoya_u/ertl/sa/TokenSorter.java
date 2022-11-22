package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.LinkedList;

public class TokenSorter extends Thread {
    ArrayList<TokenBag> bagList;
    TokenFrequency gtp;
    TokenSorter(TokenFrequency gtp){
        bagList = new ArrayList<TokenBag>();
        this.gtp = gtp;
    }


    public void addBag(TokenBag bag){
        bagList.add(bag);
    }
    
    public void run(){
        // System.out.println("");
        for(TokenBag bag : bagList)
            sortBag(bag);
    }

    private void sortBag(TokenBag bag){
        LinkedList<Integer> sortedBag = new LinkedList<Integer>();
        

        String[] tokenList = bag.getAllToken();
        LinkedList<Integer> freqList = new LinkedList<Integer>();
        for(int i = 0; i < tokenList.length;i++)
            freqList.add(gtp.getFreqByToken(tokenList[i]));
        
        int i = 0;
        int j;
        int rightTmp;
        int markIndex;
        while(i < freqList.size()){
            j = 0;
            rightTmp = Integer.MAX_VALUE;
            markIndex = j;
            while( j < freqList.size()){
                if(freqList.get(j) < rightTmp){
                    rightTmp = freqList.get(j);
                    markIndex = j;
                }
                j++;
            }

            freqList.set(markIndex, Integer.MAX_VALUE);

            int tokenIdtoAdd = gtp.getIdByToken(tokenList[markIndex]);
            int k = 0;
            while(k < bag.tokenMap.get(tokenList[markIndex])){
                sortedBag.add(tokenIdtoAdd);
                k++;
            }
            i++;
        }

        bag.sortedBag = sortedBag;
    }

}
