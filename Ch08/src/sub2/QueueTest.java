package sub2;

import java.util.LinkedList;

/**
 * 날짜 : 2023 06 27
 * 이름 : 강원빈
 * 내용 : Java 큐 실습하기
 * 
 * 큐
 *  - 큐는 데이터가 순서대로 쌓이는 자료구조(선입선출)
 *  - 이벤트, 에니메이션 실행에 사용
 */


import java.util.Queue;

public class QueueTest {
	
	private void mian() {

		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
		
	}
}
