import java.util.Scanner;

public class SelectionSort 
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
		selectionSort(arr);
		print(arr);
	}
	public static void selectionSort(int[] arr)
	{
		int n=arr.length-1;
		int temp;
		for(int i=0;i<=n-1;i++) 
		{
			for(int j=i+1;j<=n;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
