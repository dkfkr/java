package test03;

class Customer {
    private int id;
	private String name;
	private String grade;
	private int point;
	private double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
		
	public void showinfo() {
		System.out.println("===================");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재포인트 : " + point);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("-------------------");
	}
}