let user = {
    name: 'xero',
    email: 'xero@example.com',
    age: 30,
    //to update name
    updateName: function(newName){
        this.name = newName;
    },
    //to update email
    updateEmail: function(newEmail){
        this.email = newEmail;
    },
    updateAge: function(newAge){
        this.age = newAge;
    },
    //calculate birth year
    calculateBirthYear: function(){
        let CurrentYear = new Date().getFullYear();
        return CurrentYear - this.age;
    }
};

//calculating birth year
console.log(user.calculateBirthYear());

//get the data
console.log(user.name);
console.log(user.email);
console.log(user.age);

//update name
user.updateName('soha');
console.log(user.name);
//update Age
user.updateAge(20);
console.log(user.age);
//update email
user.updateEmail('soha@example.com');
console.log(user.email);
//get the year
console.log(user.calculateBirthYear());





