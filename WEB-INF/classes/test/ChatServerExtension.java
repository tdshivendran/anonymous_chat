package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class ChatServerExtension implements Runnable {

	public Socket socket;
	public InputStreamReader IR ;
	public BufferedReader BR;
	public PrintStream PS;
	public String msg;

	public ChatServerExtension(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try{

			try {
				IR = new InputStreamReader(socket.getInputStream());
				BR = new BufferedReader(IR);
				while(true){
					msg = BR.readLine();
					System.out.println("client:: "+msg);


					System.out.println("clientcount::"+ChatServer1.clients.size());
					for(int i=0;i<ChatServer1.clients.size();i++){
						System.out.println("socket arr::"+ChatServer1.clients.get(i));
						PS = new PrintStream(ChatServer1.clients.get(i).getOutputStream());
						PS.println(msg);
						System.out.println("sent:::");
						
					}PS.flush();
				}
			}
			finally{
				socket.close();
			}
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
