package test;
import java.io.*;
import java.net.*;
import java.util.*;


public class ChatServer1 {
	public ServerSocket server;
	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public static List<Socket> clients = new ArrayList<Socket>();
	public String msg;
	public ChatServer1() throws Exception{
		try{
			server = new ServerSocket(1235);
			System.out.println("Server connected");
			while(true){	
		socket = server.accept();
			addClient(socket);
			ChatServerExtension c = new ChatServerExtension(socket);
			Thread t = new Thread(c);
			t.start();
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
	public void addClient(Socket sock){
		clients.add(sock);
	}
	
	
	public static void main(String args[]) throws Exception{
		ChatServer1 chatServer = new ChatServer1();
	}

}
