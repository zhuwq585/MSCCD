package org.nagoya_u.ertl.sa;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.util.regex.*;

class ParseTreeController extends Thread{
    public List<Token>             lexicalUnitsArray;
    public ArrayList<TreeNodeInfo> allNode           = new ArrayList<TreeNodeInfo>();
    public ArrayList<TreeNodeInfo> allLeafNode       = new ArrayList<TreeNodeInfo>();
    public ArrayList<Integer>      bagNodeArr        = new ArrayList<Integer>();
    public ParseTree               pTree             = null;
    public KeywordsSet             keywordsSet;
    public int                     minSize;

    public int    fileId;
    public String filePath;
    public int    projectId;
    public int    maxLexicalUnitIndex;

    public ParserController pController; 

    static private String REGEX_OPR = "[^0-9a-zA-Z]+";
    // static private String REGEX_HEX = "";
    // static private String REGEX_OCT = "";
    // static private String REGEX_BIN = "";

    ParseTreeController(KeywordsSet s, int minSize){
        pController = new ParserController();
        if(s != null)
            keywordsSet = s;

        if(minSize > -1)
            this.minSize  = minSize;
        
            this.maxLexicalUnitIndex = -1;
    }    
    
    public TokenBag runSimplyTokenize(String filePath){
        System.out.println("executing file: " + filePath + " as query bag.");
        TokenBag res = new TokenBag(-1, -1, -1, -1);
        
        if (pController.run(filePath)){
            setParseTree(pController.getPTree());
            List<Token> tokens = pController.getLexicalUnits();

            int tokenType;
            for (Token commonToken : tokens){
                String tokenText = commonToken.getText();
                tokenType = getTokenType(tokenText);
                if (tokenType == 1)
                    res.addToken(tokenText);
                else if (tokenType == 3){
                    String[] splitedToken = stringSplit(tokenText);
                    for(int i = 0; i < splitedToken.length; i++)
                        res.addToken(splitedToken[i]);
                }
            }
        }
        return res;
    }

    private TokenBag generateFileLevelBag(){
        TokenBag res = new TokenBag(this.fileId, 0, -1, this.projectId);
        List<Token> tokens = pController.getLexicalUnits();
        int tokenType;
        for (Token commonToken : tokens){
            String tokenText = commonToken.getText();
            tokenType = getTokenType(tokenText);
            if (tokenType == 1)
                res.addToken(tokenText);
            else if (tokenType == 3){
                String[] splitedToken = stringSplit(tokenText);
                for(int i = 0; i < splitedToken.length; i++)
                    res.addToken(splitedToken[i]);
            }
        }
        res.setPosition(tokens.get(0).getLine(), tokens.get(tokens.size()-1).getLine());
        return res;
    }

    
    public ArrayList<TokenBag> run(SourceFile sFile){  // generate token bags for a file
        System.out.println("executing file: " + sFile.filePath);

        this.filePath  = sFile.filePath;
        this.fileId    = sFile.fileId;
        this.projectId = sFile.projectId;

        try{
        if(pController.run(filePath)){
            setParseTree(pController.getPTree());
            setLexicalUnitsArray(pController.getLexicalUnits());

            if(lexicalUnitsArray.size() < minSize){
                System.out.println("Failed to parse " + filePath + "by parse error or minimal size limitation");
                return null;
            }
            
            ArrayList<TokenBag> res = getAllTokenBag();

            if (res.size() == 0){
                TokenBag fileLevelBag = this.generateFileLevelBag();
                res.add(0, fileLevelBag);
            }
            // }else if( res.get(0).tokenNum < minSize){
            //     TokenBag fileLevelBag = this.generateFileLevelBag();
            //     res.add(0, fileLevelBag);
            // }



            int currentBagId = 0;
            while(currentBagId < res.size()){
                res.get(currentBagId).setBagId(currentBagId);
                currentBagId++;
            }
            

            reset();
            return res;
    
        }
    
        else
            return null;
    }catch(OutOfMemoryError e){
        return null;
    }
    }

    private boolean ifGeneratedBagOverlaped(ArrayList<TokenBag> generatedBags, TokenBag newBag){
        for (TokenBag generatedBag : generatedBags ){
            if (generatedBag.ifBagIdentified(newBag)){
                return true;
            }
        }
        return false;
    }

    private ArrayList<TokenBag> getAllTokenBag(){
        ArrayList<TokenBag> result = new ArrayList<TokenBag>();

        indexGeneration();
        bagNodeExtraction();

        for(int i = 0; i < bagNodeArr.size();i++){
            TokenBag addBag = tokenBagGeneration(bagNodeArr.get(i)); 
            if((addBag != null)&&(! ifGeneratedBagOverlaped(result, addBag)) ){
                result.add( addBag );
            }
        }

        return result;

    }

