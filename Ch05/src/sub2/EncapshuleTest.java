package sub2;

import sub2.Car;

/**
* 날짜 : 2023/06/19
* 이름 : 강원빈
* 내용 : java 캡슐화 실습하기
* 
* 클래스의속성은 반드시 private를 선언해 캡슐화
* private 속성의 초기화를 위해 생성자(Constructor)정의
* 은닉된 정보의 사용을 위해 Getter, Setter 제공
*/
public class EncapshuleTest {

	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car abante = new Car("아반테", "검은색", 10);
		
		abante.speedUp(60);
		abante.speedDown(20);
		abante.show();
		
		//Account 객체 생성 초기화 
		
		Account sh = new Account("신한은행", "101-12-1001","김유신", 10000);
	    sh.deposit(40000);
	    sh.withdraw(25000);
	    sh.show();
	    
	    //Account 객체 생성 초기화 
	    
	    Account kb = new Account("국민은행", "101-12-1031","김춘추", 40000);
	    kb.deposit(50000);
	    kb.withdraw(30000);
	    kb.show();
     }

}
