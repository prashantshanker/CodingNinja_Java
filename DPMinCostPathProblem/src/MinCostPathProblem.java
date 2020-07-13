import java.util.Scanner;

public class MinCostPathProblem {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int m = s.nextInt();
		int n = s.nextInt();
		int input[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				input[i][j] = s.nextInt();
			}
		}
		System.out.println(minCostPath(input));
	}
	// With Recursion
//	public static int minCostPath(int input[][]) {
//		return minCost(input, 0, 0);
//	}
//
//	private static int minCost(int[][] input, int i, int j) {
//		int n = input.length;
//		int m = input[0].length;
//		if (i >= n || j >= m) {
//			return Integer.MAX_VALUE;
//		}
//		if (i == n - 1 && j == m - 1) {
//			return input[i][j];
//		}
//		int ans1 = minCost(input, i + 1, j);
//		int ans2 = minCost(input, i, j + 1);
//		int ans3 = minCost(input, i + 1, j + 1);
//		int minCost = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
//		return minCost;
//	}

	// With Memoization
//	private static int minCostPath(int[][] input) {
//		int[][] dp = new int[input.length + 1][input[0].length + 1];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j] = Integer.MIN_VALUE;
//			}
//		}
//		return minCostMemo(input, 0, 0, dp);
//	}
//
//	private static int minCostMemo(int[][] input, int i, int j, int[][] dp) {
//		int n = input.length;
//		int m = input[0].length;
//		if (i >= n || j >= m) {
//			return Integer.MAX_VALUE;
//		}
//		if (i == n - 1 && j == m - 1) {
//			return input[i][j];
//		}
//		int ans1, ans2, ans3;
//		if (dp[i + 1][j] == Integer.MIN_VALUE) {
//			ans1 = minCostMemo(input, i + 1, j, dp);
//			dp[i + 1][j] = ans1;
//		} else {
//			ans1 = dp[i + 1][j];
//		}
//		if (dp[i][j + 1] == Integer.MIN_VALUE) {
//			ans2 = minCostMemo(input, i, j + 1, dp);
//			dp[i][j + 1] = ans2;
//		} else {
//			ans2 = dp[i][j + 1];
//		}
//		if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
//			ans3 = minCostMemo(input, i + 1, j + 1, dp);
//			dp[i + 1][j + 1] = ans3;
//		} else {
//			ans3 = dp[i + 1][j + 1];
//		}
//		int minCost = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
//		return minCost;
//	}

	// With Iterative

	private static int minCostPath(int[][] input) {
		int n = input.length;
		int m = input[0].length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (i == n - 1 && j == m - 1) {
					dp[i][j] = input[i][j];
					continue;
				}
				int ans1 = dp[i][j + 1];
				int ans2 = dp[i + 1][j];
				int ans3 = dp[i + 1][j + 1];
				dp[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}

}
