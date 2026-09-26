package in.co.oop.polymorphism;

public class Bank {
	protected int p;
	protected int r;
	protected int t;
	public String getName() {
		return "RBI Bank";
	}
	public double interestRate() {
		return 11.9;
	}
	public static Bank getBank(int i) {

		if (i == 1)
			return new HDFCBank();
		if (i == 2)
			return new ICICBank();
		if (i == 3)
			return new AxisBank();
		return new Bank();

	}
	public void calInterest(int p,int r,int t) {
		this.p=p;
		this.r=r;
		this.t=t;
		System.out.println();
	}

}
