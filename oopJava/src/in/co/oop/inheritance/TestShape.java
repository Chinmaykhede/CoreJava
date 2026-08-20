package in.co.oop.inheritance;

public class TestShape {
public static void main(String[] args) {
	System.out.println("-----------Circle---------");
	Circle c = new Circle();
	c.setColor("Yello");
	c.setBorderwidth(3);
	c.setRadius(4.5);
	c.area();
	System.out.println("Circle color:-"+c.getColor());
	System.out.println("Circle Borderwidth:-"+c.getBorderwidth());
	System.out.println("Circle Radius:-"+c.getRadius());
	
	System.out.println("--------------Rectangle-----------------");
	Rectangle r = new Rectangle();
	r.setLength(5);
	r.setWidth(4);
	r.setBorderwidth(2);
	r.setColor("Red");
	r.area();
	System.out.println("Length:-"+r.getLength());
	System.out.println("Width:-"+r.getWidth());
	System.out.println("Borderwidth:-"+r.getBorderwidth());
	System.out.println("Color:-"+r.getColor());
	
	System.out.println("------------------Traingle----------------");
	Traingle t = new Traingle();
	t.setBase(7);
	t.setHeight(8);
	t.setBorderwidth(5);
	t.setColor("Blue");
	t.area();
	System.out.println("Base:-"+t.getBase());
	System.out.println("Height:-"+t.getHeight());
	System.out.println("Border:-"+t.getBorderwidth());
	System.out.println("Color:-"+t.getColor());
	
}
}
