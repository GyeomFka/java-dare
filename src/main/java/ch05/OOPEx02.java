package ch05;

class Engine {
    int power;
 }

 class Car { // 자동차 != 엔진

    //잘 만들어진걸 가져와서 사용하는것 : 콤포지션 : 결합
    Engine e;
    public Car(Engine e) {
        this.e = e;
    }
 }

 class Hamburger {
    String name = "기본";
    String material1 = "양상추";
    String material2 = "패티";
 }

 class CheeseHamurger extends Hamburger{ //치즈햄버거 == 햄버거
     //상태와 행위를 물려받을 수 있지만, 꼭 타입이 일치될 수 있어야 한다.
     String name = "치즈버거";
}

class Chickenburger {
    String name = "칙벅";
    Hamburger h;
    public Chickenburger(Hamburger h) {
        this.h = h;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c1 = new Car(e);
        System.out.println(c1.e.power);

        CheeseHamurger h1 = new CheeseHamurger();
        System.out.println(h1.name); // 겹치면 자신의 상태를 쓴다. 겹치지 않는 필드만 물려 받는다.
        System.out.println(h1.material1);
        System.out.println(h1.material2);

        Hamburger ham = new Hamburger();
        Chickenburger ch1 = new Chickenburger(ham);
        System.out.println(ch1.name);
        System.out.println(ch1.h.material1);
        System.out.println(ch1.h.material2);
    }
}
