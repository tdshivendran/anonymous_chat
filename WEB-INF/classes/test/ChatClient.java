package test;
import java.net.*;
import java.io.*;
public class ChatClient {
	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public String msg;
	
	public ChatClient() throws Exception{
		socket = new Socket("192.168.1.10",1235);
		System.out.println("Client connected at port::"+socket);
		execute();
	}
	
	public void execute() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try{
    		while(true)
    		{
    		msg = br.readLine();
    		PS = new PrintStream(socket.getOutputStream());
        	PS.println(msg);
        	System.out.println("Client message::"+msg);
        	PS.flush();
        	
        	IR = new InputStreamReader(socket.getInputStream());
        	BR = new BufferedReader(IR);
        	String m = BR.readLine();
        	System.out.println("Received from server::"+m);
    		}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    
    public void receive() throws Exception{
    	
    	
    }
    
    public static void main(String args[]) throws Exception{
    	ChatClient client = new ChatClient();
    }


}
