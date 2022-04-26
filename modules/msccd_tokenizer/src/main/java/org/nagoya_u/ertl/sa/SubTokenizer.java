package org.nagoya_u.ertl.sa;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class SubTokenizer extends Thread {
    
    // private ArrayList<String>   files;
    // private ArrayList<Integer>  fileIdArray;
    private ArrayList<SourceFile> files;
    private ParseTreeController pController;
    private ArrayBlockingQueue<ArrayList<TokenBag>> blockingQueue;
    
    SubTokenizer(ArrayList<SourceFile> files, KeywordsSet s, int minSize, ArrayBlockingQueue<ArrayList<TokenBag>> q){
        // System.out.println(files.toString());
        if ( files == null || files.size() == 0)
            this.files = new ArrayList<SourceFile>();
        else
            this.files = files;
        
            pController = new ParseTreeController(s, minSize);
        this.blockingQueue = q;
        // fileIdArray = new ArrayList<Integer>();
    }

    // public void addFile(String filePath){
    //     if(filePath.length() > 0)
    //         files.add(filePath);
    //         fileIdArray.add(fileId);
    // }
    public void addFile(SourceFile file){
        files.add(file);
    }

    // public ArrayList<ArrayList<TokenBag>> run_s(){
    //     ArrayList<ArrayList<TokenBag>> res = new ArrayList<ArrayList<TokenBag>>();
    //     for (int i = 0; i < files.size(); i++){
    //         res.add(this.pController.run(this.files.get(i), i + startFileIndex));
    //     }
    //     return res;
    // } 


    public void run(){

        for (int i = 0; i < files.size(); i++){
            ArrayList<TokenBag> tmp = this.pController.run(this.files.get(i));
            // for( int j = 0; j < tmp.size(); j++){
            //     // res.add(tmp.get(j));
            // }
            try{
                if (tmp == null)
                    blockingQueue.add(new ArrayList<TokenBag>());
                else
                    blockingQueue.add(tmp);
            }catch(IllegalStateException e){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException f){
                    System.out.println("InterruptedException:41");
                }
                blockingQueue.add(tmp);
            }
            
        }
        
    }
}
