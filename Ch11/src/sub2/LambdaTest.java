package sub2;

/**
 * 날짜 : 2023 07 04
 * 이름 : 강원빈
 * 내용 : java 람다식 실습하기
 * 
 * 람다식
 *  - 함수형 프로그래밍을 지원하는 구문
 *  - 인터페이스 타입으로 @Functionalinterface 선언해서 람다식 정의
 */

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a , int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {return a + b;};
		A a3 = (a, b) -> a+b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		B b1 = (double a) -> {System.out.println("a : " + a);};
		B b2 = a -> System.out.println("a : " + a);
		B b3 = System.out::println;
		
		b1.method(1.0);
		b2.method(2.2);
		b3.method(3.4);
		
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		
		D d1 = () -> {System.out.println("d1 on...");};
		D d2 = () -> System.out.println("d2 on...");
		
		d1.method();
		d2.method();
		
		// 람다식 활용
		Runnable run = () -> {
		
			for(int i = 0 ; i <= 10 ; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				System.out.println("sub Thread ing...");
				
			}
	};
	
	Thread thread = new Thread(run);
    thread.start();
    
    for(int i = 0 ; i <= 10 ; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread ing...");
		
	}
   
    System.out.println("program off...");
    
  }
  
 
}
