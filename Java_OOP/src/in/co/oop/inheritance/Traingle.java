package in.co.oop.inheritance;

public class Traingle extends Shape {
	private double height;
	private double base;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void area() {
		double area=0.5*this.base*this.height;
		System.out.println("Area of Traingle:-"+area);
		
	}
	

}
