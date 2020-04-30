import java.util.Scanner;

public class EquilibriumIndex {
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
		System.out.print(arrayEquilibrium(arr));
	}
	public static int arrayEquilibrium(int[] arr)
	{
		int n=arr.length;
		int sum = 0;  
        int leftsum = 0;  
          for (int i = 0; i < n; ++i) 
          {
            sum += arr[i]; 
          }
        for (int i = 0; i < n; ++i)
        { 
            sum -= arr[i]; 
  
            if (leftsum == sum) 
            {
                return i; 
            }
            leftsum += arr[i]; 
        }
		return -1;  
	}
}
