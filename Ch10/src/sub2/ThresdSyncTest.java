package sub2;

/**
 * 날짜 : 2023 07 03
 * 이름 : 강원빈
 * 내용 : Java Thread 동기화 실습하기 // 동기는 순서가 있음 비동기는 순서가 없음
 * 
 * Thread 동기화 ,비동기화
 *  -  동기화 방식은 순서를 지키며 처리되는 실행흐름이다
 *  -  비동기 방식은 순서와 상관없이 처리되는 실행흐름이다.
 */

public class ThresdSyncTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
	    CountThread ct1 = new CountThread(count);
	    CountThread ct2 = new CountThread(count);
	    CountThread ct3 = new CountThread(count);
		
	    // 자식 스레드 실행 (비동기 방식)
	    ct1.start();    
	    ct2.start();    
	    ct3.start();
	    
	    // 자식 스레드 작업이 완료 후 다시 메인 스레드로 합류 (스레드 대기)
		ct1.join(); 
		ct2.join();
	    ct3.join();
	    
	    System.out.println("count : " + count.getNum());
	    
	}
}

