import java.util.Scanner;

public class PairSum {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		pairSum(arr, num);
	}
	public static void pairSum(int[] arr, int num){

		int n=arr.length;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]+arr[j])==num)
				{
					if(arr[i]>arr[j]) 
					{
					System.out.println(arr[j]+" "+arr[i]);
					}else 
					{
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
			}
		

	}
}
}