    private void reset(){
        lexicalUnitsArray = null;
        allNode     = new ArrayList<TreeNodeInfo>();
        allLeafNode = new ArrayList<TreeNodeInfo>();
        bagNodeArr  = new ArrayList<Integer>();
        pTree       = null;
        filePath    = null;
        pController.reset();
    }

    private void setLexicalUnitsArray(List<Token> arr){
        if (arr != null)
            lexicalUnitsArray = arr;
        if (arr.get(arr.size() - 1).getText() == "<EOF>")
            this.maxLexicalUnitIndex = arr.size() - 1;
    };

    private void setParseTree(ParseTree tree){
        if(tree != null)
            pTree = tree;
    };


    private TokenBag tokenBagGeneration(int bagNodeIndex){
        ParseTree bagNode  = allNode.get(bagNodeIndex).treeNode;
        int startNodeIndex = bagNode.getStart().getTreeNodeIndex(),
            stopNodeIndex  = bagNode.getStop().getTreeNodeIndex();

        if (stopNodeIndex == this.maxLexicalUnitIndex){
            stopNodeIndex -= 1;
        }

        TokenBag tBag = new TokenBag(fileId, bagNode.getNodeInfoObj().getGranularity(), bagNode.getNodeInfoObj().getSymbolNum(), projectId);

        ParseTree leafNodeTmp;
        int typeTmp;
        
        for(int i = startNodeIndex; i <= stopNodeIndex ; i++){
            typeTmp = allNode.get(i).getTreeNode().getNodeInfoObj().getTokenType();
            if(typeTmp != 0 ){

                leafNodeTmp = allNode.get(i).getTreeNode();
                if(leafNodeTmp.getSplitedToken() == null)
                    tBag.addToken( leafNodeTmp.getText() );
                else
                    for (int j = 0; j < leafNodeTmp.getSplitedToken().length;j++)
                        tBag.addToken(leafNodeTmp.getSplitedToken()[j]);                        

                if(typeTmp == 1)
                    tBag.addKeywords();
            }
        }

        if (tBag.tokenNum < minSize)
            return null;

        try{
            tBag.setPosition(allNode.get(startNodeIndex).getTreeNode().getSymbol().getLine(), allNode.get(stopNodeIndex).getTreeNode().getSymbol().getLine());
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        return tBag;
    }

    private void bagNodeExtraction(){
        ArrayList<Integer> result = new ArrayList<Integer>();
        // not to add root node at this time？
        result.add(0);
        
        Stack<ParseTree> traverseStack = new Stack<ParseTree>();
        Stack<Integer>   depthStack    = new Stack<Integer>();
        traverseStack.push(pTree);
        depthStack.push(0);
        ParseTree currentNode, currentChild = null;
        int currentDepth, childIndex;
        int typeCheck;

        while(!traverseStack.empty()){
            currentNode  = traverseStack.pop();
            currentDepth = depthStack.pop();

            try{
                while(currentNode.getNodeInfoObj().getTokenNum() == currentNode.getChild(0).getNodeInfoObj().getTokenNum())
                    currentNode = currentNode.getChild(0);
            }catch(NullPointerException e){
                
            }
            
            // traverse all the child
            childIndex = currentNode.getChildCount() - 1;
            typeCheck  = 0;
            while(childIndex >= 0){
               try{
                currentChild = currentNode.getChild(childIndex);
                if (currentChild.getNodeInfoObj().getTokenType() == 1)
                    typeCheck = 1;
                    
                // if (currentChild.getNodeInfoObj().getTokenNum() >= minSize){

                if (currentChild.getNodeInfoObj().getSymbolNum() >= minSize){
                    traverseStack.push(currentChild);
                    depthStack.push(currentDepth + 1);
                }
               }catch(Exception e){
                   System.out.println(e.toString());

               }
               childIndex--;
            }

            if (currentNode.getNodeInfoObj().getTokenNum() >= minSize && typeCheck == 1){
            // if (currentNode.getNodeInfoObj().getSymbolNum() >= minSize && typeCheck == 1){
                currentNode.getNodeInfoObj().setGranularity(currentDepth);
                result.add(currentNode.getNodeInfoObj().getIndex());
            }
        }
        bagNodeArr = result;
    }


// index geneation 
    private void indexGeneration(){
        Stack<ParseTree> traverseStack = new Stack<ParseTree>();
        traverseStack.push(pTree);
        ParseTree currentNode = null;
        int nodeIndex         = 0;
        // the nodeIndex of a ParseTree Node is defined as the traverse order in deep-first traverse



        while(!traverseStack.empty()){
            currentNode = traverseStack.pop();
            Object       nodeInfoObjj = new TreeNodeInfo(currentNode, nodeIndex); 
            TreeNodeInfo nodeInfoObj  = (TreeNodeInfo)nodeInfoObjj;
            currentNode.setNodeInfoObj(nodeInfoObj);
            allNode.add(nodeInfoObj);
            

            if(! (currentNode instanceof TerminalNodeImpl) ){
                int maxChildIndex = currentNode.getChildCount() - 1;
                int n = maxChildIndex;
                while(n >= 0){
                    traverseStack.push(currentNode.getChild(n));
                    n -= 1;
                }
            }
            else{
                // leafnode
                allLeafNode.add(nodeInfoObj);
                currentNode.getSymbol().setTreeNodeIndex(nodeIndex);
                if ( setTokenType(currentNode) ) { // currentNode contains tokens
                    // 向上更新各个树结点的状态
                    updateSize_Type(currentNode);
                }
            }
            setSymbolNum(currentNode);
            nodeIndex++;
        }
    };

    private void setSymbolNum(ParseTree currentNode){
        try{
            int symbolNum = currentNode.getStop().getTokenIndex() - currentNode.getStart().getTokenIndex()+ 1;
            currentNode.getNodeInfoObj().setSymbolNum(symbolNum);
        }catch(NullPointerException e){
            currentNode.getNodeInfoObj().setSymbolNum(1);
            System.out.println("Set symbolNum as 1 by parser error");
        }
    }

    private void updateSize_Type(ParseTree startNode){
        int size = startNode.getNodeInfoObj().getTokenNum();
        int type = startNode.getNodeInfoObj().getTokenType();

        NodeInfo tmpObj;
        
        ParseTree current = startNode.getParent();
        while(current != null){
            tmpObj = current.getNodeInfoObj();
            tmpObj.setTokenType(tmpObj.getTokenType() | type);
            tmpObj.setTokenNum(tmpObj.getTokenNum() + size);
            current = current.getParent();
        }
    }

    private boolean setTokenType( ParseTree leafNode){
        int type = 0;
        try{
            type = getTokenType(leafNode.getSymbol().getText());
        }catch(NullPointerException e){
            System.out.println(e.toString());
        }
        leafNode.getNodeInfoObj().setTokenType(type);
        if (type == 0)
            return false;
        else
            // if(type == 3)
                stringSplit(leafNode);
            
            leafNode.getNodeInfoObj().setTokenNum(1);
            return true;
    }

    private void stringSplit(ParseTree leafNode){
        // if do not have space in the string, just return
        String tokenText = leafNode.getSymbol().getText();
        // tokenText = tokenText.substring(1, tokenText.length());

        Pattern p = Pattern.compile("\\W+");
        String[] splitedToken = p.split(tokenText);
        // String[] splitedToken = tokenText.split("\\s");

        // 因为会有单token去除分割符的情况 故1时也设置spliteToken
        if ( splitedToken.length >= 1){
            leafNode.setSplitedToken(splitedToken);
            leafNode.getNodeInfoObj().setTokenNum(splitedToken.length);
        }
    }

    private String[] stringSplit(String tokenText){
        Pattern p = Pattern.compile("\\W+");
        String[] splitedToken = p.split(tokenText);
        return splitedToken;
    }


    private int getTokenType(String str){ // 0other 1keyword 3identify or literial
        if (str == null)
            return 0;
            
        if(Pattern.matches(REGEX_OPR, str)) // operators and other separator charactors
            return 0;
        else if ( keywordsSet.checkKeywords(str) ) // keyword
            return 1;
        else
            return 3;
    }

// index genertaion related end


    // public static void main(String[] args){
    //     String test = "`helloworld\n`";
    //     Pattern p = Pattern.compile("\\W+");
    //     String[] splitedToken = p.split(test);
    //    return;
    // }
}

class TreeNodeInfo implements NodeInfo{
    public ParseTree treeNode;
    public int tokenNum;
    public int treeNodeNum;
    public int tokenType;
    public int index;
    public int symbolNum;
    public int granularity;

    TreeNodeInfo(ParseTree node, int index){
        treeNode    = node;
        this.index  = index;
        tokenNum    = 0;
        tokenType   = 0;
        granularity = 0;
        // granularity = -10; // None Bag Node
    }

    public void setSymbolNum(int i){
        symbolNum = i;
    }

    public void setTokenNum(int i){
        tokenNum = i;
    }
    public void setTreeNodeNum(int i){
        treeNodeNum = i;
    }
    public void setTokenType(int i){
        tokenType = i;
    }
    public void setGranularity(int i){
        granularity = i;
    }


    public int getSymbolNum(){
        return symbolNum;
    }
    public int getTokenNum(){
        return tokenNum;
    }
    public int getTokenType(){
        return tokenType;
    }
    public int getIndex(){
        return index;
    }
    public int getGranularity(){
        return granularity;
    }
    public ParseTree getTreeNode(){
        return treeNode;
    }
}
