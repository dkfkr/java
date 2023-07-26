package test08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    private String id;
    private String name;
    private String hp;
    private int age;

    public User(String id, String name, String hp, int age) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    public int getAge() {
        return age;
    }
}

public class Test10 {

    public static void main(String[] args) {
        // 데이터 입력
        List<User> dataList = new ArrayList<>();
        dataList.add(new User("a101", "김유신", "010-1234-1001", 21));
        dataList.add(new User("a102", "김춘추", "010-1234-1001", 21));
        dataList.add(new User("j101", "홍길동", "010-1111-1111", 21));

        // result1 결과 출력
        System.out.println("데이터 입력 완료...");
        System.out.println("-------------------");
        System.out.println("result1 결과");
        for (User person : dataList) {
            System.out.println(person.getId() + "," + person.getName() + "," + person.getHp() + "," + person.getAge());
        }

        // result2 결과 출력
        System.out.println("-------------------");
        System.out.println("result2 결과");
        Map<String, User> personMap = new HashMap<>();
        for (User person : dataList) {
            personMap.put(person.getId(), person);
        }

        String targetId = "j101";
        User targetPerson = personMap.get(targetId);

        if (targetPerson != null) {
            System.out.println(targetPerson.getId() + "," + targetPerson.getName() + "," + targetPerson.getHp() + "," + targetPerson.getAge());
        } else {
            System.out.println(targetId + "에 해당하는 데이터를 찾을 수 없습니다.");
        }
    }
}
