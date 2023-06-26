package sub1;

/**
 * 날짜 : 2023/06/26
 * 이름 : 강원빈
 * 내용 : java 예외 처리 실습
 * 
 * 예외 처리(Exception)
 *  - 예외는 프로그햄 실행중에 발생하는 모든 에러
 *  - 실행 중 발생하는 예외와 컴파일 타임에 발생하는 예외처리
 *  - 메소드 내부에 발생하는 예외를 호출한 쪽으로 throws
 *  - 사용자가 생성한 예외를 throw
 * 
 */

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		// 실행 예외
		
		// 예외(1)
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;
		
		try {
		//예외가 발생할 가능성이 있는 코드 작성
		 rs1 = num1 + num2;
		 rs2 = num1 - num2;
		 rs3 = num1 * num2;
		 rs4 = num1 / num2;
		 //어떤 수를 0으로 나눌 때					
		} catch (Exception e) {
			// 에외가 발생 할 시 처리할 코드 작성
			e.printStackTrace(); // 예외 내용 출력			
		}
						
		System.out.println("rs1 : "+ rs1);
		System.out.println("rs2 : "+ rs2);
		System.out.println("rs3 : "+ rs3);
		System.out.println("rs4 : "+ rs4);
			
		// 예외(2)
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {		
			for( int i = 0 ; i < 6 ; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
			}		
		} catch (ArrayIndexOutOfBoundsException e) {
			//배열의 인덱스 범위를 벗어났을 때
			e.printStackTrace();
		}
		
		// 예외(3)
		Animal ani = null; // 참조 값은 객체번호 ani -> Animal은 참조해야하나 ani 값이 없음
		try {
			ani.move();
			ani.hunt();

		} catch (NullPointerException e) {
			//객체 생성없이 참조(Null 포인트 에러)
			e.printStackTrace();
		}
		
		// 예외(4)
		
		//up casting
		Animal a1 = new Tiger();
		Animal a2 = new Eagle(); 
		Animal a3 = new Shark(); 
		
		try {
		// down casting 
		Eagle eagle = (Eagle) a1;
		Shark shark = (Shark) a2;
		Tiger tiger = (Tiger) a3;
		} catch (ClassCastException e) {
			//잘못된 캐스팅 오류
			e.printStackTrace();
		}
			
		// 일반 예외
		try {
			Class aniaml = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			// 예외 처리 발생유뮤에 상관없이 마지막에 항상 실행되는 코드
			// 자원을 사용하는 프로그램에서 반드시 사용
			System.gc(); // 메모리 정리
			
			System.out.println("finally 실행...");
		}
				
	 System.out.println("프로그램 정상 종료 ...");
	}
}
