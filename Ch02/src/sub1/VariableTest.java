package sub1;

/*
 * 날짜 : 2023/06/13
 * 이름 : 강원빈
 * 내용 : Java 변수 실습하기
 */
public class VariableTest {
	public static void main(String[] args) {
		
		// 변수
		String hello = "Hello World";
		int a = 3;
		int b = 7;
		
		a = 5;
		
		System.out.println("hello : "+hello);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
				
		// 상수
		final int NUM = 5;
		//NUM = 7;
		
		System.out.println("NUM : "+NUM);		
	}
}

