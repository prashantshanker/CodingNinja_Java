import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int choice=s.nextInt();
		if(choice==1) 
		{
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}else if(choice==2) 
		{
			int product=1;
			for(int j=1;j<=n;j++) 
			{
				product= product*j;
			}
			System.out.println(product);
		}else 
		{
			System.out.println("-1");
		}

	}

}
