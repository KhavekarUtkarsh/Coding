const { error } = require("console");
const fs= require("fs");
console.log(fs);

console.log("Starting");
// fs.writeFileSync("uk.txt", "UK is a Good Boy!");

fs.writeFile("uk1.txt","UK is a good boy!!",()=>{
    console.log("done");
    fs.readFile("uk1.txt", (error,data)=>{
        console.log(error, data.toString());  // Here by using only "data" will give you the output in Buffer format so to make it readable we can use "data.toString()"
    })
});

console.log("Ending");

// Here "writeFileSync" write the file after the starting and when writing completes then the last ending executes.
// But is is not suggested, because JS is Async so we can use "writeFile".
// This will execute the starting then schedules the "writeFile" and executes the ending & after that it will print the "done"
// Here in "writeFile" the "()" means the "Callback"
// Imagine we are writing a file then reading it and again writing another file and then reading, this will make the code goes on increasing. Thererfore this situatuin is called as "Callback Hell"

// So to avoid the Callback Hell we can use the another method that "Promise". For that we have to set the "type":"module"