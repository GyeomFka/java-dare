package ch08_lambda.programmers;

public class CompareExam {

	private static void exec(Compare compare) {
		System.out.println("result : " + compare.compareTo(10, 20));
	}

	public static void main(String[] args) {
		exec((a, b) -> {
			return a * b;
		});
	}
}
