package in.co.oop.abstracion;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Circle c = (Circle) s1;
		c.setR(5);
		System.out.println("Radius = "+c.getR());
		c.area();
		System.out.println("------------------------");
		Shape s2 = new Rectangle();
		Rectangle r = (Rectangle) s2;
		r.setL(4);
		r.setW(6);
		System.out.println("Length = "+r.getL());
		System.out.println("Width = "+r.getW());
		r.area();
	}

}
