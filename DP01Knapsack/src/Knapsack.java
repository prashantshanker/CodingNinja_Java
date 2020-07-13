import java.util.Scanner;

public class Knapsack {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int weight[] = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = s.nextInt();
		}
		int value[] = new int[n];
		for (int i = 0; i < n; i++) {
			value[i] = s.nextInt();
		}
		int maxWeight = s.nextInt();
		System.out.println(knapsack(weight, value, maxWeight, n));
		System.out.println(knapsackIterative(weight, value, maxWeight, n));
	}

// With Recursion
	public static int knapsack(int[] weight, int value[], int maxWeight, int n) {
		if (n == 0 || maxWeight == 0) {
			return 0;
		}
		if (weight[n - 1] > maxWeight) {
			return knapsack(weight, value, maxWeight, n - 1);
		} else {
			return Math.max(value[n - 1] + knapsack(weight, value, maxWeight - weight[n - 1], n - 1),
					knapsack(weight, value, maxWeight, n - 1));
		}
	}

//With Iteration
	public static int knapsackIterative(int[] wt, int[] val, int W, int n) {
		int dp[][] = new int[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {
			for (int w = 0; w <= W; w++) {
				if (i == 0 || w == 0) {
					dp[i][w] = 0;
				} else if (wt[i - 1] <= w) {
					dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
				} else {
					dp[i][w] = dp[i - 1][w];
				}
			}
		}
		return dp[n][W];
	}
}
