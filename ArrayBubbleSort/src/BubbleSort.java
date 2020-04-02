import java.util.Scanner;

public class BubbleSort 
{
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		bubbleSort(arr);
		print(arr);
	}
	public static void bubbleSort(int[] arr)
	{
		int n=arr.length-1;
		int temp;
		for(int i=0;i<=n-1;i++) 
		{
			for(int j=0;j<=n-1-i;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
