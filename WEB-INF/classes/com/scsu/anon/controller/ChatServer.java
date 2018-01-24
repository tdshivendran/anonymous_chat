package com.scsu.anon.controller;
import java.net.*;
import java.io.*;

public class ChatServer implements Runnable{
	private ChatServerThread clients[] = new ChatServerThread[50];
	private ServerSocket server = null;
	private Thread       thread = null;
	private int clientCount = 0;
	public int port =1235;

	public ChatServer()
	{  try
	{ //System.out.println("constructor");
	System.out.println("Binding to port " + port + ", please wait  ...");
	server = new ServerSocket(port);  
	System.out.println("Server started: " + server);
	start(); }
	catch(IOException ioe)
	{  System.out.println("Can not bind to port " + port + ": " + ioe.getMessage()); }
	}

	public void run()
	{  
		//System.out.println("run");
		while (thread != null)
		{  
			try
			{  
				//System.out.println("run while");
				System.out.println("Waiting for a client ..."); 
				addThread(server.accept()); }
			catch(IOException ioe)
			{  //System.out.println("run catch");
			System.out.println("Server accept error: " + ioe); stop(); }
		}
	}

	public void start()  { 
		//System.out.println("start");
		if (thread == null){
			//System.out.println("start if");
			thread = new Thread(this); 
			thread.start();
		}
	}
	public void stop()   { 
		//System.out.println("stop");
		if (thread != null)
		{  //System.out.println("stop if");
		thread.stop(); 
		thread = null;
		}
	}
	private int findClient(int ID)
	{  
		//System.out.println("find client");
		for (int i = 0; i < clientCount; i++)
			if (clients[i].getID() == ID){
				//System.out.println("findclient for if");
				return i;
			}
		return -1;
	}
	public synchronized void handle(int ID, String input)
	{  //System.out.println("handle");
	if (input.equals(".bye"))
	{  //System.out.println("handle if");
	clients[findClient(ID)].send(".bye");
	remove(ID); }
	else
		for (int i = 0; i < clientCount; i++){
			//System.out.println("handle else");
			clients[i].send("\t\tAnonymous : " + input);
		}
	}
	public synchronized void remove(int ID)
	{  //System.out.println("remove");
	int pos = findClient(ID);
	if (pos >= 0)
	{  //System.out.println("remove if");
	ChatServerThread toTerminate = clients[pos];
	System.out.println("Removing client thread " + ID + " at " + pos);
	if (pos < clientCount-1)
		for (int i = pos+1; i < clientCount; i++)
			clients[i-1] = clients[i];
	clientCount--;
	try
	{  
		toTerminate.close(); 
	}
	catch(IOException ioe)
	{  
		System.out.println("Error closing thread: " + ioe); 
	}
	toTerminate.stop(); }
	}
	private void addThread(Socket socket)
	{  //System.out.println("addthread");
	if (clientCount < clients.length)
	{  System.out.println("Client accepted: " + socket);
	clients[clientCount] = new ChatServerThread(this, socket);
	try
	{  //System.out.println("add thread try");
	clients[clientCount].open(); 
	clients[clientCount].start();  
	clientCount++; }
	catch(IOException ioe)
	{  System.out.println("Error opening thread: " + ioe); } }
	else
		System.out.println("Client refused: maximum " + clients.length + " reached.");
	}

	public static void main(String args[]) {
		ChatServer server = null;
		
			server = new ChatServer();
	}


}
