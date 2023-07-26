package test08;

import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonMap {
    private Map<String, Person> map;

    public PersonMap() {
        map = new HashMap<>();
    }

    public void addPerson(String id, Person person) {
        map.put(id, person);
    }

    public Person getPerson(String id) {
        return map.get(id);
    }

    public void printAll() {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            String id = entry.getKey();
            Person person = entry.getValue();
            System.out.println("아이디: " + id + ", 이름: " + person.getName() + ", 나이: " + person.getAge());
        }
    }
}

public class Test08 {

    public static void main(String[] args) {
        PersonMap personMap = new PersonMap();

        // 사람들을 생성하여 PersonMap에 추가
        Person person1 = new Person("강감찬", 42);
        Person person2 = new Person("강감찬", 42);
        Person person3 = new Person("강감찬", 42);
        Person person4 = new Person("강감찬", 42);

        personMap.addPerson("a104", person1);
        personMap.addPerson("a105", person2);
        personMap.addPerson("a101", person3);
        personMap.addPerson("a102", person4);

        String targetId = "kim";
        Person targetPerson = personMap.getPerson(targetId);

        if (targetPerson != null) {
            System.out.println("아이디: " + targetId + ", 이름: " + targetPerson.getName() + ", 나이: " + targetPerson.getAge());
        } else {
            System.out.println("아이디 '" + targetId + "'이 존재하지 않습니다.");
        }

        // 모든 정보를 출력
        System.out.println("=== 모든 정보 출력 ===");
        personMap.printAll();
    }
}
