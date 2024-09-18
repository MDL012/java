function keres(){
    let szo0 = ""
    fetch("https://www.codewars.com/api/v1/users/CirNOPE9")
    .then(x => x.json())
    .then(y => {
        console.log(y)
        document.getElementById("fhnev").innerHTML = "Felhasználó név: " + y.username
    })
    
}
