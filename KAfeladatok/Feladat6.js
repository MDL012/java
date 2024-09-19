function keres(){
    let kereso = document.getElementById("kereso").value;//CirNOPE9
    console.log(kereso)
    let szo0 = ""
    fetch("https://www.codewars.com/api/v1/users/" + kereso)
    .then(x => x.json())
    .then(y => {
        if(y.username){
            console.log(y)
            if(y.name == ""){
                y.name = "---";
            }
            document.getElementById("kiíras").innerHTML = "\    <p>Felhasználó név: "+y.username+"</p><p>Valós név: "+ y.name +"</p><p>Összesitet pont: "+ y.honor+"</p>"; 
        }
        else{
            document.getElementById("kiíras").innerHTML = "\    <h1>404 HIBA!!!</h1><h2> " + kereso +" nevű felhasználó nem létezik!</h2>"; 
        }
    })
    
}
