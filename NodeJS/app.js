import express from 'express';
import core from 'core';
import {initialize} from './data/database.js';
import path from 'path'

const app = express()
const PORT = 3000

app.use(core())
app.use(express.json())

app.use('/admin', adminRoutes)

try{
    await initialize();
    app.listen(PORT, () => console.log(`server listens on port http://localhost:${PORT}`))
}catch(err){
    console.log(err.message);
}