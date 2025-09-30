const express = require('express')
const app = express()
const port = 3000
const fs= require("fs") // Used to perform tasks on files

const blog = require('./routes/blog')
app.use('/blog', blog)

// app.use(express.static("public"))

// Middleware Number-1 (Logger for our application)
app.use((req, res, next)=>{
    // console.log("M1")
    console.log(req.headers)
    req.uk="I am UK"
    fs.appendFileSync("log.txt",`${Date.now()} is a ${req.method}\n`) // Using this we can write this information inside file
    console.log(`${Date.now()} is a ${req.method}`)
    // res.send("Hacked by Middleware Number-1")  // If we write the "res.send() here then it will not pass the request further. Means there is no use of writing "next()"
    next()
})
// Middleware Number-2  
app.use((req, res, next)=>{
    console.log("M2")
    req.uk="I am URK"
    next()
})

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/about', (req, res) => {
//   res.send('Hello About!')
  res.send('Hello About!' + req.uk)
})

app.get('/contact', (req, res) => {
  res.send('Hello Contact!')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})