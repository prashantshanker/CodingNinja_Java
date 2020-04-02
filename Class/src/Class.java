
public class Class 
{
	private String name;
	private int rollNum;
	double cgpa;
	final double conversionfactor=0.95;
	public Class(String name,int rollNum) 
	{
		this.name=name;
		this.rollNum=rollNum;
		System.out.println("two argument");
		
	}
	public Class() 
	{
		this("aassa",23);
		System.out.println("NO argument");
	}
	public Class(String name) 
	{
		this.name=name;
		System.out.println("one argument");
	}
	public void print() 
	{
		System.out.println(name +" "+rollNum);
	}

}
