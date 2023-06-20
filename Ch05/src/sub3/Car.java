package sub3;

public class Car {
	
    //필드(속성)
    private String name;
    private String color;
    private int speed;
    
    //클래스 변수
    public static int count; // 메소드 에리어에 저장
			
    //생성자
    public Car(String name, String color, int speed) {
    	this.name  = name;
    	this.color = color;
    	this.speed = speed;
    	count++;
    }
    
    public static int getCount() {
    	return count;
    	
    }
    
    //매소드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
		
	public void speedDown(int speed) {
		this.speed -= speed;
	}
		
	public void show() {
		System.out.println("차량명  : + " + this.name);
		System.out.println("차량색  : + " + this.color);
		System.out.println("현재속도 : + " + this.speed);	
	}
	
}	
