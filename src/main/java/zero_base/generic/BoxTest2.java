package zero_base.generic;

public class BoxTest2 {

    public static void main(String[] args) {

        Box<String> b1 = new Box<String>();
        b1.setData("bb");
        System.out.println(b1.getData());


        Box<Integer> b2 = new Box<Integer>();
        b2.setData(25);
        Integer data = b2.getData();
        System.out.println(data);

        // ---------------------------------

        Box2<String> b3 = new Box2<String>();

        Box3<String, Integer> b4 = new Box3<>("aa",11);

        Integer age = b4.getAge();
        String name = b4.getName();

        System.out.println("name = " + name);
        System.out.println("age = " + age);


    }

}
