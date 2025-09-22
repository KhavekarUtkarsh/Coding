/* Create a Faulty Calculator using JavaScript */

/*

This faulty does the following:
1) It takes two numbers from the user
2) It performs wrong operations as follows-

    + ---> -
    * ---> +
    - ---> /
    / ---> **

3) It performs wrong operations 10% of the times

*/

// practice_1.html

let random = Math.random();
let a = prompt("Enter your first number");
let c = prompt("Enter your operation");
let b = prompt("Enter your second number");

let obj = {
    "+":"-",
    "*":"+",
    "-":"/",
    "/":"**",
}

if(random > 0.1){
    // Perform Correct Operation
    alert(`The Result is ${eval(`${a} ${c} ${b}`)}`);
}
else{
    // Perform Wrong Operation
    c=obj[c];
    alert(`The Result is ${eval(`${a} ${c} ${b}`)}`);
}