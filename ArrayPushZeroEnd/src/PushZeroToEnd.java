import java.util.Scanner;

public class PushZeroToEnd 
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
		pushZerosAtEnd(arr);
		print(arr);
	}
	
	public static void pushZerosAtEnd(int[] arr)
	{
		int i,j;
	      for(i = 0,j = 0;j < arr.length;j++) {
			if(arr[j] != 0){	
	        arr[i] = arr[j];
	        i++;
	        }
	      }
	        for(int k = i;k < arr.length;k++)
	          arr[k] = 0;
		
	}
}
