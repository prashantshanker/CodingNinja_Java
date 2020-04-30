import java.util.Scanner;

public class Factorial {
	static Scanner s= new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n=s.nextInt();
		System.out.println(fact(n));
	}

	private static int fact(int n) 
	{
		int fact=1;
		if(n==0) 
		{
			return 1;
		}
		fact=n*fact(n-1);
		return fact;
	}

}
