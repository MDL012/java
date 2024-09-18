function fel(){
    let vn = document.getElementById("vn").value;
    if (vn == ""){
        vn = " - "
    }
    let kn = document.getElementById("kn").value;
    if (kn == ""){
        kn = " - "
    }
    let szi = document.getElementById("szi").value;
    if (szi == ""){
        szi = " - "
    }
    let szh = document.getElementById("szh").value;
    if (szh == ""){
        szh = " - "
    }

    let list = [vn,kn,szi,szh];

    document.getElementById("lista").innerHTML = list;
    console.log(list)
}