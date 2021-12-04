package ch07;

import org.w3c.dom.ls.LSOutput;

public class StringEx01 {
    public static void main(String[] args) {
        String s1 = new String("문자열");
        String s2 = new String("문자열");
        System.out.println(s1 == s2); // false

        String s3 = "문자열";
        String s4 = "문자열";
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s3 == s4); //true

        System.out.println(" :: " + s3.equals(s1) + " :: ");

    }
}
