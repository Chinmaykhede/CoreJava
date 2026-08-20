package in.co.oop.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile am = new Automobile();
		am.setColour("Red");
		am.setMake("BMW");
		am.setSpeed(300);
		System.out.println("Colour: " + am.getColour());
		System.out.println("Make: " + am.getMake());
		System.out.println("Speed: " + am.getSpeed());
		am.changeGear(1);
		am.accelerator();
		am.breakvehical();
		am.breakvehical();
		am.breakvehical();


	}

}
