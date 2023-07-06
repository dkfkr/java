package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SoketClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		socket = new Socket();
		System.out.println("connect... ");
		
		try {
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("connect commit...");
		
		//데이터 전송(Client -> Server)
		try {
		OutputStream os = socket.getOutputStream();
		String msg = "Hello Server";
		
		byte[] msgBytes = msg.getBytes();
		os.write(msgBytes);
		os.flush();
		System.out.println("data pull commit...");
		
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[100];
		int readBytes = is.read(bytes);
		
		String result = new String(bytes, 0, readBytes, "UTF-8");
		System.out.println(result);
		
		System.out.println("data push commit...");
		
		os.close();
		is.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		System.out.println("Client of...");
	}
}
