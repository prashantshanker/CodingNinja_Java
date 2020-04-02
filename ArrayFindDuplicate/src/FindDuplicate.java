import java.util.Scanner;
public class FindDuplicate 
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
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(duplicate(arr));
	}

	private static int duplicate(int[] arr)
	{
		int x;
		int n= arr.length;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					x=arr[i];
					return x;
				}
			}
		}
		return -1;
	}
}
