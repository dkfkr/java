package sub2;

/*
 * 날짜 : 2023/06/13
 * 이름 : 강원빈
 * 내용 : Java 메소드 실습
 */
public class MathodTest {

	// main method : 프로그램 진입점
	public static void main(String[] args) {
		
		// 메소드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		//메소드 지역변수와 스텍
		int t1 = sum(1,10);
		
		System.out.println("t1 : " + t1);
		
	}

	// 메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;		
	}
	
	//메소드 정의
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k=start ; k<=end ; k++) {
			
			total += k;
			
		}
		   
		    return total;
	}
	
	   
	
}
