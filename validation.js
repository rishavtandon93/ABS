function formValidation()
{


var custName = document.registration.custName;
var dob = document.registration.dob;
var email = document.registration.email;
var password = document.registration.password;

 
if(passid_validation(password,5,12))
{
if(allLetter(custName))
{



if(ValidateEmail(email))
{

}
} 
}





return false;
}








function passid_validation(password,mx,my)
{
var passid_len = password.value.length;
if (passid_len == 0 ||passid_len >= my || passid_len < mx)
{
alert("Password should not be empty / length be between "+mx+" to "+my);
password.focus();
return false;
}
return true;
}


function allLetter(custName)
{ 
var letters = /^[A-Za-z]+$/;
if(custName.length==0)
{
	alert("Please enter your name");
}else{
if(custName.value.match(letters))
{
return true;
}
else
{
alert('Username must have alphabet characters only');
custName.focus();
return false;
}
}
}
