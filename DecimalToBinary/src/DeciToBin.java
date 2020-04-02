import java.util.Scanner;

public class DeciToBin 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int multi=1;
		while(n>0) 
		{
			int div=2;
			int rem;
			rem=n%2;
			
			int x=multi*rem;
			multi= multi*10;
			sum=sum+x;
			n=n/2;
		}
		System.out.println(sum);
	}
}	
