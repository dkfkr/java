package step05;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
				
		while (sc.hasNext()) {	
			String a = sc.nextLine();	
			System.out.println(a);
		}	
		
		sc.close();
		
	}
}