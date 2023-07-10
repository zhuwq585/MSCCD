package org.nagoya_u.ertl.sa;

import java.util.ArrayList;
import java.time.LocalTime;
public class App 
{
    public static void main( String[] args )
    {
        // args  
        String outputFolder         = args[0];
        String tokenBagSourcePath   = args[1];
        int    minToken             = Integer.valueOf(args[2]);
        Double similarity_threshold = Double.valueOf(args[3]);
        int    thread_num           = Integer.valueOf(args[4]);
        int    max_round            = Integer.valueOf(args[5]);
        String mode                 = args[6];
        // args end

        // //testArgs
        // String outputFolder         = "/home/syu/workspace/MCCD/Project/tasks/";
        // String tokenBagSourcePath   = "/Users/syu/workspace/MSCCD/tasks/task2000004/tokenBags";
        // int    minToken             = 20;
        // double similarity_threshold = 0.7;
        // int    thread_num           = 8;
        // int    max_round            = 4;
        // String mode                 = "pair";
        


        TokenFrequency gtp = new TokenFrequency();

        System.out.println("load token bags.");
        // System.out.println(LocalTime.now());
        TokenBagController tBagController = new TokenBagController(tokenBagSourcePath, gtp, thread_num, minToken, max_round);
        System.out.println("over");
        // System.out.println(LocalTime.now());


        Detector cloneDetector = new Detector(gtp, tBagController, minToken, similarity_threshold, thread_num, max_round, mode);
        ArrayList<ArrayList<Integer>>  res = cloneDetector.run();
        // System.out.println(LocalTime.now());

        ResultReport rpt = new ResultReport();
        rpt.saveResult(res, outputFolder);
        // System.out.println(LocalTime.now());

    }
}