<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="test.ChatClient2" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/home.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="js/script.js"></script>
   <style type="text/css">
   </style>
</head>
<body>
<%
ChatClient2 c = new ChatClient2(); 
int i = c.socket.getLocalPort();
String p = Integer.toString(i);
%>
<div id='cssmenu'>
<ul>

   <li><a href='home.jsp'><span>DashBoard</span></a></li>
   <li class='active has-sub'><a href='#'><span>Meetings</span></a>
      <ul>
         <li class='last'><a href='createmeeting.jsp'><span>Create Meeting</span></a></li>
         <li class='last'><a href='cancelmeeting.jsp'><span>Cancel Meeting</span></a></li>
      </ul>
   </li>
   <li class='active has-sub'><a href='chatroom.jsp'><span>Chat Room</span></a></li>
   <li class='active has-sub'><a href='myaccount.jsp'><span>My Account</span></a>
      <ul>
         <li class='last'><a href='profile.jsp'><span>Profile</span></a></li>
         <li class='last'><a href='changepassword.jsp'><span>Change Password</span></a></li>
      </ul>
   </li>
   <li class='last'><a href='index.jsp'><span>SignOut</span></a></li>
</ul>

</div>
<div>
<h1></h1>
</div>

<div align="center">
<div>
<textarea rows="30" cols="60" name="textarea" id="textarea" readonly="readonly" disabled="disabled" 
> </textarea>
</div>
<div>
<div>
<h1></h1>
</div>
<form onsubmit="return value()">
<input type="hidden" name="port" id="port" value=p></input>
<input type="text" width="60" name="textfield" id="textfield" ></input>
<input type="submit" name="send" id="send" value="SEND" ></input>
<%
String m = request.getParameter("textfield");
c.send(m);
%>
</form>
<input type="submit" value="Disconnect"></input>
</div>
</div>
</body>
</html>