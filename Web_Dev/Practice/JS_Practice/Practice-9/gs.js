class User{
    constructor(name){
        // invokes the setter
        this.name=name;
    }
    get name(){
        return this._name; // Note that here we have to give a "Underscore" otherwise it will throw error
    }
    set name(value){
        if(value.length<4){
            console.log("Name is too short!")
            return;
        }
        this._name=value; // Note that here we have to give a "Underscore" otherwise it will throw error
    }
}
let user= new User("John");
console.log(user.name); // John
user=new User(""); // Name is too short