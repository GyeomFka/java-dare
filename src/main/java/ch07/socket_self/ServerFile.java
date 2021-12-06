package ch07.socket_self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile { // input buffer

    ServerSocket serverSocket; // 연결만 한다.
    Socket socket; // 실제 통신을 하는 소켓
    BufferedReader br;

    public ServerFile() {
        System.out.println(" :: ServerSocket On :: ");

        try {
            serverSocket = new ServerSocket(10000);
            /*
            10000번 포트 socket생성 → 방화벽 알림 → os의 방화벽 역할 → 모든 포트를 차단하고 있다.
            → 포트가 많이 열려 있으면 열려 있을수록 위험에 노출이 된다. → 10000번 포트를 열어도 되니?
            * */
            System.out.println(" :: ServerSocket 생성완료 → Client 접속 대기중 :: ");
            socket = serverSocket.accept(); // → 클라이언트 접속 대기중

            System.out.println(" :: Client 연결 완료 → Buffer(Readable) connected :: ");

//            br = new BufferedReader(new InputStreamReader(System.in)); → 해당 코드는 키보드와 연결 된 stream
            br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // → socket.getInputStream() → 버퍼를 달아야 한다.

            String msg = br.readLine();
            System.out.println(" :: from client → " + msg + " :: ");


        } catch (Exception e) {
            System.out.println(" :: ServerSocket Err :: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new ServerFile();
    }
}
