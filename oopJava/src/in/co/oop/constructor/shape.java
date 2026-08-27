package in.co.oop.constructor;

public class shape {
	private String color;
	private int boaderWidth;

	public shape() {
		System.out.println(" this is default constructor");
	}

	public shape(String color, int boaderWidth) {
		this.color = color;
		this.boaderWidth = boaderWidth;

	}

	public String getcolor() {
		return this.color;
	}

	public int getboaderWidth() {
		return this.boaderWidth;
	}

}
