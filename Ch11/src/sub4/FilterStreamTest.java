package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 날짜 : 2023 07 04
 * 이름 : 강원빈
 * 내용 : java 필터 스트림 실습하기
 * 
 */

public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println("numbers : " + numbers);
		
		// 필터를 이용해 중복 값 제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		
		// 5이상 데이터 필터링
		numbers
			.stream()
			.filter(num -> num >=5)
			.forEach(num -> System.out.println(num + ", "));
		
		System.out.println("\n");
		
		// 중복제거, 짝수 데이터 출력
		numbers
		    .stream()
		    .distinct()
		    .filter(num -> num % 2 == 0)
		    .forEach(num -> System.out.println(num + ", "));
	
	}
}
