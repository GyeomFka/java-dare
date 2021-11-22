package ch04;

public class PeopleApp {
    public static void main(String[] args) {
        People people = new People("만겸", 12);
        System.out.println(people.name);
        System.out.println(people.age);
    }
}
