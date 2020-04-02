import java.util.Scanner;
public class Swap 
{
	static Scanner s = new Scanner(System.in);
	
	
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	
	public static void main(String[] args) {
		
		int[] input = takeInput();
		swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}
		
	}

	private static void swapAlternate(int[] input) 
	{
		int n=input.length;
		int temp;
		if(n%2==0) {
		for(int i=0;i<n;i+=2) 
		{
			temp=input[i];
			input[i]=input[i+1];
			input[i+1]=temp;
		}
		}else 
		{
			for(int i=0;i<n-1;i+=2) 
			{
				temp=input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
	}

}
