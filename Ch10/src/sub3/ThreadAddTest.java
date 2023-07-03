package sub3;

public class ThreadAddTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//runnable 인터페이스 구현클래스
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		//runnable 구현클래스를 Thread 객체로 생성
		Thread t1 = new Thread(at1);// 참조하는 객체가 각각따로 이기 때문에 동기화 과정 필요하지않음
		Thread t2 = new Thread(at2);
		
		//실행
		t1.start();
		t2.start();
		
		//대기 (다른(자식)스레드 종료를 대기)
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1 + tot2;
		
		System.out.println("total : " + total);
	}	
}
