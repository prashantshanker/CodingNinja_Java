import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		char jthChar='A';
		while(i<=n) 
		{
			int j=1;
			while(j<=i) 
			{
				System.out.print(jthChar);
				j++;
				
			}
			System.out.println();
			i++;
			jthChar++;
		}
		
	}

}
