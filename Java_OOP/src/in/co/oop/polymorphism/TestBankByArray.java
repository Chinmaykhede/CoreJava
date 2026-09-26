package in.co.oop.polymorphism;

public class TestBankByArray {
	public static void main(String[] args) {
		Bank[] bank = new Bank[3];
		bank[0] = new AxisBank();
		bank[1] = new HDFCBank();
		bank[2] = new ICICBank();
		HomeLoanEnquirey(bank);
	}

	private static void HomeLoanEnquirey(Bank[] bank) {
		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].getName());
			System.out.println(bank[i].interestRate());

		}
	}
}
