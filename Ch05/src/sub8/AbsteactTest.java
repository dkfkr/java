package sub8;

/**
* 날짜 : 2023/06/22
* 이름 : 강원빈
* 내용 : java 추상클래스 실습하기
* 
* 추상클래스(Abstract class)
*  - 일반클래스를 정의 하기위한 기본 틀을 제공하는 클래스
*  - 추상클래스를 상속 받아 자식클래스에서 미완성 메소드(추상클래스)를 완성 후 다형성 확보
*/

public class AbsteactTest {

	public static void main(String[] args) {
		
		// 추상클래스 객체생성 불가
		//Car car = new car(" ", " ", 0);
		
		Car sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		
		Car bongo = new Truck("봉고", "남색", 0, 0);
		bongo.speedUp(80);
		bongo.speedDown(60);
		bongo.show();
	}

}
