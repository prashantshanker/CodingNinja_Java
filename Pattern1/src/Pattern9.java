import java.util.Scanner;

public class Pattern9 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		char nextChar=(char)('A'+n-1);
		while(i<=n) 
		{
			int j=1;
			char jthChar=nextChar;
			while(j<=i) 
			{
				
				System.out.print(jthChar);
				j++;
				jthChar++;
				
			}
			System.out.println();
			i++;
			nextChar--;
		}
		
	}
}
