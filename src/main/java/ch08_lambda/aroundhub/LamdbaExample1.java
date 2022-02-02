package ch08_lambda.aroundhub;

//FunctionalInterface -> 구현해야 할 추상 메소드가 한 가지 인 인터페이
@FunctionalInterface
interface Print {
	void print(int a, int b); //구현체가 없다.
}

class Test {
	public void testMethod(Print print) {
		print.print(1, 2);
		System.out.println(" :: 콘솔 출력 실행 :: ");
	}
}

public class LamdbaExample1 {

	public static void main(String[] args) {
		/* lambda 활용 [X] */
		Test noLambda = new Test();
		noLambda.testMethod(new Print() {
			@Override
			public void print(int a, int b) {
				System.out.println(" :: a + b :: " + (a + b));
				System.out.println(" :: a - b :: " + (a - b));
			}
		});

		/* lambda 활용 [O] */
		Test lambdaTest = new Test();
		lambdaTest.testMethod((a, b) -> {
			System.out.println(" :: a + b :: " + (a + b));
			System.out.println(" :: a - b :: " + (a - b));
		});
	}
}
