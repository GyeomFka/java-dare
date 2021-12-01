package ch07;

//SubThread 타입이면서, Runnable 타입이다 (다형성)
class SubThread implements Runnable{
    /**
    sub thread of java
     */
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("sub thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx01 {
    /**
     main thread of java
     */
    public static void main(String[] args) {

        SubThread st = new SubThread();
        /*
        * thread의 실행조건
        * */
        Thread t1 = new Thread(st); //→ target 설정
        t1.start(); // → runMethod 실행


        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("main thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
