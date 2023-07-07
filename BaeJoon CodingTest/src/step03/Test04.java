package step03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
			
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("x 를 입력하세요");
		int x = sc.nextInt();
		System.out.println("n 를 입력하세요");
		int n = sc.nextInt();    
	   	int sum = 0;
		
	   	for(int i = 0 ; i < n ; i++) {
	   		System.out.println("a 를 입력하세요");
	   		int a = sc.nextInt();
	   		System.out.println("b 를 입력하세요");
	   		int b = sc.nextInt();
	   		
	   		sum += a * b;
	   	}
	   	if(sum == x) {
	   		System.out.println("Yes");
	   	}else {
	   		System.out.println("No");
	   	}
		
	   	sc.close();
				
	}
		    
}
