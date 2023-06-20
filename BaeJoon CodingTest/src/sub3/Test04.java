package sub3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
			
	    Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println(x);
		int n = sc.nextInt();
		System.out.println(n);
		    
		for (int i = 1 ;  i <= n ; i++ ) {
				sum  += i;			
			}
				System.out.println(sum);
			   
			sc.close();
	}
			
}