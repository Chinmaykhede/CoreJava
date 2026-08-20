package in.co.oop.encapsulation;

import java.util.Date;

public class Employee {
	private Long employeeId;
	private String name;
	private String designation;
	private double salary;
	private Date joiningDate;
	
	public Long getemployeeId() {
		return this.employeeId;
	}
	public void setemployeeId(Long employeeId) {
		this.employeeId=employeeId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	

}
