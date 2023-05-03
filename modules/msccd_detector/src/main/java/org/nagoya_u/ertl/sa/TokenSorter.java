package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

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
        for(TokenBag bag : bagList){
            // }
            sortBag(bag);

        }
    }

    // version 1 : too slow
    // private void sortBag_old(TokenBag bag){
    //     LinkedList<Integer> sortedBag = new LinkedList<Integer>();
        

    //     String[] tokenList = bag.getAllToken();
    //     LinkedList<Integer> freqList = new LinkedList<Integer>();
    //     for(int i = 0; i < tokenList.length;i++)
    //         freqList.add(gtp.getFreqByToken(tokenList[i]));
        
    //     int i = 0;
    //     int j;
    //     int rightTmp;
    //     int markIndex;
    //     while(i < freqList.size()){
    //         j = 0;
    //         rightTmp = Integer.MAX_VALUE;
    //         markIndex = j;
    //         while( j < freqList.size()){
    //             if(freqList.get(j) < rightTmp){
    //                 rightTmp = freqList.get(j);
    //                 markIndex = j;
    //             }
    //             j++;
    //         }

    //         freqList.set(markIndex, Integer.MAX_VALUE);

    //         int tokenIdtoAdd = gtp.getIdByToken(tokenList[markIndex]);
    //         int k = 0;
    //         while(k < bag.tokenMap.get(tokenList[markIndex])){
    //             sortedBag.add(tokenIdtoAdd);
    //             k++;
    //         }
    //         i++;
    //     }

    //     bag.sortedBag = sortedBag;
    //     // return sortedBag;
    // }

    // private void sortBag(TokenBag bag){
    //     LinkedList<Integer> res = new LinkedList<Integer>();
    //     for(String token : bag.getAllToken()){
    //         res.add(this.gtp.getIdByToken(token));
    //     }

    //     quickSort(res, 0, res.size()-1);

    //     bag.sortedBag = res;
    // }

    // private LinkedList<Integer> sortBag(TokenBag bag){
    //     LinkedList<Integer> res = new LinkedList<Integer>();
    //     LinkedList<Integer []> tmp = new LinkedList<Integer []>();
    //     for(String token : bag.getAllToken()){
    //         Integer [] insertNode = {this.gtp.getIdByToken(token), this.gtp.getFreqByToken(token)};
    //         tmp.add( insertNode );
    //     }

    //     quickSort_nocurision(tmp);

    //     for (Integer[] a : tmp){
    //         res.add(a[0]);
    //     }

    //     // bag.sortedBag = res;
    //     return res;
    // }


    // version 2: too slow
    // private void quickSort(List list, Integer leftIndex, Integer rightIndex){
    //     if (leftIndex > rightIndex || leftIndex < 0 || rightIndex < 0)
    //         return;

    //     Integer q = partition(list, leftIndex, rightIndex);
    //     quickSort(list, 0, q-1);
    //     quickSort(list, q+1, rightIndex);

    // }

    // private Integer partition(List<Integer> list, Integer leftIndex, Integer rightIndex){
    //     Integer x = list.get(rightIndex);
    //     Integer i = leftIndex - 1;

    //     Integer j = leftIndex;
    //     while(j <= rightIndex - 1){
    //         // if(list.get(j) <= x)
    //         if (freqCompare(list.get(j), x)){
    //             i+=1;
    //             listSwap(list, i, j);
    //         }

    //         j++;
    //     }
    //     listSwap(list, i+1, rightIndex);
    //     return i + 1;
    // }

    // private void listSwap(List list, Integer index1, Integer index2){
    //     Integer tmp = (Integer) list.get(index1);

    //     list.set(index1, list.get(index2));
    //     list.set(index2, tmp);
    // }

    // private boolean freqCompare(Integer tokenId1, Integer tokenId2){ // freq(id1) <= freq(id2) -> true
    //     if(gtp.getFreqById(tokenId1) <= gtp.getFreqById(tokenId2))
    //         return true;
    //     else
    //         return false;
        
    // }


    // version 3: too slow
    // private void quickSort_nocurision(List<Integer []> list){ // list: [[id, freq], ...]
    //     LinkedList<Integer []> stuck = new LinkedList<>(); // [startIndex, endIndex, pivotIndex]
    //     Integer [] newNode = {0, list.size()-1, Math.round((list.size()-1) / 2)};
    //     stuck.add( newNode );

    //     Integer leftIndex,rightIndex,pivot,cursor;
    //     Integer[] swapTmp;
    //     while( !stuck.isEmpty() ){
    //         Integer[] currentNode = stuck.pop();

    //         // partition
    //         pivot = currentNode[2];
    //         leftIndex = currentNode[0];
    //         rightIndex = currentNode[1];

    //         for(cursor = leftIndex; cursor <= rightIndex; cursor+=1){
    //             if (list.get(cursor)[1] > list.get(pivot)[1]){
    //                 swapTmp = list.get(cursor);
    //                 list.set(cursor, list.get(pivot));
    //                 list.set(pivot, swapTmp);
    //             }
    //         }

    //         if (pivot + 1 < rightIndex){
    //             Integer [] newRightNode = {pivot + 1, rightIndex, pivot + 1 + Math.round( (rightIndex - pivot + 1) / 2)};
    //             stuck.push(newRightNode);
    //         }
    //         if (leftIndex < pivot - 1){
    //             Integer [] newLeftNode = {leftIndex, pivot - 1, leftIndex + Math.round((pivot - 1 - leftIndex) / 2)};
    //             stuck.push(newLeftNode);   
    //         }
    //     }
    // }

    // version 4: It seems that i am so stupid.
    private void sortBag(TokenBag bag){
        LinkedList<Integer> res = new LinkedList<Integer>();
        LinkedList<Integer []> tmp = new LinkedList<Integer []>();
        for(Integer tokenID : bag.getAllToken_ID()){
            Integer [] insertNode = {tokenID, this.gtp.getFreqById(tokenID)};
            tmp.add( insertNode );
        }

        // Collections.sort(tmp,new Comparator<Integer[]>(){
        //         @Override
        //         public int compare(Integer[] o1, Integer[] o2) {
        //             return o1[1] - o2[1];
        //         }
        //     });

        tmp.sort(new Comparator<Integer[]>(){

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                // // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'compare'");
                return o1[1] - o2[1];
            }

        });

        for (Integer[] a : tmp){
            for(Integer times  = 0; times < bag.tokenMap_id.get(a[0]); times++){
                res.add(a[0]);
            }
        }

        bag.sortedBag = res;
        // return res;
    }
}
