package ch07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(in); // 65 → (char)65로 부호화 → A
        // 단점 : 가변적으로 받질 못한다. 문자열 배열 미리 설정해야함.

        try {
            char[] data = new char[2];
            //int data = ir.read();
            ir.read(data);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
