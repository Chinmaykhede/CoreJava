package in.co.oop.encapsulation;

public class TestCourse {
	public static void main(String[] args) {
		Course c = new Course();
		c.setCourseId(201);
		c.setCourseName("Core Java");
		c.setDuration("6 week");
		c.setFees(60000);
		c.setTrainerName("Kanak Maam");
		System.out.println("CourseId="+c.getCourseId());
		System.out.println("CourseName="+c.getCourseName());
		System.out.println("Duration="+c.getDuration());
		System.out.println("Fees="+c.getFees());
		System.out.println("TrainerName="+c.getTrainerName());
		
	}

}
