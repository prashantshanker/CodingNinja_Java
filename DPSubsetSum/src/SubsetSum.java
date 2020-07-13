import java.util.Scanner;

public class SubsetSum {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int num = s.nextInt();
		boolean isTrue = isSubsetSum(arr, n, num);
		if (isTrue == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isSubsetSum(int arr[], int n, int sum) {
		boolean subset[][] = new boolean[sum + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			subset[0][i] = true;
		}
		for (int i = 1; i <= sum; i++) {
			subset[i][0] = false;
		}
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= arr[j - 1]) {
					subset[i][j] = subset[i][j] || subset[i - arr[j - 1]][j - 1];
				}
			}
		}
		return subset[sum][n];
	}
}
