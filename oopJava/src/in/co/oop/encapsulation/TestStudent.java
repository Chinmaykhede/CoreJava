package in.co.oop.encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Chinamy");
		s.setCourse("B.Tech");
		s.setEmail("chinmay23@gmail.com");
		s.setMoblieNo("66697845638");
		s.setStudentId(4569L);
		
		System.out.println("Name:-"+s.getName());
		System.out.println("Course:-"+s.getCourse());
		System.out.println("Email:-"+s.getEmail());
		System.out.println("Mobile:-"+s.getMoblieNo());
		System.out.println("StudentID:-"+s.getStudentId());
		
	}

}
