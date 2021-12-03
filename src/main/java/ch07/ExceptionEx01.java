package ch07;

public class ExceptionEx01 {
    public static void main(String[] args) {
        //컴파일 전에 처리를 한다
        try {
            System.out.println("off상태");
            Thread.sleep(3000); //main thread 1초 동안 잠을 잔다.
            System.out.println("off상태 종료");
        } catch (InterruptedException e) { // 방해의 가능성이 있다.
            e.printStackTrace();
        }

        //런타임 예외 ㅁ
        int[] nums = {1, 2, 3};
        try {
            System.out.println(nums[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            //해당 runtime오류시 어떻게 처리할지 정의
            System.out.println("괜찮아 그냥 진행해!");
        }

        System.out.println("메인 스레드 종료"); // 런타임오류로 인해 실행이 안된다 → 런타임오류로 인해 해당 라인에서 프로그램 강제 종료

    }
}
