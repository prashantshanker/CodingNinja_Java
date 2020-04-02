import java.util.Scanner;

public class TripletSum 
{
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
		int[] input = takeInput();
		int x = s.nextInt();
		tripletSum(input, x);
	}

	private static void tripletSum(int[] input, int x) 
	{
		 int n=input.length;
			for(int i=0 ;i<(n-2);i++){
	            for(int j = i+1 ;j<(n-1);j++){
	                for(int k = j+1 ;k<n;k++){
	                    if(input[i]+input[j]+input[k]==x)
	                    {
	                        int max = Math.max(input[i], Math.max(input[j], input[k]));
	                        int min = Math.min(input[i], Math.min(input[j], input[k]));
	                        int mid = x - max - min;
	                        System.out.println(min + " " + mid + " " + max);
	                    }
	                }
	            }
	        }
	}
}
