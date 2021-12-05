package ch07.socket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile { //output buffer

    Socket socket;
    BufferedWriter bw;
    BufferedReader br; //키보드와 연결을 위한 buffer

    public ClientFile() {
        try {
            System.out.println(" :: client socket on :: ");
            //socket = new Socket("localhost",10000); // → ServerFile의 socket = serverSocket.accept(); 실행
            socket = new Socket("127.0.0.1",10000); // → ServerFile의 socket = serverSocket.accept(); 실행

            System.out.println(" :: buffer(writable) connected :: ");
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println(" keyboard stream :: buffer(readable) connected :: "); //키보드와의 버퍼스트림
            br = new BufferedReader(new InputStreamReader(System.in)); //키보드와 연결 단계
            System.out.print(" :: input msg → " );
            String keyboardMsg = br.readLine();

            bw.write(keyboardMsg + "\n"); // "\n" 으로 message의 끝을 알려줘야한다.
            bw.flush(); // 강제로 buffer를 flush 해준다.

        } catch (Exception e) {
            System.out.println("client socket error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ClientFile();
    }
}
