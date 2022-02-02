package ch08_lambda.programmers;

public class LamdaExpress {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("hello" + i);
			}
		}).start();
	}
}
