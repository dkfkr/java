package test;
/*
 * 날짜 : 2023/06/13
 * 이름 : 홍길동
 * 내용 : 합 구하기
 */
public class test7 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
		    
			if( k % 2 == 0 || K % 3 == 0) {
				total +=k;
			}
	    }

		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : "+total);
	}
}
