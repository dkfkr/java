package step05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int i = sc.nextInt();
		
		char rs = s.charAt(i);
		
		System.out.println(rs);
		
		sc.close();
	}

	 
}
