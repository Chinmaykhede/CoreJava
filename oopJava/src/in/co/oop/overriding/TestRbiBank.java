package in.co.oop.overriding;

public class TestRbiBank {
	public static void main(String[] args) {
		System.out.println("-------------AxisBank--------------");
		AxisBank ax = new AxisBank();
		System.out.println("Interest Rate = "+ax.interestRate());
		ax.calInterestRate(4000.00, 6);
		
		System.out.println("------------------HDFCBank-----------------");
		HdfcBank hd = new HdfcBank();
		System.out.println("Interest Rate = "+hd.interestRate());
		ax.calInterestRate(50000.00, 7);
		
		System.out.println("----------------ICICBank---------------");
		IcicBank ic = new IcicBank();
		System.out.println("Interest Rate = "+ic.interestRate());
		ic.calInterestRate(10000.00, 8);
		
		
		
		
	}
	
    
}
