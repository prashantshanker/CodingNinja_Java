import java.util.Scanner;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) 
		{
			int k=(n-i);
			while(k>0) 
			{
				System.out.print(" ");
				k--;
			}
			
			int j=1;
			int increment=i;
			while(j<=i) 
			{
				System.out.print(increment);
				increment++;
				j++;
			}
			int dec=i-1;
			int decrement=i*2-2;
			while(dec>0) 
			{
				System.out.print(decrement);
				decrement--;
				dec--;
			}
			System.out.println();
			i++;
		}
		
	}

}
