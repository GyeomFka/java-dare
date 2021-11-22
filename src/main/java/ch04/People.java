package ch04;

public class People {

    String name;
    int age;

    public People(String name, int age) {
        System.out.println("people method stack name : " + name);
        System.out.println("people method stack age : " + age);
        this.name = name;
        this.age = age;
    }
}
