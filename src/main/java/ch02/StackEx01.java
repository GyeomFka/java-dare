package ch02;

public class StackEx01 {

    static void a() {
        StackEx01.b();
        System.out.println("a1");
        System.out.println("a2");
        System.out.println("a3");
    }

    static void b() {
        System.out.println("b1");
        System.out.println("b2");
        System.out.println("b3");
    }

    public static void main(String[] args) {
        System.out.println("main1");
        System.out.println("main2");
        StackEx01.a();
        System.out.println("main3");
        System.out.println("main4");
    }
}
