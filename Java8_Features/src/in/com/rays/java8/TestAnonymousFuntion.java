package in.com.rays.java8;

public class TestAnonymousFuntion {
	public static void main(String[] args) {

		HelloInterface h1 = new HelloInterface() {

			@Override
			public void m2() {
				System.out.println("this is m2 method");
			}

			@Override
			public void m1() {
				System.out.println("this is m1 method");
			}
		};
		h1.m1();
		h1.m2();
	}
}
