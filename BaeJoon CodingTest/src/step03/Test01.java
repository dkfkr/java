package step03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= 9 ; i++) {
			int result = n * i;
			System.out.printf("%d * %d = %d\n", n, i, result);
			
		}
		
		sc.close();
		
	}

}