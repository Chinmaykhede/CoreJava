package in.co.oop.polymorphism;

public class ICICBank extends Bank{
	@Override
	public String getName() {
		return "ICIC Bank";
	}
	@Override
	public double interestRate() {
		return super.interestRate();
	}

}
