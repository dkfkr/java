package step3;

import java.util.Scanner;

public class Test10 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
				
		for(int s = 1 ; s <= n  ; s++) {
			for (int i = 1; i <= n - s; i++) {
                System.out.print(" ");
            }
			for(int e = 1 ; e <= s ; e++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}