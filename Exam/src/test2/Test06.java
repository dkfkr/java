package test2;

import java.util.Scanner;

public class Test06 {
		public static void intro() {
			System.out.println("******* START *******");
			System.out.println("두개의 정수를 입력");
		}
		
		public static int input(Scanner sc, String name  ) {
			System.out.println("변수 "+name+" 값 입력 : ");
			int input = sc.nextInt();
			return input;
		}
		
		public static int add(int x, int y) {
			return x + y;
		}
		
		public static void result(int output) {
			System.out.println("두 정수의 합: " + output);
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			intro();
			
			int a = input(sc, "a");
			int b = input(sc, "b");
			
			int output = add(a, b);
			result(output);
			
			sc.close();
		}
}
