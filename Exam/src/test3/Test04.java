package test3;

class Student {
	
	static int studentId;             
	private String studentname;
	private String major;
	private int grade;
	
	
	public Student(String studentname, String major, int grade) {
		this.studentId++;
		this.studentname = studentname;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentinfo() {
		System.out.println("===================");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentname);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("-------------------");		
	}
}	

public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과" , 1);
		kim.studentinfo();
		Student lee = new Student("이순신", "경제학과" , 1);
		lee.studentinfo();
		Student lim = new Student("임꺽정", "경영학과" , 1);
		lim.studentinfo();
	}

}
