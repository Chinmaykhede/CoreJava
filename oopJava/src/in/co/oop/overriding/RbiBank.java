package in.co.oop.overriding;

public class RbiBank {
	
	protected double interestRate;
	
	public double interestRate() {
		System.out.println("Interest Rate of RBI");
		return interestRate = 11.5;
	}
   public void calInterestRate(double princple,int time) {
	   double interest=(princple*this.interestRate*time)/100;
	   System.out.println("Interest is = "+interest);
   }
}


