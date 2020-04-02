import java.util.Scanner;
public class GreatestNo {

	public static void main(String[] args) 
	{
		int input[] = takeInput();
		printGreatestNo(input);
	}

	private static void printGreatestNo(int[] input) 
	{	
		int n=input.length;
		int greatestNo=1;
		for(int i=0;i<n;i++) 
		{
			if(input[i]>greatestNo) 
			{
				greatestNo=input[i];
			}
			
		}
		System.out.println("Greatest Number:"+greatestNo);
	}

	private static int[] takeInput() 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			input[i]=s.nextInt();
		}
		return input;
	}

}
