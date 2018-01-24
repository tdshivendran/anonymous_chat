<!doctype html>
<html lang=''>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="css/home.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
   <title>HomePage</title>
</head>
<body>

<div id='cssmenu'>
<ul>

   <li><a href='home.jsp'><span>DashBoard</span></a></li>
   <li class='active has-sub'><a href='#'><span>Meetings</span></a>
      <ul>
         <li class='last'><a href='createmeeting.jsp'><span>Create Meeting</span></a></li>
         <li class='last'><a href='cancelmeeting.jsp'><span>Cancel Meeting</span></a></li>
      </ul>
   </li>
   <li class='active has-sub'><form action="Chat" method="post"><input type="submit" name="chatroom" value="Chat Room" /></form></li>
   <li class='active has-sub'><a href='myaccount.jsp'><span>My Account</span></a>
      <ul>
         <li class='last'><a href='profile.jsp'><span>Profile</span></a></li>
         <li class='last'><a href='changepassword.jsp'><span>Change Password</span></a></li>
      </ul>
   </li>
   <li class='last'><a href='index.jsp'><span>SignOut</span></a></li>
</ul>

</div>


</body>
</html>
