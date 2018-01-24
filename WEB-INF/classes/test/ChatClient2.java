package test;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
public class ChatClient2 {
	public Socket socket;
	public ChatClientExtension c;
	
	public ChatClient2(){
		try {
			socket = new Socket("10.100.38.227",1235);
			System.out.println("Client connected at port::"+socket);
			c = new ChatClientExtension(socket);
			Thread t = new Thread(c);
			t.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void send(String m){
		c.send(m);
	}
	public String receive(){
		String mesg = c.receive();
		return mesg;
	}
	
	public static void main(String srgs[]){
		try {
			ChatClient2 c = new ChatClient2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
