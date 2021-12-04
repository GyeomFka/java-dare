package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

    public static void main(String[] args) {

        InputStream in = System.in; // → 키보드에 연결된 stream이다.
        //keyboard → [byte단위의 stream 통로 : 주소 = in] → computer
        // input시점에 encoding을 한다
        // byte stream 에서는 *encoding*된 data가 흐르는 작업 : 컴퓨터가 알아볼 수 있도록
        // in.read() method는 *decoding* 작업 : 사람이 알아볼 수 있도록
        // int 로 들어온 것을 부호화도 가능하다.
        try {
            int data = in.read(); // → 2진수로 받은 신호를 10진수로 변환해서 읽어준다.
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //keyboard → 인코딩 전 data → 인코딩 data = 인코딩이란 → 컴퓨터가 이용할 수 있는 신호로 만드는 작업 → 10진수로 전환 → in.read()에서 디코딩
    }

}
