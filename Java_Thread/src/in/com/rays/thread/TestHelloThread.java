package in.com.rays.thread;

public class TestHelloThread {
	public static void main(String[] args) {
		
		HelloThread h1 = new HelloThread("Chinmay");
		HelloThread h2 = new HelloThread("Ram");
		HelloThread h3 = new HelloThread("Hanuman");
		
		h1.start();
		h2.start();
		h3.start();
		for(int i=1; i<=10; i++) {
			System.out.println(i+"="+"Hello Thread");
		}
		
	} 

}
