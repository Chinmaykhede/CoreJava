package in.co.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person p1=new Person();
		p1.setName("Chinmay khede");
		p1.setAddress("Indore");
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse("23-10-2002");
		p1.setDob(date);
		
		System.out.println("Name : "+p1.getName());
		System.out.println("Address :"+p1.getAddress());
		System.out.println("Date : "+p1.getDob());
		System.out.println("Age : "+p1.getAge(p1.getDob()));
	}

}
