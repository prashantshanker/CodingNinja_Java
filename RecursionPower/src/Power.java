import java.util.Scanner;

public class Power {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(pow(x,n));
	}
	private static int pow(int x, int n) {
		int pow =x;
		if(n==0) 
		{
			return 1;
		}
		pow=pow*pow(x,n-1);
		return pow;
	}

}
