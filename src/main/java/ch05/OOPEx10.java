package ch05;

interface Canable {
    void talk(); //public abstract 생략가능
}

abstract class 홀직원 implements Canable{
    abstract void 청소();
    @Override
    public void talk() {
        System.out.println("손님과의 대화");
    }
}

abstract class 종업원 extends 홀직원 {
    void 서빙() {
        System.out.println("서빙하기");
    }
    void 주문() {
        System.out.println("주문받기");
    }
}

abstract class 캐셔 extends 홀직원 {
    void 정산() {
        System.out.println("정산하기");
    }

    void 계산() {
        System.out.println("계산하기");

    }
}

abstract class 요리사 {
    abstract void 요리();
}

class 홍길동 extends 종업원 {
/*
* 종업원은 요리사와 의존한다
* 요리사 구현체를 의존하면 안되고
* 추상화된 요리사 자체를 의존해야한다.
* */

    //장보고 j;
    요리사 j; // 추상적인 것에 의존해야한다.

    @Override
    void 청소() {
        System.out.println("화장실 청소");
    }
}
class 임꺽정 extends 종업원 {
    @Override
    void 청소() {
        System.out.println("주방 청소");
    }
}
class 김유신 extends 캐셔 {
    @Override
    void 청소() {
        System.out.println("홀 청소");
    }
}
class 이몽룡 extends 캐셔  {
    @Override
    void 청소() {
        System.out.println("테이블 청소");
    }
}
class 장보고 extends 요리사  {
    @Override
    void 요리() {
        System.out.println("양식");
    }
}
class 이순신 extends 요리사  {
    @Override
    void 요리() {
        System.out.println("한식");
    }
}



public class OOPEx10 {
}
