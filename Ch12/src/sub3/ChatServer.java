package sub3;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {			
			serverSocket = new ServerSocket(9001);
			System.out.println("connect sit");
			
			socket = serverSocket.accept();
			
			System.out.println("conect com...");
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadResceiver(socket);
			
			t1.start();
			t2.start();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
