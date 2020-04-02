import java.util.Scanner;
public class AP {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) 
		{
			int x=3*i+2;
			if(x%4==0) 
			{
				n++;
			}else 
			{
				System.out.print(x+" ");
			}
		}

	}

}
