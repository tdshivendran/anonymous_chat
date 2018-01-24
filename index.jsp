<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Anonymous Message Broadcasting SCSU</title>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/et-line-font.css">
	<link rel="stylesheet" href="css/nivo-lightbox.css">
	<link rel="stylesheet" href="css/nivo_themes/default/default.css"> 
	<link rel="stylesheet" href="css/style.css">
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,300,500' rel='stylesheet' type='text/css'>
	
</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">

<!-- preloader section -->
<div class="preloader">
	<div class="sk-spinner sk-spinner-circle">
       <div class="sk-circle1 sk-circle"></div>
       <div class="sk-circle2 sk-circle"></div>
       <div class="sk-circle3 sk-circle"></div>
       <div class="sk-circle4 sk-circle"></div>
       <div class="sk-circle5 sk-circle"></div>
       <div class="sk-circle6 sk-circle"></div>
       <div class="sk-circle7 sk-circle"></div>
       <div class="sk-circle8 sk-circle"></div>
       <div class="sk-circle9 sk-circle"></div>
       <div class="sk-circle10 sk-circle"></div>
       <div class="sk-circle11 sk-circle"></div>
       <div class="sk-circle12 sk-circle"></div>
    </div>
</div>

<!-- navigation section -->
<section class="navbar navbar-fixed-top custom-navbar" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<img src="images/scsu.jpg" height="75px" width="250px" />
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#home" class="smoothScroll">HOME</a></li>
				<li><a href="#sign_up" class="smoothScroll">SignUp</a></li>
			</ul>
		</div>
	</div>
</section>

<!-- home section -->
<section id="home">
	<div class="container">
		<div class="row">
			<div class="col-md-12 col-sm-12">
				<h1>Anonymous Message Broadcasting</h1>
				<hr>
				
				<a href="#sign_up" class="smoothScroll btn btn-danger">Sign Up</a>
				</br>
				<a href="login.jsp" class="smoothScroll btn btn-default">Login</a>
			
			</div>
		</div>
	</div>		
</section>

<!-- sign_up section -->
<section id="sign_up">
	<div class="container">
		<div class="row">			
				<div class="section-title">	
				</br></br>
					<h1 class="heading bold" align="center"><strong>Sign Up Here..</strong></h1>
					
				</div>			
			<div class="col-md-12 col-sm-12" data-wow-delay="0.6s">
			<div class="collapse navbar-collapse">
			<form onsubmit="return validate();" method="post" action="NewUser">			
			<h2>
			<div class="mbm _3-90 lfloat _ohe">
			<div class="_5dbb _5634" id="u_0_0">
			<div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput">
			<div class="placeholder" aria-hidden="true">First name</div>
			<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" aria-required="1" placeholder="" id="firstname" aria-label="First name" aria-owns="js_0" aria-haspopup="true" aria-describedby="js_2" aria-invalid="true"></div>
			<i class="_5dbc img sp_IIuy94UEXRV sx_cb4753"></i>
			<i class="_5dbd img sp_IIuy94UEXRV sx_7f7f20"></i>
			</div>
			</div>
			<div class="mbm rfloat _ohf">
			<div class="_5dbb" id="u_0_2">
			<div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput">
			<div class="placeholder" aria-hidden="true">Last name</div>
			<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" aria-required="1" placeholder="" id="lastname" aria-label="Last name"></div><i class="_5dbc img sp_IIuy94UEXRV sx_cb4753"></i>
			<i class="_5dbd img sp_IIuy94UEXRV sx_7f7f20"></i>
			</div>
			</div>
			<div class="mbm" id="u_0_4">
			<div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput">
			<div class="placeholder" aria-hidden="true">Email</div>
			<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="email" aria-required="1" placeholder="" id="email" aria-label="Email">
			</div>
			<i class="_5dbc img sp_IIuy94UEXRV sx_cb4753"></i>
			</div>
			<div class="mbm">
			<div class="_5dbb" id="u_0_6">
			<div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput">
			<div class="placeholder" aria-hidden="true">Password</div>
			<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="text" name="password" aria-required="1" placeholder="" id="password" aria-label="New password">
			</div>
			<i class="_5dbc img sp_IIuy94UEXRV sx_cb4753"></i>
			</div>
			</div>
			<div class="mbm">
			<div class="_5dbb" id="u_0_8">
			<div class="uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput">
			<div class="placeholder" aria-hidden="true">Re-enter password</div>
			<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="text" name="rpassword" aria-required="1" placeholder="" id="rpassword" aria-label="Re-enter password">
			</div>
			<i class="_5dbc img sp_IIuy94UEXRV sx_cb4753"></i>
			</div>
			<!-- </div>
			<div class="mtm _5wa2 _5dbb" id="u_0_a">
			<span class="_5k_3" data-type="radio" data-name="gender_wrapper" id="u_0_b">
			<span class="_5k_2 _5dba">
			<input type="radio" name="sex" value="1" id="u_0_c">
			<label class="_58mt" for="u_0_e">Female</label>
			</span>
			<span class="_5k_2 _5dba">
			<input type="radio" name="sex" value="2" id="u_0_d">
			<label class="_58mt" for="u_0_f">Male</label>
			</span>
			</span>
			<i class="_5dbc _5k_6 img sp_IIuy94UEXRV sx_cb4753"></i>
			<i class="_5dbd _5k_7 img sp_IIuy94UEXRV sx_7f7f20"></i>
			</div>
			<div class="_58mu" id="u_0_i">
			<p class="_58mv">By clicking Sign Up, you agree to our <a href="/legal/terms" target="_blank" rel="nofollow">Terms</a> and that you have read our <a href="/about/privacy" target="_blank" rel="nofollow">Data Policy</a>, including our <a href="/help/cookies" target="_blank" rel="nofollow">Cookie Use</a>.</p>
			</div> -->
			<div class="clearfix">
			<button type="submit" class="smoothScroll btn btn-danger" name="websubmit" id="u_0_j">Sign Up</button>
			<span class="hidden_elem _58ml" id="u_0_m">
			
			</span>
			</div>
				</h2>
				</form>				
				</div>
					</div>
					</div>
	</div>
</section>





<script src="js/index.js"></script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/isotope.js"></script>
<script src="js/imagesloaded.min.js"></script>
<script src="js/nivo-lightbox.min.js"></script>
<script src="js/jquery.backstretch.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/custom.js"></script>


</body>
</html>