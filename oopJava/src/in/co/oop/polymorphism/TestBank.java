package in.co.oop.polymorphism;

public class TestBank {
	public static void main(String[] args) {
		Bank b = new AxisBank();
		System.out.println(b.getName());
		System.out.println(b.interestRate());
		System.out.println("---------------------------");
		
		Bank b1 = new HDFCBank();
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());
		System.out.println("---------------------------");
		Bank b2 = new ICICBank();
		System.out.println(b2.getName());
		System.out.println(b2.interestRate());
		
	}

}
