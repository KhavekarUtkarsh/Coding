
// Here we used the concept known as "Fetch API"
// Is is built-in in the JS
// Here we have to use two awaits
// The line of "fetch" return a Promise
// The using another await we "Parse" the Promise
// Here we have parsed the data in JSON.
// We can also pass it into "x.text" format    

async function getData(){
    // Simulation of getting data from server
    let x= await fetch('https://jsonplaceholder.typicode.com/todos/1');
    let data=await x.json();
    console.log(data);
}


// async function getData(){
//     // Simulation of getting data from server
//     return new Promise((resolve,reject)=>{
//         setTimeout(() => {
//             resolve(455);
//         }, 3500);
//     })
// }

async function main(){
    console.log("Loading Modules");

    console.log("Do someting else")

    console.log("Load Data")

    let data= await getData();

    console.log(data);

    console.log("Process data");

    console.log("Task 2");

}

main();


// Here "main()" is a function which is "async" declared
// Then we are calling the "main()" function.
// Then after calling it runs all the tasks/ commands.
// At the line of calling of the "getData()" function as we used "await" it will wait till it get / load the data.
// If we are not using the "await" then it will not wait and executes all the other commands and let the data fetch in background.

// The main benefit to declare a function as "async" is that it can get run in background without caring about other code.




// Instead of using the "async and await" we can follow the below approach (Callback Approach)-

// data.then((v)=>{
//     console.log(data);

//     console.log("Process data");

//     console.log("Task 2");
// })