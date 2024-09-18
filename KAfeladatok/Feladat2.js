let ultimatelist = [];
function fel(){
    let vn = document.getElementById("vn").value;
    if (vn == ""){
        vn = " - "
    }
    let kn = document.getElementById("kn").value;
    if (kn == ""){
        kn = " - "
    }
    let ksz = document.getElementById("ksz").value;
    if (ksz == ""){
        ksz = " - "
    }
    var ijog = document.getElementById("jog").checked;
    console.log(ijog)
    let jog = "Nincs"
    if (ijog){
        jog = "Van"
    }
    let list = [vn,kn,ksz,jog];
    ultimatelist.push(list);
}

function tej(){
    let irotlist = "";
    for(let i = 0; i < ultimatelist.length;i++){
        irotlist += "<p>"+ ultimatelist[i]+ "</p>";
    }
        
    document.getElementById("lista").innerHTML = irotlist;
}
function Van(){
    let irotlist = "";
    for(let i = 0; i < ultimatelist.length;i++){
        if (ultimatelist[i][3]== "Van"){
            irotlist += "<p>"+ ultimatelist[i]+ "</p>";
        }
        
    }
        
    document.getElementById("lista").innerHTML = irotlist;
}
function Nincs(){
    let irotlist = "";
    for(let i = 0; i < ultimatelist.length;i++){
        if (ultimatelist[i][3]== "Nincs"){
            irotlist += "<p>"+ ultimatelist[i]+ "</p>";
        }
        
    }
        
    document.getElementById("lista").innerHTML = irotlist;
}