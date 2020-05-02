import java.util.Scanner;

public class MaximumProfit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
	}
	public static int maximumProfit(int budget[]) {
		mergesort(budget);
	    int cost[] =new int[budget.length];
	    for(int i=0;i<budget.length;i++) 
	    {
	    	cost[i]=budget[i]*(budget.length-i);
	    }
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<budget.length;i++) 
	    {
	    	if(cost[i]>max) 
	    	{
	    		max=cost[i];
	    	}
	    }
	    return max;
	}
	static void mergesort(int arr[]) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}


}
