package ch06check;

public class Test03 {
	public static void main(String[] args) {
		// 6번
		method(1);
		method(1, 2);
		method(1, 2, 3);
		method(1, 2, 3, 4);
	}
	
	public static void method(int ...num) {
		
		for(int n : num) {
			System.out.println(n);	
		}
	}
	
}

