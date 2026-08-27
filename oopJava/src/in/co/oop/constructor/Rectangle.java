package in.co.oop.constructor;

public class Rectangle extends shape{
	private int length;
	private int width;
	public Rectangle() {
		System.out.println("Default Constructor");
	}
	public Rectangle(String color,int boaderWidth,int length, int width) {
		super(color,boaderWidth);
		this.length=length;
		this.width= width;
		System.out.println("Length is = "+length);
		System.out.println("width is = "+width);
	}
	public int getlength() {
		return this.length;
	}
	public int getwidth() {
		return this.width;
	}

}
