package in.co.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("-----------Businessman-------------");
		Businessman b = new Businessman();
		b.setName("Arjun");
		b.setAddress("Indore");
		Date d = sdf.parse("23-05-2026");
		b.setDateofBirth(d);
		b.setIncome(23000);
		
		System.out.println("Name ="+b.getName());
		System.out.println("Address ="+b.getAddress());
		System.out.println("DateofBirth ="+b.getDateofBirth());
		System.out.println("Income ="+b.getIncome());
		
		System.out.println("------------Doctor-------------");
		Doctor d1 = new Doctor();
		d1.setName("Dr.Hema");
		d1.setAddress("Indore");
		d=sdf.parse("25-09-2024");
		d1.setDateofBirth(d);
		d1.setRegistrationNo("Dox345678");
		System.out.println("Name ="+d1.getName());
		System.out.println("Address ="+d1.getAddress());
		System.out.println("DateofBirth ="+d1.getDateofBirth());
		System.out.println("Registration ="+d1.getRegistrationNo());
		
		System.out.println("------------Student-------------");
		Student s = new Student();
		s.setName("Chinmay");
		s.setAddress("Indore");
		s.setDateofBirth(d);
	    s.setMarks(90);
	    s.setRollNo("5012");
	    System.out.println("Name ="+s.getName());
		System.out.println("Address ="+s.getAddress());
		System.out.println("DateofBirth ="+s.getDateofBirth());
		System.out.println("Marks ="+s.getMarks());
		System.out.println("RollNo ="+s.getRollNo());
	    
		
		
	}

}
