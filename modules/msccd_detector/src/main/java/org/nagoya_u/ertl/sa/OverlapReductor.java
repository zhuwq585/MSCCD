package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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



    public boolean ifIncludedCloneClass(LinkedList<TokenBag> candidateClass, ArrayList<LinkedList<TokenBag>> resInTBag){

        for (LinkedList<TokenBag> testClass : resInTBag){
            if (ifIncluded(candidateClass, testClass)){
                return true;
            }
        }

        return false;
    }

    public boolean ifIncluded(LinkedList<TokenBag> candidateClass, LinkedList<TokenBag> testClass){ 
        // true: candidateClass is included by testClass
        
        if (candidateClass.size() > testClass.size()){
            return false;
        }

        int cursorC = candidateClass.size() - 1;
        int cursorT = testClass.size() - 1;

        while(cursorC >= 0 && cursorT >= 0){
            if ( candidateClass.get(cursorC).fileCoverEqual(testClass.get(cursorT))){
                cursorC--;
                cursorT--;
            }
            else{
                cursorT--;
            }
        }

        // if (cursorT == -1){
        if (cursorC == -1){

            return true;
        }
        else{
            return false;
        }
        
    }


// [[0, 64, 3],[0, 64, 7],[0, 64, 11],[0, 64, 15],[0, 64, 19],[0, 64, 23],[0, 64, 27],[0, 64, 29]]
// [[0, 64, 3],[0, 64, 7],[0, 64, 11],[0, 64, 15],[0, 64, 19],[0, 64, 23],[0, 64, 27]]

    public void removeSelfIncludedBag(LinkedList<TokenBag> cloneClass){
        TokenBag centerBag = cloneClass.get(0);
        int cursor = 1; 
        while (cursor < cloneClass.size()){
            if(ifBagOverLap(centerBag, cloneClass.get(cursor))){
                cloneClass.remove(cursor);
            }else{
                cursor++;
            }
        }


    }

    public boolean ifIdenticalCenterBagClass(LinkedList<TokenBag> cloneClass, ArrayList<LinkedList<TokenBag>> resInTBag,ArrayList<Integer> centerBagIndexArray){
        //  if center bags of two candidate clone set are corresponds to identical code segment, they are identical. 
        int testClassIndex = 0;
        while(testClassIndex < resInTBag.size()){
            LinkedList<TokenBag> testClass = resInTBag.get(testClassIndex);
            if (cloneClass.get(0).fileCoverEqual(testClass.get(centerBagIndexArray.get(testClassIndex)))){
                return true;
            }
        }
        return false;
    }

    public void cloneClassInBagSort(LinkedList<TokenBag> cloneClassInBag){
        // TokenBag centerBag = cloneClassInBag.removeFirst();
        // TokenBag centerBag = cloneClassInBag.getFirst();

        Collections.sort(cloneClassInBag, new Comparator<TokenBag>( ) {
            @Override
            public int compare(TokenBag a, TokenBag b){
                return a.blockIdComparision(b);
                //  if (a.blockIdComparision(b)){ //a <= b
                //     return -1;
                //  }
                //  else{
                //     return 1;
                //  }
                
            }
        });        
        // cloneClassInBag.add(0, centerBag);
    }

    public void sortCloneClassesBySize(ArrayList<LinkedList<TokenBag>> cloneClasses){
        if (cloneClasses.size() < 2){
            return;
        }
        Collections.sort(cloneClasses, new Comparator<LinkedList<TokenBag>>(){
            @Override
            public int compare(LinkedList<TokenBag> a, LinkedList<TokenBag> b){
                if (a.size() < b.size()){ 
                    return 1;
                }
                else if (a.size() == b.size()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
    }

    public ArrayList<ArrayList <Integer>> run( ArrayList<ArrayList<LinkedList<TokenBag>>> clones){
        ArrayList<ArrayList <Integer>> res = new ArrayList<ArrayList <Integer>>();

        if (this.mode == 1){ //class
            ArrayList<LinkedList<TokenBag>> resInTBag = new ArrayList<LinkedList<TokenBag>>();
            ArrayList<Integer> centerBagIndexArray = new ArrayList<Integer>(); // saves indexes of centerbag of each clone class in resInTBag

            for (ArrayList<LinkedList<TokenBag>> classPerRound : clones){
                // testing to sort clone classes by size
                // if smaller clone class are on the top side, the filter will not work
                sortCloneClassesBySize(classPerRound);
                // delete if do not work well
                for (LinkedList<TokenBag> candicateCloneClass : classPerRound){
                    removeSelfIncludedBag(candicateCloneClass);
                    if (candicateCloneClass.size() < 2){
                        continue;
                    }

                    TokenBag centerbag = candicateCloneClass.getFirst();
                    cloneClassInBagSort(candicateCloneClass);

                    if (!ifIncludedCloneClass(candicateCloneClass, resInTBag) && !ifIdenticalCenterBagClass(candicateCloneClass, resInTBag, centerBagIndexArray)){
                        // Bug: In this time, clone class in resInTBag are not sorted (center bag are returned);

                        int cursor = 0;
                        while (cursor < candicateCloneClass.size()){
                            if( candicateCloneClass.get(cursor).blockIdEqual(centerbag) ){
                                centerBagIndexArray.add(cursor);
                                // candicateCloneClass.remove(cursor);
                                break;
                            }
                            cursor++;
                        }
                        // candicateCloneClass.add(0, centerbag);
                        resInTBag.add(candicateCloneClass);
                    }
                }
            }

            int cursor = 0;
            while (cursor < resInTBag.size() && cursor < centerBagIndexArray.size()){
                // TokenBag centerBag = resInTBag.get(cursor).get(centerBagIndexArray.get(cursor));
                // resInTBag.get(cursor).remove(centerBagIndexArray.get(cursor)); 
                int centerBagIndex = centerBagIndexArray.get(cursor);
                TokenBag centerBag = resInTBag.get(cursor).remove(centerBagIndex);
                resInTBag.get(cursor).add(0, centerBag);

                cursor++;
            }

            for (LinkedList<TokenBag> cloneClass : resInTBag){

                ArrayList <Integer> tmp = new ArrayList<>();
                for (TokenBag tBag : cloneClass){
                    tmp.add(tBag.projectId);
                    tmp.add(tBag.fileId);
                    tmp.add(tBag.bagId);

                }
                res.add(tmp);

            }

            return res;
        }
        else{  // pair
            TokenBag bagA,bagB;
            for( int round = 0; round < clones.size(); round++){
                for(LinkedList<TokenBag> pair : clones.get(round)){
                    bagA = pair.get(0);
                    bagB = pair.get(1);

                    if ( bagA.blockIdComparision(bagB) > 0 ){
                        TokenBag tmp = bagA;
                        bagA = bagB;
                        bagB = tmp;
                    }


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
