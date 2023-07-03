package sub1;

/**
 * 날짜 : 2023 07 03
 * 이름 : 강원빈
 * 내용 : Java Thread 실습하기
 * 
 * Thread
 *  - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름을 말한다.
 *  - 스레드는 동시에 실행되는 병행 실행
 *  - Thread 클래스를 상속받아 start 실행
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		//자식 스레드로 실행
		st1.start();//메인실행 후 파생스레드가 실행 되며 run이호출 됨 그러나 메인스레드는 여기서 실행을 멈추지 않고 진행 
		st2.start();//그 후에 여기서 두번째 스레드 생성 위와 같이 메인쓰레드는 기다리지않음
		
		for(int i = 0 ; i < 10 ; i++) {// 세번째 스레드 생성됨 즉 메인 스레드가 실행되면서 1,2,3 분기로 나눠짐
		
			try {
				Thread.sleep(1000);// 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
			
		}
		
		System.out.println("Main Thread 종료...");
		
	}
}
