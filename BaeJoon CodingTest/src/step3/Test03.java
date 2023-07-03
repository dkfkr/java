package step3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 n을 입력해주세요");
		int n = sc.nextInt();
	    int sum = 0;
	    
		for (int i = 1 ;  i <= n ; i++ ) {
			sum  += i;			
	    }
		System.out.println(sum);
		   
		sc.close();
		
	}

}