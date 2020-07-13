import java.util.Scanner;

public class LootHouses {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(getMaxMoney(arr, n));
	}

	public static int getMaxMoney(int arr[], int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return arr[0];
		}
		if (n == 2) {
			return Math.max(arr[0], arr[1]);
		}
		int dp[] = new int[n];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[n - 1];
	}
}
