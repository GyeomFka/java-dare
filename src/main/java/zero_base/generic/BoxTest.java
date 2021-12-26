package zero_base.generic;

public class BoxTest {

    public static void main(String[] args) {

        BoxInteger b1 = new BoxInteger();
        //b1.setBox("홍길동");
        //String name = (String)b1.getBox();

        //System.out.println(name);


        BoxInteger b2 = new BoxInteger();
        b2.setBox(25);
        Integer age = (Integer)b2.getBox();

        System.out.println(age);

        //runtime exception
        Integer count = (Integer)b1.getBox();
        System.out.println(count);

        //형변환에 다양한 예외가 발생한다


    }

}
