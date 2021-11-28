package ch06;

class 호랑이 {
    String name = "호랭ㅇㅣ";
}

class 사자 {
    String name = "사자";
}

class 바구니<T> { //호랑이 or 사자
    T data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        바구니 a = new 바구니();
        a.data = new 호랑이();
        호랑이 h = (호랑이) a.data;

        //System.out.println(a.data.name);
        System.out.println(h.name); //불편하다 → 제네릭을 사용해야 한다.

/*----------------------제네릭 사용후-------------------------------------------*/
        바구니<호랑이> s1 = new 바구니<>();
        s1.data = new 호랑이();
        System.out.println(s1.data.name);


    }
}
