package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.HashMap;

public class PartialIndex {
    private HashMap<Integer, HashMap<Integer, ArrayList<Integer>>> pIndex;

    PartialIndex(ArrayList<TokenBag> bagPool, double threshold){
        pIndex = new HashMap<Integer, HashMap<Integer, ArrayList<Integer>>>();

        for( int bagId = 0; bagId < bagPool.size(); bagId++){
            int bagLength = bagPool.get(bagId).sortedBag.size();
            
            int numToBeIndexed = bagLength - (int)Math.ceil(bagLength * threshold) + 1;

            for(int j = 0; j < numToBeIndexed; j++){
                int indexedToken = bagPool.get(bagId).sortedBag.get(j);

                if( ! pIndex.containsKey(indexedToken))
                    pIndex.put(indexedToken, new HashMap<Integer, ArrayList<Integer>>());
                if( ! pIndex.get(indexedToken).containsKey(bagId)){
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    pIndex.get(indexedToken).put(bagId, tmp);
                }
                pIndex.get(indexedToken).get(bagId).add(j);

            }
        }

    }

    public HashMap<Integer, ArrayList<Integer>> getItem(int indexedToken){
        return pIndex.get(indexedToken);
    }
}
