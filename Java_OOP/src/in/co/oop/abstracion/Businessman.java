package in.co.oop.abstracion;

public class Businessman extends Person implements Richman , HelpToOthers{

	@Override
	public void helpToOthers() {
		System.out.println("HelpToOthers...........");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("EarnMoney.................");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation...................");
		
	}

	@Override
	public void party() {
		System.out.println("Party...............");
		
	}
	

}
