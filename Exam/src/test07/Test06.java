package test07;

class _Person {
	private String name;
	private int    age;
	
	public _Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	protected void Hello() {
		System.out.println("---------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

class _Student extends _Person {
	private String school;
	private String major;
	
	public _Student(String school, String major, String name, int age) {
        super(name, age);
        this.school = school;
        this.major = major;
    }

    @Override
    protected void Hello() {
        super.Hello(); 
        System.out.println("학교 : " + school);
        System.out.println("전공 : " + major);
    }
}

class _SalaryStudent extends _Student {
	private String company;
	
	public _SalaryStudent(String name, int age, String company, String school, String major) {
		super(name, major, school, age);
		this.company = company;
	}
	
	@Override
	protected void Hello() {
		super.Hello(); 
		System.out.println("사번 : " + company);
	}
}


public class Test06 {
	public static void main(String[] args) {
		_Person kim = new _Person("김유신",24);
		_Student jang = new _Student("장보고", "영문학과", "부경대", 26);
		_SalaryStudent lee = new _SalaryStudent("이순신", 27, "부산대", "경영학과", "삼성전자");
		
		kim.Hello();
		jang.Hello();
		lee.Hello();
	}
}
