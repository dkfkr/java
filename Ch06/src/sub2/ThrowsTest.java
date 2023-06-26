package sub2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/26
 * 이름 : 강원빈
 * 내용 : java Throws 실습
 */

public class ThrowsTest {
	
		public static void main(String[] args) throws Exception{
		try {
			myMethod1(10);			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			System.out.println("프로그램 정상 종료...");
		
		}
		
			public static void myMethod1(int n1) throws Exception {
					myMethod2(n1);
			}
	
			public static void myMethod2(int n1) throws Exception{
		
					Scanner scan = new Scanner(System.in);
					System.out.println("n2 입력 : ");
						int n2 = scan.nextInt();
		
						int result = n1 / n2;
		
						System.out.println("result : " + result);
			
			}
}
