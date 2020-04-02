import java.util.Scanner;

public class Largestof3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a==b && b==c)
		{
			System.out.print("All are Equal");
		} else  
			{if(a>=b && a>=c)
			{
			  if(a==b)
			  {
				  System.out.println("a&b both Largest No."); 
			  }else if(a==c)
			  {
				  System.out.println("a&c both Largest No."); 
			  }else 
			  {
				  System.out.println("a Largest No."); 
			  }
			}else if(b>=a && b>=c) 
				{
				  if(b==c) 
				  {
					  System.out.println("b&c both Largest No."); 
					  
				  }else 
				  {
					  System.out.println("b Largest No."); 
				  }
				
				}else
				{
					System.out.println("c Largest No."); 
				}
			
			}
		
	}

}
