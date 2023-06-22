package sub7;

/**
* 날짜 : 2023/06/22
* 이름 : 강원빈
* 내용 : java 다형성 실습하기
* 
* 
*/

public class PolyTest {

	public static void main(String[] args) {
		 
		// 다형석을 적용한 객체 생성 -> 업 캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		// 다운 캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 객체 타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark 입니다.");
		}
		
		// 다형성을 활용한 객체배열
		Animal arr[] = {tiger, eagle, shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
	}

}
