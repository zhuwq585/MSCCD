package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Detector {
    TokenFrequency gtp;
    TokenBagController tBagController;
    int minToken;
    double threshold;
    int thread_num;
    int maxRound;
    int mode;
    
    Detector(TokenFrequency gtp, TokenBagController tBagController, int minToken, double threshold,int threadNum, int maxRound, String mode){
        this.gtp            = gtp;
        this.tBagController = tBagController;
        this.minToken       = minToken;
        this.threshold      = threshold;
        this.thread_num     = threadNum;
        if(maxRound >= 0)
            this.maxRound   = maxRound;
        else
            this.maxRound   = tBagController.minGranularity;

        if(mode.equals("pair")){
            this.mode = 0;
        }
        else if (mode.equals("class")){
            this.mode = 1;
        }
        else{
            this.mode = 0;
        }
        
    }


	public ArrayList<ArrayList<Integer>>  run(){
        // ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<LinkedList<TokenBag>>> pairsBefore = new ArrayList<ArrayList<LinkedList<TokenBag>>>();

        int round = 0;
        while(round <= this.maxRound){
            detectionRound(round, pairsBefore);
            round++;
        }
        // overlap reduction
        OverlapReductor reductor = new OverlapReductor(tBagController.bagCollection_idIndex, thread_num, this.mode);
        return reductor.run(pairsBefore);
    }

    private void detectionRound(int round, ArrayList<ArrayList<LinkedList<TokenBag>>> resArr){
        ArrayList<TokenBag> bagPool = tBagController.bagPoolGeneration(round, minToken, gtp); // slow
        if(bagPool == null){
            return;
        }
        System.out.println("Round " + String.valueOf(round) + " started, bagPool's size is " + String.valueOf(bagPool.size()));

        PartialIndex pIndex = new PartialIndex(bagPool, threshold);
        
        resArr.add(cloneDetection(bagPool, pIndex));
        // resArr.add(cloneDetection_singleThread(bagPool, pIndex));        
    }

    // private ArrayList<LinkedList<TokenBag>> cloneDetection_singleThread(ArrayList<TokenBag> bagPool, PartialIndex pIndex){
    //     ArrayList<LinkedList<TokenBag>> res = new ArrayList<LinkedList<TokenBag>>();
    //     ArrayList<Integer[]> cloneClasses = new ArrayList<Integer[]>();
    //     int queryBlockNum = bagPool.size();

    //     Lock lock = new ReentrantLock();
       
    //     for (int queryBlockIndex = 0; queryBlockIndex < queryBlockNum; queryBlockIndex++){
    //         DetectorThread detector = new DetectorThread(threshold, gtp, pIndex, bagPool,cloneClasses,lock, this.mode);
    //         detector.addQueryBlock(queryBlockIndex);
    //         detector.run();
    //     }

    //     for ( Integer[] tmp : cloneClasses){
    //         LinkedList<TokenBag> pair = new LinkedList<TokenBag>();
    //         TokenBag bagA = bagPool.get(tmp[0]);
    //         TokenBag bagB = bagPool.get(tmp[1]);

    //         if (bagA.fileId <= bagB.fileId){
    //             pair.add(bagA);
    //             pair.add(bagB);
    //         }else{
    //             pair.add(bagB);
    //             pair.add(bagA);
    //         }
    //         res.add(pair);
    //     }
    //     System.out.println("result:" + String.valueOf(res.size()));
    //     return res;
    // }


    private ArrayList<LinkedList<TokenBag>> cloneDetection(ArrayList<TokenBag> bagPool, PartialIndex pIndex){
        ArrayList<LinkedList<TokenBag>> res = new ArrayList<LinkedList<TokenBag>>();

        List<Integer> cloneClasses = Collections.synchronizedList(new ArrayList<Integer>());  
        // new ArrayList<Integer[]>();
        
        int queryBlockNum = bagPool.size();

        Lock lock = new ReentrantLock();

        // System.out.println("Thread number: " + String.valueOf(this.thread_num));

        ArrayList<DetectorThread> threadArr = new ArrayList<DetectorThread>();
        for (int i = 0; i < thread_num; i++)
            threadArr.add(new DetectorThread(threshold, gtp, pIndex, bagPool, cloneClasses, lock, this.mode));

        int cursor = 0;
        for (int i = 0; i < bagPool.size(); i++){
            threadArr.get(cursor).addQueryBlock(i);
            cursor++;
            if(cursor >= thread_num)
                cursor = 0;
        }

        for(DetectorThread d : threadArr)
            d.start();

        for(DetectorThread e : threadArr)
            try{
                e.join();
            }catch(InterruptedException err){
                System.out.println(err.getLocalizedMessage());
            }

        


        if (this.mode == 0){ // pair
            TokenBag bagA = bagPool.get(0);
            cursor = 1;
            while (cursor < cloneClasses.size() ){
                try{
                    LinkedList<TokenBag> pair = new LinkedList<TokenBag>();
                    TokenBag bagB = bagPool.get(cursor);

                    if (bagA.fileId <= bagB.fileId){
                        pair.add(bagA);
                        pair.add(bagB);
                    }else{
                        pair.add(bagB);
                        pair.add(bagA);
                    }
                    res.add(pair);
                    cursor += 1;
                }catch(NullPointerException e){
                    e.printStackTrace();
                    cursor += 1;
                    continue;
                }
            }

        }
        else if(this.mode == 1) { //class
            LinkedList<TokenBag> cloneClass = new LinkedList<TokenBag>();
            for (Integer bagIndex : cloneClasses){
                try{
                    cloneClass.add(bagPool.get(bagIndex));
                }catch(NullPointerException e){
                    e.printStackTrace();
                    continue;
                }    
            }

            if (cloneClass.size() >= 2){
                res.add(cloneClass);
            }
        }

       
        // for ( Integer tmp : cloneClasses){
       
        // System.out.println("result:" + String.valueOf(res.size()));
        return res;   
    } 
}