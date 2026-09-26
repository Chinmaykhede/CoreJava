package in.co.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setNumber("0987654321");
		a1.setAccountType("Saving");
		a1.setBalance(20000.0);
		System.out.println("AccountType :"+a1.getAccountType());
		System.out.println("Number :"+a1.getNumber());
		System.out.println("Balance :"+a1.getBalance());
		
		a1.deposit(5000);
		System.out.println("After deposit ="+a1.getBalance());
		a1.withdrawal(3000);
		System.out.println("After withdrawal ="+a1.getBalance());
		a1.withdrawal(30000);
		a1.fundtransfer(400);
		a1.paybill(800);
		

	}

}
