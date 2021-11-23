package ch05;

// 요리사
class Chef {
    String name = "요리사";
}

//만겸 || 요리사
class People extends Chef {
    String name = "만겸";
}

public class OOPEx03 {
    public static void main(String[] args) {
        People p1 = new People(); //-> 메모리에는 만겸||요리사 같이
        System.out.println(p1.name);

        Chef c1 = new Chef();
        System.out.println(c1.name);

        //People p2 = new Chef(); 불가능하다
    }
}
