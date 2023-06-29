package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java Properties 실습하기
 * 
 * 프로퍼티
 * - 문자열 데이터만 취급하는 key-value 자료구조 클래스
 * - 프로그램의 환경설정값을 저장할때 만이 사용
 * - 입출력 스트림으로 데이터 입출력하는 자료구조 클래스
 * 
 */

public class PropertiesTest {
	
	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties(); // 맵이랑 비슷하나 키는 무조건 문자열
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 프로파일 내보내기
		String path = "C:\\Users\\fg012\\Desktop\\Fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프로퍼티 읽기
		String target = "C:\\Users\\fg012\\Desktop\\Cities.properties";
		
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			propCities.load(fis);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println("한국 : " + propCities.getProperty("kor"));
		System.out.println("미국 : " + propCities.getProperty("usa"));
		System.out.println("일본 : " + propCities.getProperty("jp"));
				
		System.out.println("프로그램 종료 ...");
	    		
	}
	
	
}
