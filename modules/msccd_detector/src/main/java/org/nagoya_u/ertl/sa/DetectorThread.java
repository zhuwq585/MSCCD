package org.nagoya_u.ertl.sa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;


public class DetectorThread extends Thread{
    public double threshold;
    public TokenFrequency gtp;
    public LinkedList<Integer> queryBlockIndexArr;
    public PartialIndex pIndex;
    public ArrayList<TokenBag> bagPool;
    public List<Integer> cloneClasses;
    public Lock lock;
    public int mode;

    // DetectorThread(double threshold, TokenFrequency gtp, PartialIndex pIndex, ArrayList<TokenBag> bagPool, ArrayList<Integer[]> cloneClasses, Lock lock){
    DetectorThread(double threshold, TokenFrequency gtp, PartialIndex pIndex, ArrayList<TokenBag> bagPool, List<Integer> cloneClasses, Lock lock, int mode){

        this.threshold = threshold;
        this.gtp = gtp;
        queryBlockIndexArr = new LinkedList<Integer>();
        this.pIndex = pIndex;
        this.bagPool = bagPool;
        this.cloneClasses = cloneClasses;
        this.lock = lock;
        this.mode = mode;
    }

    public void addQueryBlock(int i){
        queryBlockIndexArr.add(i);
    }

    public void run(){
        // System.out.println("Detection Thread Start");
        for(int queryBlockIndex : queryBlockIndexArr){
            // if(queryBlockIndex == 5224)
            //     System.out.println('s');

            LinkedList<Integer> queryBlock = bagPool.get(queryBlockIndex).sortedBag;
            int qBlockSize = queryBlock.size();
            int subBlockSize = qBlockSize - (int)Math.ceil(qBlockSize * threshold) + 1;

            ArrayList<Integer[]> candidateMap = new ArrayList<Integer[]>();
            for( int i = 0; i < bagPool.size(); i++){
                Integer[] tmp = {0,-1,-1};
                candidateMap.add(tmp);
            }

            // int queryTokenIndex;
            for(int queryTokenIndex = 0; queryTokenIndex < subBlockSize; queryTokenIndex++){
                int floorSize = (int)Math.ceil(threshold * qBlockSize);

                HashMap<Integer, ArrayList<Integer>> partialIndexItem = pIndex.getItem(queryBlock.get(queryTokenIndex));

                for( int cBagIndex : partialIndexItem.keySet()){
                    // if(cBagIndex == 4142)
                    //     System.out.println("'sad'");
                    // if ( candidateMap.get(cBagIndex) == null){
                    //     System.out.println(" candidateMap[cBagIndex]==null exists");
                    //     continue;
                    // }

                    LinkedList<Integer> cBag = bagPool.get(cBagIndex).sortedBag;
                    int cBagSize = cBag.size();

                    if (cBagSize < floorSize)
                        continue;
                    else if(cBagIndex == queryBlockIndex)
                        continue;
                    // else if ( ifBagOverLap( bagPool.get(cBagIndex), bagPool.get(queryBlockIndex)  ))
                    //     continue;
                    
                    int cTokenPositionToUpdate = -1;
                    for(int cTokenPosition : partialIndexItem.get(cBagIndex)){
                        if(cTokenPosition > candidateMap.get(cBagIndex)[1]){
                            cTokenPositionToUpdate = cTokenPosition;
                            break;
                        }
                    }
                    if(cTokenPositionToUpdate == -1)
                        continue;

                    int ct_inside = (int)Math.ceil( Math.max(qBlockSize, cBagSize) * threshold);
                    int uBound = 1 + Math.min(qBlockSize - queryTokenIndex, cBagSize - cTokenPositionToUpdate);
                    if (candidateMap.get(cBagIndex)[0] + uBound >= ct_inside){
                        candidateMap.get(cBagIndex)[0] += 1;
                        candidateMap.get(cBagIndex)[1] =  cTokenPositionToUpdate;
                        candidateMap.get(cBagIndex)[2] =  queryTokenIndex;
                    }else{
                        candidateMap.get(cBagIndex)[0] =  -1;
                        candidateMap.get(cBagIndex)[1] =  -1;
                    }
                }
            }

            // ArrayList<Integer[]> res = verifyCandidates(queryBlock, queryTokenIndex, candidateMap, bagPool, queryBlockIndex);
            ArrayList<Integer> res = verifyCandidates(queryBlock, candidateMap, bagPool, queryBlockIndex);


            // lock.lock();
            // try{
            //     for( Integer[] tmp: res)
            //         cloneClasses.add(tmp);
            // }finally{
            //     lock.unlock();
            // }
            for( Integer tmp: res)
                cloneClasses.add(tmp);
            
            
        }

        // System.out.println("Detection thread over");
    }

    // private boolean ifBagOverLap(TokenBag a, TokenBag b){
    //     if (a.fileId != b.fileId)
    //         return false;
    //     else{
    //         if( a.startLine > b.endLine || b.startLine>a.endLine)
    //             return false;
    //         else
    //             return true;
    //     }
    // }

    // private ArrayList<Integer[]> verifyCandidates(LinkedList<Integer> queryBlock, int queryTokenIndex, ArrayList<Integer[]> candidateMap, ArrayList<TokenBag> bagPool, int queryBlockIndex){
    private ArrayList<Integer> verifyCandidates(LinkedList<Integer> queryBlock, ArrayList<Integer[]> candidateMap, ArrayList<TokenBag> bagPool, int queryBlockIndex){

        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int i = 0; i < candidateMap.size(); i++){
            if (candidateMap.get(i)[0] <= 0)
                continue;
            // candidateMap.get(i)[0] = 0;

            if (i == 7269)
                System.out.print("");
            int ct = (int)Math.ceil( Math.max(queryBlock.size(), bagPool.get(i).tokenNum) * threshold);
            int tokenPosC = candidateMap.get(i)[1] + 1;
            // int tokenPosB = queryTokenIndex;
            int tokenPosB = candidateMap.get(i)[2];
            // int tokenPosC = 0;
            // int tokenPosB = 0;
            // int tokenPosB = queryTokenIndex - 2;
            // int tokenPosB = queryBlockIndex;

            LinkedList<Integer> blockC = bagPool.get(i).sortedBag;
            int lenB = queryBlock.size();
            int lenC = blockC.size();

            while( ( tokenPosB < lenB) && ( tokenPosC < lenC)){
                if ( Math.min(lenB-tokenPosB, lenC-tokenPosC) + candidateMap.get(i)[0] >= ct){
                    if (queryBlock.get(tokenPosB).equals(blockC.get(tokenPosC))  ){
                    // if (queryBlock.get(tokenPosB).intValue() == blockC.get(tokenPosC).intValue()  ){
                        candidateMap.get(i)[0] += 1;
                        tokenPosB++;
                        tokenPosC++;
                    }else{
                        // if(gtp.getFreqById(queryBlock.get(tokenPosB)) < gtp.getFreqById(blockC.get(tokenPosC)))
                        if(Integer.compare(gtp.getFreqById(queryBlock.get(tokenPosB)),  gtp.getFreqById(blockC.get(tokenPosC))) < 0 )
                            tokenPosB += 1;
                        else
                            tokenPosC += 1;
                    }
                }else{
                    break;
                }
            }
            if (candidateMap.get(i)[0] >= ct){
                if (res.size() == 0){
                    res.add(queryBlockIndex);
                }
                res.add(i);

                // Integer[] tmp = {queryBlockIndex, i};
                // res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args){
        return;
    }
}
