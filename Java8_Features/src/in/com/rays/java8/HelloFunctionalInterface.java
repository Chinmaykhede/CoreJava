package in.com.rays.java8;

public interface HelloFunctionalInterface {

	public int sum(int a, int b);

	public default void d1() {
		System.out.println("this is default method");
	}

	public static void s1() {
		System.out.println("this is static method");
	}

}
