package in.com.rays.thread;

public class TestHelloRunnable {
	public static void main(String[] args) {

		HelloRunnable h1 = new HelloRunnable("Hema");
		HelloRunnable h2 = new HelloRunnable("Chinmay");
		
		h1.run();
		h2.run();
		
		

	}
}
