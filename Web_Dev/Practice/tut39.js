console.log("Hello World!");

// Watch below carefully

// let name1="UK";
// let name2="ST";
// let name3="SR";
// let name4="RB";
// console.log(name1 +" is a Good Boy!");
// console.log(name2 +" is a Good Boy!");
// console.log(name3 +" is a Good Boy!");
// console.log(name4 +" is a Good Boy!");


// Instead of this do it with a "function"
// Function for Displaying Output

function greet(name){
    console.log(name+" is a Good Boy!");
}
let name1="UK";
let name2="ST";
let name3="SR";
let name4="RB";
greet(name1);
greet(name2);
greet(name3);
greet(name4);

// Function for Sum of three numbers

function sum(a,b,c){
    let d=a+b+c;
    return d;
}
let result=sum(1,2,3);
console.log(result);

// Function for Greater and Smaller number from given two numbers

function greatOrSmall(a,b){
    if(a>b){
        console.log("a is greater than b");
    }
    else if(a==b){
        console.log("a is equal to b");
    }
    else{
        console.log("b is greater than a");
    }
}
let c=20,d=10;
greatOrSmall(c,d);

// Function for Even Odd number

function evenOdd(num){
    if(num%2==0){
        console.log("The number is even");
    }
    else{
        console.log("The number is odd");
    }
}
evenOdd(10);