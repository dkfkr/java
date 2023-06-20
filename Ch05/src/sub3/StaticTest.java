package sub3;


/**
* 날짜 : 2023/06/19
* 이름 : 강원빈
* 내용 : 클래스 변수 , 클래스 메소드 실습하기
* 
* 클래스 변수, 클래스 메소드( 정적변수 , 정적메소드 )
*  - static을 선언한 변수, 메소드로 Method Area에 생서
*  - 별도의 객체생성 new를 선언하지 않고 클래스 타입으로 참조
*  - 객체(인스턴스)들 간의 공유 목적으로 클래스 변수, 클래스 메소드 사용
*  
*  싱글톤 객체(Singleton)
*  -static을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상에 존재
*  -싱글톤 객체를 사용해서 메모리 절약과 성늘 향상을 기대
*/

class Increment{
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
}

public class StaticTest{
	
	public static void main(String[] args) {
		
		// Increment 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//Car 실습
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car bmw =    new Car("BMW", "남색", 30);
		
		sonata.show();
		avante.show();
		bmw.show();
		
		//클래스 변수 참조
		System.out.println("전체 차량수 : " + Car.count);
		
		//클래스 메소드 호출
		System.out.println("현재 차량수 : " + Car.getCount());
		
		//싱글톤 객체 실습
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
	
		System.out.println(c1==c2);
				
	}
}

