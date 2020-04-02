import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) 
		{
			int j=i;
			int num=2*i-1;
			while(j<=n) 
			{
				int x=num;
				System.out.print(x);
				j++;
				num=num+2;
				
				
				
			}
			int k=i-1;
			int l=1;
			while(k>0) 
			{
				System.out.print(l);
				l=l+2;
				k--;
			}
			System.out.println();
			i++;
			
		}
		
	}

}
