package org.nagoya_u.ertl.sa;

public class SourceFile {
    public int projectId;
    public int fileId;
    public String filePath;
    
    SourceFile(int pId, int fId, String path){
        projectId = pId;
        fileId    = fId;
        filePath  = path;
    }
}
