package test2;

/*
 * 날짜 : 2023/06/13
 * 이름 : 홍길동
 * 내용 : 자바 자료형 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O','U'};
		int row, col;
		int index = 0;
		
		for (row = 1; row < 10 ; row++) {
			 for (col = 1 ; col <= row ; col++) {
				 System.out.print(str[index]); 
	             index = (index + 1) % str.length;	
			}
			
			System.out.println("\n");
		}
	}

}
