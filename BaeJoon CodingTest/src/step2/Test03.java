package step2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println("연도를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt(); 
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
		    System.out.println("1");
		} else {
		    System.out.println("0");
		}
            sc.close();
   }
}