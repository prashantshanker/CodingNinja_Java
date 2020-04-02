import java.util.Scanner;

public class Test7 
{
	public static void main(String[] agrs) 
	{
		Scanner s= new Scanner(System.in);
		int i=1;
		int sum=0;
		int n=s.nextInt();
		while(i<=n) 
		{
			System.out.println("Number:"+ i);
			sum+=i;
			System.out.println("SUM:"+ sum);
			i=i+1;
		}
	}

}
