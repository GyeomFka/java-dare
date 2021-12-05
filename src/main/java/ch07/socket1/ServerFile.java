package ch07.socket1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile { //input buffer

    ServerSocket serverSocket;  //연결만 한다
    Socket socket;  //실제 통신을 하는 소켓
    BufferedReader br;

    public ServerFile() {
        System.out.println(" :: Server socket on :: ");
        try {
            serverSocket = new ServerSocket(10000);
            //실제 10000번 socket생성 → 방화벽 알림이 뜬다
            //why ? → os 방화벽 역할 → 모든 포트를 차단하고있다. → 포트가 많이 열려 있으면 열려 있을수록 위험에 노출이 된다.
            //10000번 포트를 열어도 되니 ?
            System.out.println(" :: Server socket 생성 완료 → 클라이언트 접속 대기중 :: ");
            //대기를 해야한다.
            socket = serverSocket.accept(); // → 클라이언트 접속 대기중
            // if 클라이언트 접속 한다면
            System.out.println(" :: 클라이언트 연결 완료 ::  ");
            System.out.println(" :: buffer(readable) connected :: ");
            // buffer 생성
            //br = new BufferedReader(new InputStreamReader(System.in)); // 키보드와 연결 되어 잇다.
            br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //socket.getInputStream()여기로 버퍼를 달아야 한다.
            //serversocket에는 input buffer를 생성했다.
            // socket과 client의 Byte stream
            // s - c 양 끝의 buffer를 생성한다.
            String msg = br.readLine();
            System.out.println(" :: from client → " + msg + " :: ");

        } catch (Exception e) {
            System.out.println("server socket error : " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new ServerFile();
    }
}
