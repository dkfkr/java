package test07;

interface Tv {
	public void turnOn();
	public void turnOff();
}

public class Test09 {
	public static void main(String[] args) {
	
		Tv tv = new Tv() {
			
			@Override
			public void turnOn() {
				System.out.println("Tv on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv off");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
		
	}
}
