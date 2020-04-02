
public class Student {

	private static Student instanceOfStudent = null;

	private String name;
	private int rollNo;
	private double percentage;
	private long phoneNo;
	private int age;

	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static Student getStudentUser() 
	{
		if (instanceOfStudent  == null) 
			instanceOfStudent  = new Student(); 
  
        return instanceOfStudent ; 
	} 

}
