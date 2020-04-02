import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int mul=1;
		while(mul<=10) 
		{
			System.out.println(mul*n);
			mul=mul+1;
		}
	}

}
