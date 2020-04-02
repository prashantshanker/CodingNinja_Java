import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) 
		{
			int I=i;
			int z=I*I;
			if(n/z==0)
			{
				System.out.print(--I);
				return;
			}else if(i==n)
			{
				n++;
			} 
			
		}
	}

}
