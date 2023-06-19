package sub2;

public class Car {
	
	//필드(속성)
    private String name;
    private String color;
    private int speed;
		
    //생성자
    public Car(String name, String color, int speed) {
    	this.name  = name;
    	this.color = color;
    	this.speed = speed;
    }
    
	//메소드(기능)
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
	
	//Gatter, Satter 정의 = 필요시 정의
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
