package com.scsu.anon.controller;
import java.net.*;
import java.io.*;

public class ChatServerThread extends Thread{
	private ChatServer       server    = null;
	   private Socket           socket    = null;
	   private int              ID        = -1;
	   private DataInputStream  streamIn  =  null;
	   private DataOutputStream streamOut = null;

	   public ChatServerThread(ChatServer _server, Socket _socket)
	   {  
		   super();
		   //System.out.println("thread constructor");
	      server = _server;
	      socket = _socket;
	      ID     = socket.getPort();
	   }
	   public void send(String msg)
	   {   try
	       {  //System.out.println("send try");
		   streamOut.writeUTF(msg);
	          streamOut.flush();
	       }
	       catch(IOException ioe)
	       {  System.out.println(ID + " ERROR sending: " + ioe.getMessage());
	          server.remove(ID);
	          stop();
	       }
	   }
	   public int getID()
	   {  //System.out.println("getid");
		   return ID;
	   }
	   public void run()
	   {  System.out.println("Server Thread " + ID + " running.");
	      while (true)
	      {  try
	         {//System.out.println("run thread");  
	    	  server.handle(ID, streamIn.readUTF());
	         }
	         catch(IOException ioe)
	         {  System.out.println(ID + " ERROR reading: " + ioe.getMessage());
	            server.remove(ID);
	            stop();
	         }
	      }
	   }
	   public void open() throws IOException
	   {  //System.out.println("open thread");
		   streamIn = new DataInputStream(new 
	                        BufferedInputStream(socket.getInputStream()));
	      streamOut = new DataOutputStream(new
	                        BufferedOutputStream(socket.getOutputStream()));
	   }
	   public void close() throws IOException
	   { //System.out.println("close thread");
		   if (socket != null)    socket.close();
	      if (streamIn != null)  streamIn.close();
	      if (streamOut != null) streamOut.close();
	   }


}
