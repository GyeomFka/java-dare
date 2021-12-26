package zero_base.generic.method;

public class GeMethodTest {

    public static void main(String[] args) {

        String[] name = {"a", "b", "c"};
        Double[] scores = {100.0, 99.0, 98.0};

        GeMethod.print(name);
        GeMethod.print(scores);

        GeMethod.firstPrint(name[0]);

    }

}
