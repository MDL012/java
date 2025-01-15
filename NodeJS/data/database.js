import sqlite from "sqlite3";
const db = new sqlite.Database("./data/database.sqlite");

async function initialize(){
    await dbRun("DROP TABLE IF EXISTS termekek");
    await dbRun(
        'CREATE TABLE IF NOT EXISTS termekek (id INTEGER PRIMARY KEY AUTOINCREMENT, name STRING, brand STRING, description STRING, price INTEGER)'
    );
    await dbRun(
        'INSERTINTO cors (termekek VALUES)'
    );
}
async function dbRun(sql,params =[]) {
    return new Promise((resalve, reject) => {
        db.run(sql, params,function(err)  {
            if(err){
                reject(err);
            }else{
                resalve(this);
            }
    });
})
}

export {db,dbRun,initialize}