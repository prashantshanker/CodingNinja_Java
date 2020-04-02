import java.util.ArrayList;
import java.util.List;

public class StudentUse {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>(0);

		Student s1 = Student.getStudentUser();
		s1.setAge(12);
		s1.setName("Madhu");
		s1.setPercentage(89.9);
		s1.setPhoneNo(9312558417l);
		s1.setRollNo(345);

		list.add(s1);

		Student s2 = Student.getStudentUser();
		s2.setAge(15);
		s2.setName("Madhu1");
		s2.setPercentage(79.9);
		s2.setPhoneNo(9317558417l);
		s2.setRollNo(349);

		list.add(s2);

		Student s3 = Student.getStudentUser();
		s3.setAge(17);
		s3.setName("Madhu2");
		s3.setPercentage(82.9);
		s3.setPhoneNo(9312578417l);
		s3.setRollNo(325);

		list.add(s3);

		Student s4 = Student.getStudentUser();
		s4.setAge(14);
		s4.setName("Madhu3");
		s4.setPercentage(99.9);
		s4.setPhoneNo(9378558417l);
		s4.setRollNo(336);

		list.add(s4);
		
		System.out.println("list size :"+list.size());

	}

}
