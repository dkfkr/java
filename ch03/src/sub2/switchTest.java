package sub2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/13
 * 이름 : 강원빈
 * 내용 : Java switch 조건문 실습
 */
public class switchTest {
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
				
		System.out.println("입력한 숫자 : " + number);
		
		
	    switch(number % 2) {
	            
	            case 0:
	            	System.out.println("numder는 짝수 입니다");
	            	break;
	            case 1:
	            	System.out.println("numder는 홀수 입니다");
	            	break;
	            }
	    scan.close();
	}
}
