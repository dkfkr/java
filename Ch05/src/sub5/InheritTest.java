package sub5;

/**
* 날짜 : 2023/06/19
* 이름 : 강원빈
* 내용 : 클래스 상속
* 
* 상속
*  - 기존 클래스의 속성과 기능을 그대로 자식 클래스에게 확장
*  - 공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍 수행
*  - 부모클래스의 속성 접근권한을 protected롤 변경하고 자식클래스에서는 부모속성을 초기화
*/

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent{
		
	private int num3;
	private int num4;
	
	public Child (int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}		
}

public class InheritTest {
	public static void main(String[] args) {
		
		// 상속 객체 생성
		Child c1 = new Child(1, 2, 3, 4);
		int rs1 = c1.plus();
		int rs2 = c1.minus();
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		//Car 상속객체 생성
		Sedan jenesis = new Sedan("제네시스", "검은색", 0, 3000);
		jenesis.speedUp(80);
		jenesis.speedTurbo();
		jenesis.show();
		
		Truck bongo = new Truck("봉고","남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		
		// Account 상속객체 생성
		StockAccount sh = new StockAccount("SH증권", " 101-11-1020", "홍길동", 10000, "삼성전자", 10, 60000);
	    sh.deposit(10000000);
	    sh.buy(5, 58000);
	    sh.sell(5, 62000);
	    sh.show();
	}
}
