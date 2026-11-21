package in.com.rays.java8;

public class TestLambdaExpression {
	public static void main(String[] args) {

		HelloFunctionalInterface h = (a, b) -> {
			return a + b;
		};
		System.out.println(h.sum(15, 10));
	}

}
