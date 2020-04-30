import java.util.Scanner;
public class MaximumValueOfSum 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] agrs) 
	{
		int arraySize=s.nextInt();
		int arr[]= new int[arraySize];
		getArray(arr,arraySize);
		printArray(arr);
		System.out.println(rotateSum(arr,arraySize));
	}
	private static int rotateSum(int[] arr, int arraySize) 
	    { 
	        int arrSum = 0; 
	        int currVal = 0; 
	        for (int i=0; i<arr.length; i++) 
	        { 
	            arrSum = arrSum + arr[i]; 
	            currVal = currVal+(i*arr[i]); 
	        } 
	       
	        int maxVal = currVal; 
	        for (int j=1; j<arr.length; j++) 
	        { 
	            currVal = currVal + arrSum-arr.length*arr[arr.length-j]; 
	            if (currVal > maxVal) 
	                maxVal = currVal; 
	        } 
	       
	        return maxVal;
	}
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	}
	private static void getArray(int[] arr, int arraySize) {
		for(int i=0;i<arraySize;i++) 
		{
			arr[i]=s.nextInt();
		}
	}
}
