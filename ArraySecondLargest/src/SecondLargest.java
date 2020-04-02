import java.util.Scanner;

public class SecondLargest {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(secondLargestElement(arr));
	}

	public static int secondLargestElement(int[] arr) {
		int n = arr.length;
		int greatestInteger = Integer.MIN_VALUE;
		int l=0;
		while(l<n-1)
		{	
			if(arr[l]==arr[l+1]) 
			{
				l++;
				continue;
			}	
		for (int i = 0; i < n; i++) {
			if (arr[i] > greatestInteger) {
				greatestInteger = arr[i];
			}
		}
		
		for (int j = 0; j < n; j++) {
			if (arr[j] == greatestInteger) {
				arr[j] = 0;
			}
		}
		for (int k=0; k < n-1; k++) {
			if (arr[k] > arr[k+1]) {
				
				int temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
			}
		}
		
		return arr[n-1];
		}
		return Integer.MIN_VALUE;
	}

}
