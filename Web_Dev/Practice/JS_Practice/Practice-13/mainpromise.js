import fs from "fs/promises"
let a= await fs.readFile("./uk.txt");  // Here we can directly use the "await" because we are in the Async module
let b= await fs.writeFile("uk.txt", "\n\n\nThis is Promise!!!");
console.log(a.toString(),b);