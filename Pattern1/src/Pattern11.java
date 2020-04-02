import java.util.Scanner;

public class Pattern11 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int p=n;
		while(i<=n) 
		{
			int j=1;
			while(j<=n-i+1) 
			{
				System.out.print(p);
				j++;
			}
			p--;
			System.out.println();
			i++;
		}
	}

}
