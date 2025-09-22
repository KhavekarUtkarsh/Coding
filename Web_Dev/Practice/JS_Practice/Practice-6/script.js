
// Asynchronous Nature of JavaScript

console.log("Harry is a Hacker");
console.log("Rohan is a Hecker");

setTimeout(() => {
    console.log("I am inside setTimeout function");
}, 2000);

console.log("This is the End");

// Callback Function

const callback=(arg)=>{
    console.log(arg);
}

const loadscript=(src,callback)=>{
    let sc=document.createElement("script");
    sc.src=src;
    sc.onload=callback("Harry");
    document.head.append(sc);
}

loadscript("https://cdnjs.cloudflare.com/ajax/libs/prism/9000.0.1/prism.min.js",callback)