function validateEmail(email){
    const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return pattern.test(email);
}
let email = "marl@gmail.com"
if(validateEmail(email)){
    console.log("Email is valid");
}else{
    console.log("Email is invalid");
}