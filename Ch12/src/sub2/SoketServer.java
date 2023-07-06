package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 날짜 : 2023 07 06
 * 이름 : 강원빈
 * 내용 : 소켓 프로그래밍 실습하기
 */

public class SoketServer {
	public static void main(String[] args) {
		
		System.out.println("[Sever]");
		
		ServerSocket serversocket = null;
		try {
		     serversocket = new ServerSocket();
		     serversocket.bind(new InetSocketAddress("127.0.0.1",5001));
		     
		     System.out.println("loding...");
		     Socket socket = serversocket.accept();
		     
		     // 테이터 송신(Server -> Client)
		     System.out.println("loding suc...");
		     OutputStream os = socket.getOutputStream();
		     String msg = "Hello Client!";
		     
		     byte[] msgBytes = msg.getBytes();
		     os.write(msgBytes);
		     os.flush();
		     
		     System.out.println("data full commit...");
		     
		     InputStream is = socket.getInputStream();
		     byte[] bytes = new byte[100];
		     int readBytes = is.read(bytes);
		     
		     String result = new String(bytes, 0, readBytes, "UTF-8");
		     
		     System.out.println("data push commit...");
		     
		     os.close();
		     is.close();
		     socket.close();
		     
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serversocket.isClosed()) {
			try {
				serversocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Sever of...");
		
	}
}
