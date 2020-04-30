import java.util.Scanner;
public class Test1 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=s.nextInt();
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<(n*2)+1;j++) 
			{
				if(j==n) 
				{
					System.out.print("*");
				}else if(j==i) 
				{
					System.out.print("*");
				}else if(j==(n*2)-i) 
				{
					System.out.print("*");
				}else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
