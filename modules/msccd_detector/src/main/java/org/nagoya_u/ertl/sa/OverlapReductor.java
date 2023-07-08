package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
// import java.util.concurrent.ArrayBlockingQueue;
// import java.util.concurrent.ThreadPoolExecutor;
// import java.util.concurrent.TimeUnit;
// import java.util.concurrent.locks.Lock;
// import java.util.concurrent.locks.ReentrantLock;


public class OverlapReductor {
    public ArrayList<ArrayList<ArrayList<TokenBag>>> bagCollection;
    private HashMap<Integer, HashMap<Integer, ArrayList<Integer[]>>> fileCloneMap;
    public int thread_num;
    public int mode;
    // private int projectNum;
    // private ArrayList<HashMap<Integer, HashMap<Integer, ArrayList<Integer[]>>>> fileCloneMapArr; 

    OverlapReductor(ArrayList<ArrayList<ArrayList<TokenBag>>> bagCollection, int threadNum, int mode){
        this.bagCollection = bagCollection;
        fileCloneMap = new HashMap<Integer, HashMap<Integer, ArrayList<Integer[]>>>();
        thread_num = threadNum;
        this.mode = mode;
        // projectNum = bagCollection.size();
        // fileCloneMapArr = new ArrayList<HashMap<Integer, HashMap<Integer, ArrayList<Integer[]>>>>();
        // for(int i = 0 ; i < projectNum; i++)
        //     fileCloneMapArr.add(new HashMap<Integer, HashMap<Integer, ArrayList<Integer[]>>>());

    }

    // Thread pool error  need to be tested
    // public ArrayList<Integer[]> runs(ArrayList<ArrayList<LinkedList<TokenBag>>> clones){
    //     ArrayList<Integer[]> res = new ArrayList<Integer[]>();

    //     LinkedList<ArrayList<LinkedList<TokenBag>>> taskQueue = new LinkedList<ArrayList<LinkedList<TokenBag>>>();

    //     Lock lock = new ReentrantLock();
        
    //     for(ArrayList<LinkedList<TokenBag>> roundData : clones)
    //         taskQueue.add(roundData);

    //     while (taskQueue.size() > 1){
    //         ThreadPoolExecutor threadPool = new ThreadPoolExecutor(thread_num, thread_num, 60, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(20));

    //         for(int i = 0; i < taskQueue.size()-1; i+=2){
    //             OverlapReductor_thread thread = new OverlapReductor_thread(bagCollection,i, taskQueue , lock);
    //             threadPool.execute(thread);
    //         }
    //         threadPool.shutdown();
    //         try{
    //             threadPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.MINUTES);
    //         }catch(InterruptedException e){
    //             e.printStackTrace();
    //         }

    //         for (ArrayList<LinkedList<TokenBag>> r : taskQueue)
    //             if (r == null)
    //                 taskQueue.remove(r);
    //     }

    //     for(LinkedList<TokenBag> pair : taskQueue.get(0)){
    //         Integer[] tmp = {pair.get(0).fileId,pair.get(0).bagId,pair.get(1).fileId,pair.get(1).bagId};
    //         res.add(tmp);
    //     }
    //     return res;
    // }






    public ArrayList<ArrayList <Integer>> run( ArrayList<ArrayList<LinkedList<TokenBag>>> clones){
        ArrayList<ArrayList <Integer>> res = new ArrayList<ArrayList <Integer>>();
        if (this.mode == 1){
            for (ArrayList<LinkedList<TokenBag>> classPerRound : clones){
                for (LinkedList<TokenBag> cloneClass : classPerRound){
                    ArrayList <Integer> tmp = new ArrayList<>();
                    for (TokenBag tBag : cloneClass){
                        tmp.add(tBag.projectId);
                        tmp.add(tBag.fileId);
                        tmp.add(tBag.bagId);
                    }
                    res.add(tmp);
                }
            }

            return res;
        }
        else{
            TokenBag bagA,bagB;
            for( int round = 0; round < clones.size(); round++){
                for(LinkedList<TokenBag> pair : clones.get(round)){
                    bagA = pair.get(0);
                    bagB = pair.get(1);

                    // if (bagA.fileId == 507 && bagA.bagId == 166 && bagB.fileId==507 && bagB.bagId == 231)
                    //     System.out.println("312312312");
                    // if (bagA.fileId == 608 && bagA.bagId == 3 && bagB.fileId==633 && bagB.bagId == 3)
                    //     System.out.println("312312312");
                        

                    if ( !ifBagOverLapByFileCloneMap(bagA, bagB) && !ifSelfOverlappedClone(bagA, bagB)){
                        addFileCloneMapItem(bagA, bagB);
                        ArrayList <Integer> tmp = new ArrayList<Integer>();
                        tmp.add(bagA.projectId); 
                        tmp.add(bagA.fileId);
                        tmp.add(bagA.bagId);

                        tmp.add(bagB.projectId);
                        tmp.add(bagB.fileId);
                        tmp.add(bagB.bagId);
                        
                        res.add(tmp);
                    }

                }
            }
            return res;
        }
    }

    private void addFileCloneMapItem(TokenBag bagA, TokenBag bagB){
        if(!fileCloneMap.containsKey(bagA.fileId))
            fileCloneMap.put(bagA.fileId, new HashMap<Integer, ArrayList<Integer[]>>());
        
        if (!fileCloneMap.get(bagA.fileId).containsKey(bagB.fileId))
            fileCloneMap.get(bagA.fileId).put(bagB.fileId, new ArrayList<Integer[]>());
        
        Integer[] tmp = {bagA.projectId,bagA.fileId,bagA.bagId,bagB.projectId,bagB.fileId,bagB.bagId};
        fileCloneMap.get(bagA.fileId).get(bagB.fileId).add(tmp);


    }

    private boolean ifSelfOverlappedClone(TokenBag bagA, TokenBag bagB){
        if( (bagA.bagId == 0) || (bagB.bagId == 0)){
            if((bagA.fileId == bagB.fileId) && (bagA.projectId == bagB.projectId)) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


    private boolean ifBagOverLapByFileCloneMap(TokenBag bagA, TokenBag bagB){

        Integer[] testPair = {bagA.projectId,bagA.fileId,bagA.bagId,bagB.projectId,bagB.fileId,bagB.bagId};

    
        if(fileCloneMap.containsKey(bagA.fileId))
            if(fileCloneMap.get(bagA.fileId).containsKey(bagB.fileId))
                for(Integer[] existPair : fileCloneMap.get(bagA.fileId).get(bagB.fileId))
                    if (ifPairOverLap(existPair, testPair) )
                        return true;

        return false;
    }

    private boolean ifPairOverLap(Integer[] pairA, Integer[] pairB){
        // pair[bagA.fileid, bagA.bagid, bagB.fileId, bagB.bagId]
        if(  ifBagOverLap(bagCollection.get(pairA[0]).get(pairA[1]).get(pairA[2]), bagCollection.get(pairB[0]).get(pairB[1]).get(pairB[2])) && ifBagOverLap(bagCollection.get(pairA[3]).get(pairA[4]).get(pairA[5]), bagCollection.get(pairB[3]).get(pairB[4]).get(pairB[5])))
            return true;
        
        return false;
    }

    private boolean ifBagOverLap(TokenBag a, TokenBag b){
        if (a.projectId != b.projectId || a.fileId != b.fileId)
            return false;
        else{
            if ((a.startLine >= b.startLine) && (b.endLine >= a.endLine)) // a > b
                return true;
            else if ((b.startLine >= a.startLine) && (b.endLine <= a.endLine)) // a < b
                return true;
            else
                return false;
        }
    }
}
