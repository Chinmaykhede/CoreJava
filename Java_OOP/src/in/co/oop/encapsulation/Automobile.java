package in.co.oop.encapsulation;

public class Automobile {
	private String colour;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void changeGear(int gear) {
		switch (gear) {
		case 1:
			speed = 20;
			System.out.println("Gear no.1 speed=" + speed);
			break;
		case 2:
			speed = 40;
			System.out.println("Gear no.2 speed=" + speed);
			break;
		case 3:
			speed = 60;
			System.out.println("Gear no.3 speed=" + speed);
			break;
		case 4:
			speed = 80;
			System.out.println("Gear no.4 speed=" + speed);
			break;
		case 5:
			speed = 100;
			System.out.println("Gear no.5 speed=" + speed);
			break;
		case 6:
			speed = 130;
			System.out.println("Gear no.6 speed=" + speed);
			break;
		default:
			System.out.println("Invalid Gear");
		}
	}

	public void accelerator() {
		this.speed = this.speed + 10;
		System.out.println("Accelerator speed=" + speed);
	}

	public void breakvehical() {
		this.speed = this.speed - 10;
		if (this.speed == 0) {
			System.out.println("Car stoped");
		} else {
			System.out.println("apply break, speed=" + speed);
		}
	}

}
