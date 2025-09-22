// async function sleep(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(() => {
//             resolve(45);
//         }, 1000);
//     })
// }
// let a=await sleep();
// let b=await sleep();

// The above code will give an error as-  Uncaught SyntaxError: await is only valid in async functions and the top level bodies of modules
// To solve this problem we use "IIFE(Immediate Invoke Function Experssion)" as follows-

// async function sleep(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(() => {
//             resolve(45);
//         }, 1000);
//     })
// }
// (async function main(){
//     let a=await sleep();
//     console.log(a);
//     let b=await sleep();
//     console.log(b);
// })();



async function sleep(){
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
            resolve(45);
        }, 1000);
    })
}
(async function main(){
    // let x,y=[7,20]; // This will not return values of x,y as 7 and 20
    // console.log(x,y); 

    // let [x,y]=[7,20]; // So we have to give them as an Array then it will give values
    // console.log(x,y);

    // let [x,y,...rest]=[7,20,12,34,5]; // Here it will give the first two values to the x&y and remaining to the rest. This is known as Destructuring.
    // console.log(x,y,rest);



    // Similarly We can Destructure objects on the left hand side of the assignment.

    // let obj={
    //     a:1,
    //     b:2,
    //     c:3
    // }
    // let {a,b}=obj;
    // console.log(a,b)


    function sum(a,b,c){
        return a+b+c;
    }
    let arr=[1,2,3];
    console.log(sum(arr[0],arr[1],arr[2])); // Here we use traditional calling method.
    console.log(sum(...arr)); // Here we have used "...arr" to spread the valuse os arr for the sum function
})();



// (async function Main(){
//     console.log(a1);
//     function sum(a,b,c){
//         return a+b+c;
//     }
//     var a1=10; // Here the value of "var" is given to the top of the code and it gives the output as "undefined". This is known as "Hoisting".
                  // It is only applicable to the "var" and "let" and "const". Hoisting means we can use the value of "var" after any declaration using it's value.
// })();