<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>RegistrationPage</title>
</head>
<body>
	<form onsubmit="return validate()" method="post" action="NewUser">
		
			<label>FirstName</label> <input type="text" id="firstname" name="firstname"></input>
			<label>Last name</label> <input type="text" id="lastname" name="lastname"></input>
			<label>Email</label> <input type="text" id="email" name="email"></input> 
			<label>Password</label> <input type="password" id="password" name="password"></input> 
			<label>Re-enterpassword</label> <input type="password" id="rpassword" name="rpassword"></input>
			<button type="submit" >Sign Up</button>
		
	</form>
	<script src="js/index.js"></script>
</body>

</html>