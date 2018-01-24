function validate(){
	var uname=document.getElementById("username").value;
	var pass=document.getElementById("password").value;
	if(uname==""||pass==""){
		alert("enter username and/or password");
	}else if(uname.length <= 6)
		{
			alert("name should be atleast 6");

			return false;
		}
		else if(pwd.length <= 6)
		{
			alert("pass should be atleast 6");

			return false;
		}
		else
		{
			alert("Success!");
			return true;
		}
	
	return false;
}