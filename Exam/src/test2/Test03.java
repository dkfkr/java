package test2;

/*
 * 날짜 : 2023/06/13
 * 이름 : 홍길동
 * 내용 : 자바 자료형 연습문제
 */
public class Test03 {

	public static void main(String[] args) {
	
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		//현재 배열 출력 
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(arr[i]+" , ");
		}

		System.out.println("\n");
		//배열의 원소를 역순으로 정렬
		 int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }

		//역순으로 정렬된 배열을 출력
	    for (int i = 0; i < 10; i++) {
	         System.out.print(arr[i] + " , ");
	    }
	    
	}

}
