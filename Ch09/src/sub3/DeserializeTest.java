package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java 역 직렬화 실습하기
 * 
 * 직렬화
 *  - 기본 입출력 스트림에 버퍼를 장착해서 빠른 입출력 지향하는 보조 스트림
 */

public class DeserializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\fg012\\Desktop\\Apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
