function validate(){
	var fname=document.getElementById("firstname").value;
	var lname=document.getElementById("lastname").value;
	var email=document.getElementById("email").value;
	var password=document.getElementById("password").value;
	var rpassword=document.getElementById("rpassword").value;
	if(fname==""||lname==""||email==""||password==""||rpassword==""){
		alert("all fields are mandatory");
	}else if(fname.length <= 0)
	{
		alert("please enter first name");

		return false;
	}
	else if(lname.length <= 0)
	{
		alert("please enter last name");

		return false;
	}else if(email.length <= 1)
	{
		alert("please enter email");

		return false;
	}
	else  
		if(password.length <= 6 )
	{
		alert("password should be atleast 6");
		if(password != rpassword){
			alert("passwords doesnt match");
			return false;
		}

		return false;
	}
	else
	{
		alert("Success!");
		return true;
	}

	return false;
}