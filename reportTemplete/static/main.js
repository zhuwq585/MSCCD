window.onload = function() {
    var currentPairId = parseInt(document.getElementById("currentPairId").innerHTML);
    var currentClassId = parseInt(document.getElementById("currentClassId").innerHTML);

    var maxPairId = parseInt(document.getElementById("maxPairId").innerHTML);
    var maxClassId = parseInt(document.getElementById("maxClassId").innerHTML);

    var pairIdInputElement = document.getElementById("pairId");
    var classIdInputElement = document.getElementById("classId");

    document.getElementById("nPair").onclick = function(){
        if (currentPairId + 1 <= maxPairId ){
            pairIdInputElement.setAttribute("value", currentPairId + 1);
            document.getPair.submit();
        }else{
            alert("Already the last pair");
        }
        
    }

    document.getElementById("pPair").onclick = function(){
        if (currentPairId - 1 >= 1){
            pairIdInputElement.setAttribute("value", currentPairId - 1);
            document.getPair.submit();
        }else{
            alert("Already the first pair");
        }
    }

    document.getElementById("rPair").onclick = function(){
        var newPairId = Math.floor(Math.random() * maxPairId);
        pairIdInputElement.setAttribute("value", newPairId);
        document.getPair.submit();
    }
    


    document.getElementById("nClass").onclick = function(){
        if (currentClassId + 1 <= maxClassId ){
            classIdInputElement.setAttribute("value", currentClassId + 1);
            pairIdInputElement.setAttribute("value", 1);
            document.getPair.submit();
        }else{
            alert("Already the last class");
        }
        
    }

    document.getElementById("pClass").onclick = function(){
        if (currentClassId - 1 >= 0 ){
            classIdInputElement.setAttribute("value", currentClassId - 1);
            pairIdInputElement.setAttribute("value", 1);
            document.getPair.submit();
        }else{
            alert("Already the first class");
        }
    }

    document.getElementById("rClass").onclick = function(){
        var newClassId = Math.floor(Math.random() * maxClassId);
        classIdInputElement.setAttribute("value", newClassId);
        pairIdInputElement.setAttribute("value", 1);
        document.getPair.submit();
    }


}