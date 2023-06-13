package test;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 홍길동
 * 내용 : 자바 자료형 연습문제
 */
public class test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		switch () {
		case 10:
		case 9:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("A 입니다.");
			break;
		case 7:
			System.out.println("A 입니다.");
			break;
		case 6:
			System.out.println("A 입니다.");
			break;
	}
		
       sc.close();
	}	
}
