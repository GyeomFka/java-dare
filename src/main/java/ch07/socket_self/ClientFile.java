package ch07.socket_self;

import java.io.*;
import java.net.Socket;

public class ClientFile { // output buffer

    Socket socket;
    BufferedWriter bw;
    BufferedReader br; // 키보드와 연결을 위한 buffer

    public ClientFile() {

        try {
            System.out.println(" :: ClientSocket on :: "); 
            socket = new Socket("127.0.0.1", 10000); // Serverfile객체에서 accept() 실행/ 

            System.out.println(" :: Client 연결 완료 → Buffer(Writable) connected :: ");
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println(" :: Kyeboard Stream → Buffer(Readable) connected :: "); // 키보드와의 buffer stream
            br = new BufferedReader(new InputStreamReader(System.in)); // 키보드와 연결단계
            System.out.print(" :: Input msg → :: ");
            String keyboardMsg = br.readLine();
            
            bw.write(keyboardMsg + "\n"); // \n으로 msg의 끝을 알려줘야 한다.
            bw.flush(); // 강제로 buffer를 flush 해준다
            
        } catch (Exception e) {
            System.out.println(" :: ClientSocket Err :: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new ClientFile();
    }
}
