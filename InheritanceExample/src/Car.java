
public class Car extends Vehicle {
	int numDoors;
	int maxSpeed;
	public Car() 
	{
		System.out.println("Car Constructor");
	}
	
	public void printCar() 
	{
		System.out.println("Car Colour:"+getColour()+"\n"+"Max Speed:"+maxSpeed+"NoOfDoor:"+numDoors);
	}
	public void printMaxSpeed() 
	{
		super.maxSpeed=150;
		System.out.println(maxSpeed+" "+super.maxSpeed);
	}
}
