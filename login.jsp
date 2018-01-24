
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/loginstyle.css"></link>
<title>Login</title>
</head>
<body>
	<div class="header"></div>

	<div class="container">
		<div class="row">
			<form onsubmit="return validate();" method="post" action="Login">
				<div class="col-md-12 col-sm-12">
					<header>Login</header>
					<label>Username <span>*</span></label> <input type="text" name="username" id="username" /> <label>Password
						<span>*</span>
					</label> <input type="password" name="password" id="password"/>
					<button type="submit" onclick="return validate()">Login</button>
					<a href="">Forgot Password..?</a>
				</div>
			</form>
		</div>
	</div>
	
<script  src="js/login.js"></script>
</body>
</html>