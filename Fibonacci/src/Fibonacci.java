import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0,j=1,k=0,fib=0;
		for(;i<n*2;i++) 
		{
			fib=j+k;
			
			j=k;
			k=fib;
			if(fib==n) 
			{
				System.out.println("true");
				return;
			}
		}
		System.out.print("false");
	}

}
