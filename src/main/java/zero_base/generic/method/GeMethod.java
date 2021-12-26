package zero_base.generic.method;

public class GeMethod {

    public static <T> void print(T[] item) {
        for(int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }


    public static <T extends String> void firstPrint(T str) {
        if(str.length() > 0) {
            System.out.println(str.charAt(0));
        }
    }


   /*
   public void print(String[] item) {
        for(int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public void print(double[] item) {
        for(int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }
    */

}
