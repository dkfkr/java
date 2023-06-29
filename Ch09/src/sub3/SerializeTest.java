package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java 직렬화 실습하기
 * 
 * 직렬화 , 역 직렬화
 *  직렬화 - 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 *  역 직렬화 - 외부 객체 파일을 다시 자바 객체로 생성하는 작업
 *  - 스트임으로 전송된 객체는 Serializable 인터페이스 구형
 */

public class SerializeTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("일본", 2000);
		
		String path1 = "C:\\Users\\fg012\\Desktop\\Apple.txt";
		String path2 = "C:\\Users\\fg012\\Desktop\\Banana.txt";
		
		try {
			// 객체 스트림 연결
			FileOutputStream fos1 = new FileOutputStream(path1);
			ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
			
			FileOutputStream fos2 = new FileOutputStream(path2);
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			
			// 객체 직렬화
			oos1.writeObject(apple);
			oos2.writeObject(banana);
			
			// 스트림 해제
			oos1.close();
			fos1.close();
			
			oos2.close();
			fos2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.err.println("프로그램 종료...");
		
	}
}
