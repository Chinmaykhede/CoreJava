package in.co.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployee {
	public static void main(String[] args) throws ParseException {
		Employee e = new Employee();
		e.setName("Chinmay khede");
		e.setDesignation("Java Developer");
		e.setemployeeId(56678459L);
		e.setSalary(100000.0);
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date d = s.parse("05-08-2026");
		e.setJoiningDate(d);
		System.out.println("Name:-" + e.getName());
		System.out.println("Designation:-" + e.getDesignation());
		System.out.println("EmployeeId:-" + e.getemployeeId());
		System.out.println("Salary:-" + e.getSalary());
		System.out.println("JoiningDate:-" + e.getJoiningDate());
	}

}
