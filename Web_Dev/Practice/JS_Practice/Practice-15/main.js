const express = require('express')
const blog = require('./routes/blog')


const app = express()
app.use('/blog', blog)

const port = 3000
app.use(express.static("public"))

app.get('/', (req, res) => {
    console.log("Hey it's a Get Request")
    res.send('Hello World!!')
})

app.post('/', (req, res) => {
    console.log("Hey it's a Post Request")
    res.send('Hello World POST!')
})

app.put('/', (req, res) => {
    console.log("Hey it's a Put Request")
    res.send('Hello World PUT!')
})

// We can also Chain them Together. This is knoen as chaining of requests.

// app.get('/', (req, res) => {
//     console.log("Hey it's a Get Request")
//     res.send('Hello World!')
// }).post('/', (req, res) => {
//     console.log("Hey it's a Post Request")
//     res.send('Hello World POST!')
// }).put('/', (req, res) => {
//     console.log("Hey it's a Put Request")
//     res.send('Hello World PUT!')
// })

app.get("/index",(req,res)=>{
    console.log("Hey its Index")
    res.sendFile('templates/index.html', {root : __dirname})
})

app.get("/api",(req,res)=>{
    res.json({a:1, b:2, c:3 ,d:4, name:["Uk","RK"]})
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})