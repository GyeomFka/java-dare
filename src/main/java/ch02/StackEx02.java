package ch02;

public class StackEx02 {
/*
메모리 관점에서의 변수 범위

*  stack 지역변수 → 메서드가 실행될 때 메모리에 할당된다 → 메서드가 종료될 때 메모리에서 사라진다. → 생명주기 짧다.
*  heap 전역변수 → new 할때 메모리에 할당 된다. → 더이상 참조하지 않을 때 메모리에서 사라진다.
*  static 전역변수 → main method가 실행되기 전에 메모리에 할당된다. → main메서드가 종료되면 메모리에서 사라진다.
*
* */
    static int sum = 20; // 전역변수 → static area → main method가 시작되기전에 sum이 할당된다.
    int value = 50; //전역변수 → heap area → 더 이상 참조하지 않을 때 자동으로 사라진다

    static void a() {
        int n1 = 1; //a메서드의 stack영역에 저장 (지역변수) → a method 호출될때 stack공간에 n1할당  → a메서드 종료될 때 사라짐
        System.out.println(n1);

        //static int n2 = 2;
        /*
        static 내부에서 static을 선언하지 못하는 이유
         : static 공간 할당은 main 실행때만 가능하기 떄문에!
        * */
    }

    public static void main(String[] args) {
        /*
        * a()의 n1으로 접근하고싶지만, 방법이가 없다.
        * */
        a();
        //System.out.println(n1); 불가능
        System.out.println(sum); //가능
        //System.out.println(value); 단순 사용 불가능
        //value를 쓰는과정
        StackEx02 s = new StackEx02(); //heap공간에 value가 할당된다.
        System.out.println(s.value);
        System.out.println("여기서 부터 s변수를 참조하지 않기 때문에 메모리에서 사라진다.");
    }
}
