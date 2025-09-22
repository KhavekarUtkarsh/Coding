console.log("This is Promise");

let prom1 = new Promise((resolve, reject) => {
    let a = Math.random();
    if (a < 0.5) {
        reject("No random number was suporting you!"); // This is used to reject the function when the valuse is less than 0.5
    }
    else {
        setTimeout(() => {
            console.log("Yes I am Done");
            resolve("Harry");
        }, 3000);
    }
})

prom1.then((a) => { // This gives the value by using which the function gets resolved
    console.log(a);
}).catch((err)=>{
    console.log(err);
})

// When it is rejected by the reject condition in browser-->console with the red color
// If we don't want that then we can do handle by using "catch" as above