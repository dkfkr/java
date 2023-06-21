package sub6;

/**
* 날짜 : 2023/06/19
* 이름 : 강원빈
* 내용 : java 오버라이드 실습하기
* 
* 오버라이드(메서드 재정의)
*  - 부모클래스의 매서드를 자식클래스에서 재정의하는 문법
*  - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성 구현
*/

class AAA{
	
	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}	
	// Overload
	public void method3() {
		System.out.println("AAA::method3...");		
	}
}

class BBB extends AAA{
	
	@ Override
	public void method2() {
		System.out.println("BBB::method2...");
	}
	// Overload
	public void method3(int a) {
		System.out.println("BBB::method3...");		
	}
}

class CCC extends BBB{
	
	@ Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	@ Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");	
	}	
}

public class OverideTest {
	public static void main(String[] args) {
		
		// 오버라이드 메소드 호풀
		CCC c = new CCC();
		
		c.method1();//빈칸 메소드는 AAA = CCC AAA의 내용은 삭제  > CCC출력됨 
		c.method2();//위와동일
		c.method3();//AAA만 메소드에 값이없음으로 참조하고 CCC나 BBB의 덮어씌울내용이 없으므로 출력
		c.method3(1);//BBB메소드 참조하고 위와같이 내용 x 그대로 출력
		c.method3(1, 2);//CCC 자신빡에 없으로 자신 참조
	
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo  = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
		
	}
}
