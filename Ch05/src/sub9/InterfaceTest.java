package sub9;

/**
* 날짜 : 2023/06/22
* 이름 : 강원빈
* 내용 : java 인터페이스 실습하기
* 
* 인터페이스(Interface)
*  - 클래스간의 공통의 표쥰규격을 위한 설계 문법
*  - 인터페이스를 활용해서 객체간 결랍도를 완화하는 효과
*  - 부수적으로 다중 상속 효과 
*/

class Tv extends computer implements internet{

	@Override
	public void acces() {
		surf();
	}
	
	public void powerOn() {
		booting();
	}
	
}

class computer{
	public void booting() {
		System.out.println("시스템 부팅...");		
	}
	
	public void surf() {
		System.out.println("인터넷 서핑...");		
	}
}

interface internet{
	public void acces();
}

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		//인터페이스 활용 1 - 표준화된 클래스 설계와 다형성 활용
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("봉고", "남색", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();
		
		//인터페이스 활용 2 - 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOf();
		
		//인터페이스 활용 3 - 다중 상속 효과
		Tv smartTv = new Tv();
		smartTv.powerOn();
		smartTv.acces();
		
	}


}
