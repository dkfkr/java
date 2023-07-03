package step5;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		for(int i = 0 ; i <= a.length() ; i++ ) {
			if(i == 0) {
				System.out.println(i);
			}
			
			if(i == a.length()) {
				System.out.println(i);
			}
			break;	
			
		}
		
	
	}
        
}
