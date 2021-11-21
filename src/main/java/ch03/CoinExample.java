package ch03;

public class CoinExample {
    public static void main(String[] args) {
        int money = 11000;
        //으로 동전을 구하기
        int restMoney = money;

        System.out.println((restMoney / 500));
        restMoney = money % 500;

        System.out.println((restMoney / 100));
        restMoney = restMoney % 100;

        System.out.println(restMoney / 50);
        restMoney = restMoney % 50;

        System.out.println(restMoney / 10);
        restMoney = restMoney % 10;
    }
}
