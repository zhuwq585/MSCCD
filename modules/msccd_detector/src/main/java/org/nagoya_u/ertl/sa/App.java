package org.nagoya_u.ertl.sa;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
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
        // args end

        // //testArgs
        // String outputFolder         = "/home/syu/workspace/MCCD/Project/tasks/";
        // String tokenBagSourcePath   = "/home/syu/workspace/MSCCD_ALL/Project/tasks/task1000003/tokenBags";
        // int    minToken             = 50;
        // double similarity_threshold = 0.7;
        // int    thread_num           = 7;
        // int    max_round            = 20;
        


        TokenFrequency gtp = new TokenFrequency();

        System.out.println("load token bags.");
        TokenBagController tBagController = new TokenBagController(tokenBagSourcePath, gtp, thread_num, minToken);
        System.out.println("over");

        Detector cloneDetector = new Detector(gtp, tBagController, minToken, similarity_threshold, thread_num, max_round);
        ArrayList<Integer[]>  res = cloneDetector.run();
        
        ResultReport rpt = new ResultReport();
        rpt.saveResult(res, outputFolder);
    }
}
