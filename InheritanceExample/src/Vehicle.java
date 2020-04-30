
public class Vehicle {
	private String colour;
	int maxSpeed;
	
 public Vehicle() {
		System.out.println("Vehicle Constructor");
	}
	public void print() 
	{
		System.out.println("Vehicle Colour:"+colour+"\n"+"Max Speed:"+maxSpeed);
	}
	public String getColour() 
	{
		return colour;
	}
	
	public void setColour(String colour) 
	{
		this.colour=colour;
	}
}

