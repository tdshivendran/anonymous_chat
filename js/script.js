function value(){
	var input = document.getElementById("textfield").value;
	var port = document.getElementById("port").value;
	int p = Integer.parseInt(port);
	ChatClient c ;
	c.send(p,input);
	
	
}