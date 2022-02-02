package ch08_lambda.aroundhub;

@FunctionalInterface
interface BigNumber {
	int getBigNumber(int num1, int num2);
}

public class LambdaExample2 {

	public static void main(String[] args) {
		BigNumber bn = (x, y) -> {
			return Math.max(x, y);
		};

		int result = bn.getBigNumber(4, 9);
		System.out.println(result);
	}
}
