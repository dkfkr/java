package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java 입출력 실습하기
 * 
 * 입출력 스트림
 *  - 프로그램은 데이터 처리와 함꼐 데이터 저장을 위해 파일 입출력 수행
 *  - 파일 입출력 위해 스트림 사용
 */

public class FileIOTest {
	
	public static void main(String[] args)  {
		
		String path = "C:\\Users\\fg012\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\fg012\\Desktop\\Sample2.txt";

		// 스트림 연결
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			
			while(true) {
				
				// 파일 읽기
				int data = fis.read();
				
				
				if(data == -1) {
					// 파일을 읽었을때 종료
				break;
			  }
				
				char ch = (char) data;
				System.out.print(ch);
			
				// 파일 쓰기
				fos.write(data);
				
			}
			//스트림 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("프로그램 종료");
		
	} // 메인 종료
}
