package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java 버퍼 실습하기
 * 
 * 보조 스트림
 *  - 기본 입출력 스트림에 버퍼를 장착해서 빠른 입출력 지향하는 보조 스트림
 */

public class BufferIOTest {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\fg012\\Desktop\\workspace.zip";
		String target = "C:\\Users\\fg012\\Desktop\\workspace2.zip";

		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while (true) {
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
				
				char ch = (char) data;
				System.out.println(ch);
				
				bos.write(data);
			}
			bis.close();
			
			bos.flush();
			bos.close();
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
