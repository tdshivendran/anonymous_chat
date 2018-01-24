package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class ChatClientExtension implements Runnable {

	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public String msg;

	public ChatClientExtension(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			try{
				IR = new InputStreamReader(socket.getInputStream());
	    		BR = new BufferedReader(IR);
	    		PS = new PrintStream(socket.getOutputStream());
	    		PS.flush();
	    		checkInput();
			}
			finally{
				socket.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void checkInput(){
		while(true)
		{
			receive();
		}
	}

	public String receive() {
		// TODO Auto-generated method stub
		String m = null;
		try {
			m = BR.readLine();
			if(m.isEmpty()){
				System.out.println("empty..");
				}
			else{
				
	        	System.out.println("Received from server::"+m);
	        	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	public void send(String m){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			msg = br.readLine();
			PS.println(msg);
	    	System.out.println("Client message::"+msg);
	    	PS.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
