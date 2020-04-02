import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) 
		{
			int j=1;
			int sum=0;
			while(j<=i) 
			{
				System.out.print(j);
				sum=sum+j;
				if(i==j) 
				{
					
				}else
				{
					System.out.print("+");
				}
				j++;
			}
			System.out.print("=");
			System.out.print(sum);
			System.out.println();
			i++;
		}
	}

}
