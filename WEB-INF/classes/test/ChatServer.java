package test;
import java.io.*;
import java.net.*;
import java.util.*;


public class ChatServer {
	public ServerSocket server;
	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public List<Socket> clients = new ArrayList<Socket>();
	public String msg;
	public ChatServer() throws Exception{
		server = new ServerSocket(1235);
		System.out.println("Server connected");
		while(true){
			socket = server.accept();
			addClient(socket);
			receive();
		}
	}
		
	public void addClient(Socket sock){
		clients.add(sock);
	}
	
	public void receive() throws IOException{
		while(true){
		IR = new InputStreamReader(socket.getInputStream());
		BR = new BufferedReader(IR);
		msg = BR.readLine();
		System.out.println("client:: "+msg);
		send(msg);
		}
	}
	
	public void send(String m) throws IOException{
		/*if(m == "bye"){
			socket.close();				
		}
		else{*/
		System.out.println("Clients size::"+clients.size());
			for(int i=0;i<clients.size();i++){
				PS = new PrintStream(clients.get(i).getOutputStream());
				PS.println(m);				
				}
			PS.flush();
			receive();
//			}
		
	}
	
	public static void main(String args[]) throws Exception{
		ChatServer chatServer = new ChatServer();
	}

}
