package ch04check;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		System.out.println("------------------------------");
		System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4종료");
		System.out.println("------------------------------");
		System.out.println("선택> ");
		
		int answer = sc.nextInt();
		
		while (true) {
		
			if(answer == 1) {
				System.out.println("------------------------------");
				System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4종료");
				System.out.println("------------------------------");
				System.out.println("선택> " + answer);
				int add = sc.nextInt();
				System.out.println("예금액> " + add);
				int result1 = balance + add;
				System.out.println(result1);
			}
			
			if(answer == 2) {
				System.out.println("------------------------------");
				System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4종료");
				System.out.println("------------------------------");
				System.out.println("선택> " + answer);
				int minus = sc.nextInt();
				System.out.println("출금액> " + minus);
				int result2 = balance - minus;
				System.out.println(result2);
			}
			
			if(answer == 3) {
				System.out.println("------------------------------");
				System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4종료");
				System.out.println("------------------------------");
				System.out.println("선택> " + answer);
				System.out.println("잔고> " + balance);
				System.out.println(balance);
			}
			
			if(answer == 4) {
				System.out.println("------------------------------");
				System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4종료");
				System.out.println("------------------------------");
				System.out.println("선택> " + answer);
				System.out.println("프로그램 종료");
			}
				
			break;
			
		}
	}
	
}
