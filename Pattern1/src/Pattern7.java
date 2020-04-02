import java.util.Scanner;

public class Pattern7 
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
			while(j<=n) 
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
