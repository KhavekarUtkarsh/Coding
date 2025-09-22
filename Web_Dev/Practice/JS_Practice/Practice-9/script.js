// let obj={
//     a: 1,
//     b: "UK"
// }
// console.log(obj);





// let animal={
//     eats: true
// };
// let rabbit={
//     jumps: true
// };
// rabbit.__proto__ =animal; // Sets rabbit.[[Prototype]] = animal

// This is the concept of prototype in the JS




// class Animal{
//     constructor(){
//         console.log("Object is created...");
//     }
//     eats(){
//         console.log("I am eating...");
//     }
//     jumps(){
//         console.log("I am jumping");
//     }
// }
// let a= new Animal();
// console.log(a);

// This is the basic representation of the "class" and its "object"





// class Animal{
//     constructor(name){
//         this.name=name;
//         console.log("Object is created...");
//     }
//     eats(){
//         console.log("I am eating...");
//     }
//     jumps(){
//         console.log("I am jumping");
//     }
// }
// let a= new Animal("Bunny");
// console.log(a);

// Here we have given the "name"  as an argument in the constructor and now we can pass a name while creating the object of the class.
// Now we have to make another class say "Lion" having all the properties of Animal and it's own properties then we use "extends" keyword.

class Animal{
    constructor(name){
        this.name=name;
        console.log("Object is created...");
    }
    eats(){
        console.log("I am eating...");
    }
    jumps(){
        console.log("I am jumping");
    }
}
class Lion extends Animal{
    constructor(name){
        super(); 
        this.name=name;
        console.log("Object is created...");
    }
    roar(){
        console.log("I am Roaring...");
    }
    eats(){
        console.log("I am eating and roar...");
    }
}
let a= new Animal("Bunny");
console.log(a);

let l= new Lion("Shera");
console.log(l);

// We have call this "super" in order to execute further code bacause we have used "extends". This gives us the concept of Class Inheritance.
// Also we used "eats" function in the Lion class. This gives us the "Method Overriding"