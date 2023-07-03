package step5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a =  sc.nextLine();
		sc.close();
		
		StringTokenizer str = new StringTokenizer(a," ");
		
		System.out.println(str.countTokens());
			
	}
	
}

// 문자열 개수 세기 로직 
// StringTokenizer str = new StringTokenizer(a," ");
// System.out.println(str.countTokens());
	