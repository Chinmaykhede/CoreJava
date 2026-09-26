package in.co.oop.abstracion;

public class Rectangle extends Shape {
	private int l;
	private int w;
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l=l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w=w;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle = " + l * w);

	}

}
