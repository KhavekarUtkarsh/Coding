const express = require('express')
const app = express()
const port = 3000

app.set('view engine', 'ejs'); // Here we are using the "ejs" template. For that we have to write this line.
// Note we have to use the "index.ejs" not the "index.html" in oredr to use the ejs template. Also we have to put in it the folder named "views".

app.get('/', (req, res) => {
  //   res.send('Hello World!')
  let siteName = "Adidas"
  let searchText = "Search Now"
  // res.sendFile("templates/index.html", { root: __dirname })
  arr= [1,54,65]
  res.render("index", {siteName:siteName, searchText: searchText,arr:arr}) // Due to use of "ejs" we don't have to write the name of file as "index.html". Here we can simply pass the objects as " siteName, searchText, arr "
})

app.get('/blog/:slug', (req, res) => {
  let blogTitle = "Adidas why ans When?"
  let blogContent = "It's a very good Brand!"
  // res.sendFile("templates/index.html", { root: __dirname })
  res.render("blogpost", {blogTitle:blogTitle , blogContent:blogContent}) // Here we passed the names in the Template.
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})