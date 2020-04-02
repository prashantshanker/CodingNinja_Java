import java.util.Scanner;

public class SumofEO 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sume=0; 
		int sumo=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0) 
			{
				sume= rem + sume;
			}else
			{
				sumo=rem+sumo;
			}
		  n=n/10;
			
		}	
		System.out.print(sume);
		System.out.print(sumo);
	}

}
