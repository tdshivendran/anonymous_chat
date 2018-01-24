package test;
import java.net.*;
import java.io.*;
public class ChatClient1 implements Runnable{
	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public String msg;
	
	public ChatClient1() throws Exception{
		socket = new Socket("192.168.1.10",1235);
		System.out.println("Client connected at port::"+socket);
		run();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			try{
			
			
	    	
	    	exec();
			}
			finally{
				socket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
	}
	public void exec() 
	{
						
				try {
					while(true){
					execute();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
	}
	public void execute() throws Exception{
		
    	try{
    		while(true)
    		{
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
    
    public void send() throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try{
    		msg = br.readLine();
    		PS = new PrintStream(socket.getOutputStream());
	    	
        	PS.println(msg);
        	System.out.println("Client message::"+msg);
        	PS.flush();
    			}
    			catch(Exception e){
    				e.printStackTrace();
    			}
    	
    }
    
    public static void main(String args[]) throws Exception{
    	ChatClient client = new ChatClient();
    }
	


}
