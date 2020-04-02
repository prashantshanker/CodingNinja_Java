import java.util.Scanner;

public class Pattern12 
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
			while(j<=i) 
			{
				System.out.print("*");
				j++;
			}
			int dec=i-1;
			while(dec>0) 
			{
				System.out.print("*");
				dec--;
			}
			System.out.println();
			i++;
		}
		
	}
}
