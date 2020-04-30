import java.util.Scanner;

public class ReverseArray
{	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		getArray(arraySize, arr);
		reverseArray(arr);
		printArray(arr);
	}
	
	private static int[] reverseArray(int[] arr) {
		int start=0,end=arr.length-1;
		int temp;
		while(start<end) 
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
		
	}

	private static void getArray(int arraySize, int[] arr) {
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


}
