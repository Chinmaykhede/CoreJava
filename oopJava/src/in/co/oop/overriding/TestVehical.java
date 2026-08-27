package in.co.oop.overriding;

public class TestVehical {
	public static void main(String[] args) {
		System.out.println("----------Car-----------");
		Car c = new Car();
		c.speed();
		
		System.out.println("------------Bike------------");
		Bike b =new Bike();
		b.speed();
		
		System.out.println("------------Bus---------------");
		Bus b1 = new Bus();
		b1.speed();
	}

}
