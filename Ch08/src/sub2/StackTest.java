package sub2;

/**
 * 날짜 : 2023 06 27
 * 이름 : 강원빈
 * 내용 : Java 스택 실습하기
 * 
 * 스택
 *  - 스택은 데이터가 순서대로 쌓이는 자료구조(후입선출)
 *  - 변수 선언과 메소드 실행에 사용
 */

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
		
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		//System.out.println("stack pop : " + stack.pop());
		
		while(!stack.empty()) {
			System.out.println("stack pop : " + stack.pop());
		}
	}
}
