package ch05;

interface Moveable {
    //public abstract가 생략되어있는것이다. →
    void 위();
    void 아래();
    void 좌();
    void 우();
}

interface Moveable2 {
    //public abstract가 생략되어있는것이다. →
    void 위();
    void 아래();
    void 좌();
    void 우();
    void 회피(); //행위를 추가
}

abstract class 사나운동물 implements Moveable {
    abstract void 공격(); // 미완성 method
    @Override
    public void 위() {System.out.println("위");}
    @Override
    public void 아래() {System.out.println("아래");}
    @Override
    public void 좌() {System.out.println("좌");}
    @Override
    public void 우() {System.out.println("우");}
}

abstract class 온순한동물 implements Moveable2 {
    abstract void 파밍(); // 미완성 method
    @Override
    public void 위() {System.out.println("위");}
    @Override
    public void 아래() {System.out.println("아래");}
    @Override
    public void 좌() {System.out.println("좌");}
    @Override
    public void 우() {System.out.println("우");}
    @Override
    public void 회피(){System.out.println("불쌍하니까");}
}

class 원숭이 extends 온순한동물 {
    @Override
    void 파밍() {System.out.println("바나나 파밍");}

}

class 소 extends 온순한동물 {
    @Override
    void 파밍() {System.out.println("풀 파밍");}
}

class 코뿔소 extends 사나운동물 {
    @Override
    void 공격() {System.out.println("뿔 공격");}
}

class 호랑이 extends 사나운동물 {
    @Override
    void 공격() {System.out.println("어흥 공격");}
}

public class OOPEx09 {

    //static void joyStick(소 a) {           // → ★★★★★★★★다형성을 활용하여 타입을 일치시키면서 동적 바인딩 시킨다.★★★★★★★★
    static void joyStick(온순한동물 a) {     // → ★★★★★★★★다형성을 활용하여 타입을 일치시키면서 동적 바인딩 시킨다.★★★★★★★★
        a.파밍();
        a.회피();
        System.out.println("    :::     절취선    :::     ");
    };

    //static void joyStick(소 a) {
    static void joyStick(사나운동물 a) { //오버로딩
        a.공격();
        a.위();
        System.out.println("    :::     절취선    :::     ");
        /**
         *
         * a.온순한동물을탐색하기(); → 매개변수로 온 사나운동물 타입에는 정의가 안되어있다.
         *
         * 가령, 사나운동묾의 탐색 기능을 추가하려하는데 직접 구체클래스에 구현을 해버리면
         * joystick 에서 사나운동물 클래스에서의 탐색기능이 어려우니
         * 추상화된 클래스에 공통기능을 구현해야 한다.
         */
    };

    public static void main(String[] args) {
        소 a = new 소();
        joyStick(a);
        원숭이 b = new 원숭이();
        joyStick(b);
        호랑이 c = new 호랑이();
        joyStick(c);
        코뿔소 d = new 코뿔소();
        joyStick(d);
    }
}
