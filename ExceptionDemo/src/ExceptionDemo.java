import java.util.Scanner;

public class ExceptionDemo {
	static Scanner s =new Scanner(System.in);
	
	public static int divide(int a,int b) throws DivideByZeroException 
	{
		if(b==0) 
		{
			throw new DivideByZeroException();
		}
		int x=a/b;
		System.out.println(x);
		return x;
	}

	public static void main(String[] args) 
	{
		int a=s.nextInt();
		int b=s.nextInt();
		
		try {
			divide(a,b);
		} catch (DivideByZeroException e) {
			System.out.println("Divide By Zero Exception Raised");
		}
	}

}
