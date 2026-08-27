package in.co.oop.abstracion;

public class Circle extends Shape {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle = " + Math.PI * r * r);

	}

}
