package test07;

class Bus {
	private String number;
	private int    fee;
	
	public Bus (String number, int fee) {
		this.number = number;
		this.fee = fee;
	}
	
	public void Take(String name) {
		System.out.printf("%s는 %s버스를 탑니다.\n", name, number);
		System.out.printf("버스요금은 %,d입니다.\n", fee);
	}
}

class Subway {
	private String line;
	private int    fee;
	
	public Subway (String line, int fee) {
		this.line = line;
		this.fee = fee;
	}
	
	public void Take(String name) {
		System.out.printf("%s는 %s호선 지하철를 탑니다.\n", name, line);
		System.out.printf("지하철요금은 %,d입니다.\n", fee);
	}
}

class User {
	private String name;
	private int    age;
	
	public User (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void takeBus(Bus bus) {
		bus.Take(name);
	}
	
	public void takeSubway(Subway subway) {
		subway.Take(name);
	}
}

public class Test03 {
    public static void main(String[] args) {
        User kim = new User("김유신", 24);
        User lee = new User("이순신", 24);
        
        Bus bus = new Bus("64", 1350);
        Subway subway = new Subway("2", 1350);
        
        kim.takeBus(bus);
        lee.takeSubway(subway);
    }
}
