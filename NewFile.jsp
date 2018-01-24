<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page contentType="text/html" import="java.io.*,java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<h1>welcome</h1>
	<%
		Socket socket = null;
		try{
			try{
				String msg;
				socket = new Socket("10.100.38.227",1235);
				System.out.println("Client connected at port::"+socket);
				InputStreamReader IR = new InputStreamReader(socket.getInputStream());
				BufferedReader BR = new BufferedReader(IR);
				PrintStream PS = new PrintStream(socket.getOutputStream());
				%>
	<input type="text" name="textfield" id="textfield" value='<%=request.getParameter("textfield") %>'/>
		<h1></h1>
		<input type="submit" name="submit" id="submit" value="submit" onclick=""/>
		<%
		msg = request.getParameter("textfield");
		PS.println(msg);
    	System.out.println("Client message::"+msg);
    	PS.flush();
		%>
		<%
		
				
		String m = BR.readLine();
    	System.out.println("Received from server::"+m);
		%>
		<textarea rows="50" cols="50" disabled="disabled" name="textarea" id="textarea" >m</textarea>		
		<h1></h1>
		
		<%
		}
		finally{
		socket.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		
		%>
	</div>
</body>
</html>