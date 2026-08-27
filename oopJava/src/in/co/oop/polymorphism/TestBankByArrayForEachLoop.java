package in.co.oop.polymorphism;

public class TestBankByArrayForEachLoop {
	public static void main(String[] args) {
		Bank[] bank = new Bank[3];
		bank[0] = new AxisBank();
		bank[1] = new HDFCBank();
		bank[2] = new ICICBank();
        for(Bank b : bank) {
        	System.out.println(b.getName());
        	System.out.println(b.interestRate());
 	System.out.println("__________________________");
        }
	}

}
