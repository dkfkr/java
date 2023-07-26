package ch06check;

public class Test04 {
	public static void main(String[] args) {
		// 7번
		method();
		method(1);
	}
	
	public static void method() {
		System.out.println("method...");
	}
	
	public static int method(int num) {
		System.out.println("method...");
		return 0;
	}
	
}
