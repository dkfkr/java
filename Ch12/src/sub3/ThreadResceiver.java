package sub3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadResceiver extends Thread{
	
	private Socket socket;
	
	public ThreadResceiver(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(" 수신 >" + msg);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}		
	}
}
