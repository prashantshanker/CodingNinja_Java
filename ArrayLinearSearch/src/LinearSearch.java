import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) 
	{  
		int input[] = takeInput();
		System.out.print(printSearch(input));

	}

	private static int printSearch(int[] input) 
	{
		int n=input.length;
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=-1;
		int i;
		for( i=0;i<n;i++) 
		{
			if(input[i]==x) 
			{
				y=i;
				break;
			}else
			{
				y=-1;
			}
		}
		return y;
	}

	private static int[] takeInput() 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			input[i]=s.nextInt();
		}
		return input;
	}
	

}
