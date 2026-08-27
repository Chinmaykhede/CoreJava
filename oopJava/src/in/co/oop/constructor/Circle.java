package in.co.oop.constructor;

public class Circle extends shape {
	private int radius;

	public Circle() {
		System.out.println("Default Constructor");

	}

	public Circle(String color, int boaderWidth, int radius) {
		super(color, boaderWidth);
		this.radius = radius;
		System.out.println("Radius= "+radius);
		System.out.println("Color= "+color);
		System.out.println("BoaderWidth= "+boaderWidth);

	}
public int getradius() {
	return this.radius;
}
}
