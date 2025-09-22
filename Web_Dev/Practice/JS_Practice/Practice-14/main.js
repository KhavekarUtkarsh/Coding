// server.mjs

// import { createServer } from 'node:http';
// const server = createServer((req, res) => {
//   res.writeHead(200, { 'Content-Type': 'text/plain' });
//   res.end('Hello World! How are \n');
// });

// starts a simple http server locally on port 3000
// server.listen(3000, '127.0.0.1', () => {
//   console.log('Listening on 127.0.0.1:3000');
// });

// run with `node server.mjs`

const express = require('express')
const app = express()
const port = 3000

app.use(express.static('public'))

// app.get or app.post or app.put or app.delete(path,handler)
app.get('/', (req, res) => {
    res.send('Hello World!')
})

app.get('/about', (req, res) => {
    res.send('About us')
})

app.get('/contact', (req, res) => {
    res.send('Hello contact me!')
})

app.get('/blog', (req, res) => {
    res.send('Hello blog!')
})

// app.get('/blog/intro-to-js', (req, res) => {
//     // logic to fetch intro to js from the db
//     res.send('Hello intro-to-js!')
// })

// app.get('/blog/intro-to-python', (req, res) => {
//     // logic to fetch intro to python from the db
//     res.send('Hello intro-to-python!')
// })



// To avoid the repeated use of the above method we use the below method in the Express JS
// It is a kind of creating a variable like "slug". These are URL paramaters.
// Here "request.params" is an Object
app.get('/blog/:slug/', (req, res) => {
    // logic to fetch {slug} from the db
    // For URL:http://127.0.0.1:3000/blog/uk?mode=dark&region=in
    console.log(req.params) // will output { slug: 'uk' }
    console.log(req.query) // will output { mode: 'dark', region: 'in' }
    // Here by using Question Mark(?) we can pass the "Queries"
    res.send(`Hello ${req.params.slug}`)
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})