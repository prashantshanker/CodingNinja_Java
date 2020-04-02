import java.util.Scanner;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		char nextChar='A';
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
			nextChar++;
		}
		
	}

}
