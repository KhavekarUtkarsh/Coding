// let a= prompt("Enter first number");
// let b= prompt("Enter second number");
// let sum= a+b;
// console.log("The Sum is-",sum);



// Here above code doesn't return the addition of the two numbers.
// Instead of that it perform "Concatenation" operation on both numbers, because by default they are in String form
// To perform addition operation we have to convert them into integer as follows-

// let a= prompt("Enter first number");
// let b= prompt("Enter second number");
// let sum= parseInt(a)+parseInt(b);
// console.log("The Sum is-",sum);


// But the problem with this is when user enters any let's say names instead os numbers then it will give result as "NaN"
// This will introduce Errors in our code
// To avoid these we write it as following-

// let a= prompt("Enter first number");
// let b= prompt("Enter second number");
// if(isNaN(a) || isNaN(b)){
//     throw new Error("Please enter valid data!");
// }
// let sum= parseInt(a)+parseInt(b);
// console.log("The Sum is-",sum);

// Here we have used "if" condition for to enter only Integer values and "throw" error if it returns NaN



// let a= prompt("Enter first number");
// let b= prompt("Enter second number");
// if(isNaN(a) || isNaN(b)){
//     throw SyntaxError("Please enter valid data!");
// }
// let sum= parseInt(a)+parseInt(b);
// try {
//     console.log("The Sum is-",sum*x);
// } catch (error) {
//     console.log("Error Caught!");
// }

// Here we have multiplyied sum by "x" which is not defined.
// So it will throw an Error.
// To avoid getting Error we can handle it by using "try-catch" block as above.


let a = prompt("Enter first number");
let b = prompt("Enter second number");
if (isNaN(a) || isNaN(b)) {
    throw new Error("Please enter valid data!");
}
let sum = parseInt(a) + parseInt(b);
function  main(){
    try {
        let x = 1;
        console.log("The Sum is-", sum + x);
        return true;
    } catch (error) {
        console.log("Error Caught!");
        return false;
    }
    finally {
        console.log("Files are being closedand DB connection is being closed");
    }
}
main();

// Here we are using "finally" block.
// We use finally block to execute some code when all execution of code is done i.e. at the end, some functions should be performed.
// We can simply put the "consol.log" line after "try-catch" block without writing finally block, it will give the same result.
// But when we perform same thing in a function then situation changes.
// In that case if we are returning something in "try and catch" then it will not execute the last "console.log" line.
// So here we need to write the "finally" block.