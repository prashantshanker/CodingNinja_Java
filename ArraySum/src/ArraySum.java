import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]= takeInput();
		printSum(arr);

	}
	
	private static void printSum(int[] arr) 
	{
		int input=arr.length;
		int sum=0;
		for(int i=0;i<input;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	public static int[] takeInput()
	{
		Scanner s= new Scanner(System.in);
		int input= s.nextInt();
		int arr[] = new int[input];
		for(int i=0;i<input ;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	

}
