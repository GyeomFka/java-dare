package ch05;

abstract class Animal {
//class Animal {
    //void speak(){}
    abstract void speak(); //몸체 {}가 필요 없어서 시킨다

}

class Dog extends Animal{
    void speak() {
        System.out.println("멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("냥");
    }
}

//신입아 '새' 객체를 만들어
class Bird extends Animal {
    @Override //강제성이 부여가 된다.
    void speak() {
        System.out.println("짹");
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.speak();// → 동적 바인딩 → 부모의 Method 무효화
        a2.speak();
        /*
        * Animal의 speak메서드를 없애면 호출을 할 수가 없다
        * 하지만 껍데기로 존재하기에 없애고 싶다
        * abstract 키워드 사용
        * */
        //Animal a3 = new Animal(); 가 불가능하다.
    }
}
