package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2023 06 29
 * 이름 : 강원빈
 * 내용 : Java 입출력 실습하기
 * 
 */

public class FileTest {
	public static void main(String[] args) {
		// is has가 붙으면 결과값이 불린인지 물어 보는명령어
		File f1 = new File("C:\\Users\\fg012\\Desktop\\file1.txt");
		File f2 = new File("C:\\Users\\fg012\\Desktop\\file2");
		
		try {
			f1.createNewFile();
			
			f2.mkdir();
			
			System.out.println("f1 isFile : " + f1.isFile());
			System.out.println("f1 isDirectory : " + f1.isDirectory());
			System.out.println("f2 isFile : " + f2.isFile());
			System.out.println("f2 isDirectory : " + f2.isDirectory());
			System.out.println("f1 getName : " + f1.getName());
			System.out.println("f1 getName : " + f2.getName());
			System.out.println("f1 getAbsolutePath : " + f1.getAbsolutePath());
			System.out.println("f2 getAbsolutePath : " + f2.getAbsolutePath());// 시스템상의 절대 경로 나타냄
			System.out.println("f1 getPath : " + f1.getPath());
			System.out.println("f2 getPath : " + f2.getPath());
			
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
