package test07;

class Person 
{
	private String name;
	private int    age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected void Hello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person {
	private int studentId;
	
	public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    protected void Hello() {
        super.Hello(); 
        System.out.println("학번 : " + studentId);
    }
}

class Worker extends Person {
	private int workertId;
	
	public Worker (String name, int age, int workertId) {
		super(name, age);
		this.workertId = workertId;
	}
	
	@Override
	protected void Hello() {
		super.Hello(); 
		System.out.println("사번 : " + workertId);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Student kim = new Student("김유신", 21, 20201234);
		Worker  lee = new Worker ("이순신", 35, 20211201);
		
		kim.Hello();
		lee.Hello();
		
	}
}
