package step03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
				
		    Scanner sc = new Scanner(System.in);
			
		    System.out.println("n 를 입력하세요");
			int n = sc.nextInt();
			String name = "long int";
			
			int count = n / 4;
			
		   	for(int i = 0 ; i < count - 1 ; i++) {
		        name = "long " + name;	  	    		   		
		   }
		   	
		   	System.out.println(name);
		   	    
			sc.close();
			
		}
			    
	}
