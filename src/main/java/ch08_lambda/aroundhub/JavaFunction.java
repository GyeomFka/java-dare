package ch08_lambda.aroundhub;

import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class JavaFunction {

	public static void main(String[] args) {
		IntFunction intSum = (a) -> a+10;
		System.out.println(intSum.apply(5));

		BinaryOperator binarySum = (a, b) -> a + " " + b;
		System.out.println(binarySum.apply(1, 2));
		System.out.println(binarySum.apply("스트링도", "가능"));
	}
}
