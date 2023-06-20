package step1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a 입력");
		int a = sc.nextInt();
		
		System.out.println("b 입력");
		int b = sc.nextInt();
		
		
		int result1 = (a * (b % 10));  
		int result2 = (a * ((b / 10) % 10));  
		int result3 = (a * ((b / 100) % 10));	     
	    int result4 = (a * b);
	    
	    System.out.println(result1); 
	    System.out.println(result2);
	    System.out.println(result3);
	    System.out.println(result4);
	    
	    sc.close();
	    }
			
	}
