import java.util.Scanner;
public class ClockUse
{
	public static void main(String[] agrs) 
	{
		Scanner s = new Scanner(System.in);
		int hour=s.nextInt();
		int min=s.nextInt();
		int sec=s.nextInt();
		Clock c1 = new Clock(hour, min, sec);
		c1.validity();
		
	}

}
