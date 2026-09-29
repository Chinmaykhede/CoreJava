package in.com.rays.priority;

public class TestPriorityThread {
	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread("Chinmay");

		PriorityThread t2 = new PriorityThread("Harshit");

		// Set thread priorities
		t1.setPriority(10); // Maximum priority
		t2.setPriority(1); // Minimum priority

		t1.start();

		t2.start();
	}

		
	}

