package in.co.oop.encapsulation;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
	return number;	
	}
	public void setNumber(String number) {
	this.number=number;	
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
		
		
	}
	public void deposit(double amount) {
	 this.balance=this.balance+amount;
	}
	public void withdrawal(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			this.balance=this.balance-amount;
		}
	}
		public void fundtransfer(double fund) {
			if("0987654321"==this.number) {
				this.balance=this.balance+fund;
				System.out.println(this.balance+ ":- Fundtransfer Successfully");
			}
		}
			public void paybill(double bill) {
				if(bill>this.balance) {
					System.out.println("Insufficient fund");
				}else {
					this.balance=this.balance-bill;
					System.out.println(this.balance+ ":- Bill Payed Successfully");
				}
			}
		}


