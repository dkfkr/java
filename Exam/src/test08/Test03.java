package test08;

class Member 
{
    private String name;
    private String hp;
    private int age;

    public Member(String name, String hp, int age) {
        this.name = name;
        this.hp = hp;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 전화번호: " + hp + ", 나이: " + age;
    }
}

public class Test03 {
    public static void main(String[] args) {
        Member m1 = new Member("김유신", "010-1234-1001", 25);
        Member m2 = new Member("김춘추", "010-1234-1002", 23);

        System.out.println(m1);
        System.out.println(m2);
    }
}
