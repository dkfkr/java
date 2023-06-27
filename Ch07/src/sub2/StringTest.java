package sub2;

/**
 * 날짜 : 2023 06 27
 * 이름 : 강원빈
 * 내용 : Java String 실습하기
 * 
 * Stiring 클래스
 *  - String 문자열을 처리하는 클래스
 *  - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 *  - String 클래스에 immutable 특성으로 인한 성능저하 개선을 위해 StringBuilder사용
 */

public class StringTest {
	public static void main(String[] args) {
		
		// 문자열(문자 + 배열) 생성
		String str1 = "Hello";             // 리터럴(암시적)
		String str2 = new String("Hello"); // 명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1, str2 주소가 같다.");
		}else {
			System.out.println("str1, str2 주소가 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열 값이 같다.");
		}else {
			System.out.println("str1, str2 문자열 값이 다르다.");
		}
		
		// 문자열 길이
		String msg = "Hello Korea";
		System.out.println("msg 길이 : " + msg.length());
		
		// 문자열 추출
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(6);
		
		System.out.println("msg 1번째 문자 : " + msg.charAt(0));
		System.out.println("msg 7번째 문자 : " + msg.charAt(6));
		
		// 문자열 자르기
		String sub1 = msg.substring(0, 5);
		String sub2 = msg.substring(6);
		
		System.out.println("sub1 : " + sub1);
		System.out.println("sub2 : " + sub2);
		
		// 문자열 인덱스
		int idx1 = msg.indexOf("e");
		int idx2 = msg.lastIndexOf("e");
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		// 문자열 교체
		String rp1 = msg.replace("Korea", "Busan");
		String rp2 = msg.replace("Hello", "Welcome");
		
		System.out.println("rp1 : " + rp1);
		System.out.println("rp2 : " + rp2);
		
		// 문자열 변환
	    int    var1 = 1;
		double  var2 = 3.14;		
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = "" + var3; // 위 방식 보다 일반적으로 이 방법이 많이 쓰임
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
	}
	
}
