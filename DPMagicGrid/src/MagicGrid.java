import java.util.Scanner;

public class MagicGrid {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int testCase = s.nextInt();
		for (int i = 0; i < testCase; i++) {
			int rows = s.nextInt();
			int cols = s.nextInt();
			int[][] magicGrid = new int[rows][cols];
			for (int j = 0; j < rows; j++) {
				for (int k = 0; k < cols; k++) {
					magicGrid[j][k] = s.nextInt();
				}
			}
			System.out.println(minEnergy(magicGrid));
		}
	}

	private static int minEnergy(int[][] input) {

		int m = input.length;
		int n = input[0].length;
		int[][] dp = new int[m + 1][n + 1];
		dp[m - 1][n - 1] = input[m - 1][n - 1] > 0 ? 1 : Math.abs(input[m - 1][n - 1]) + 1;
		for (int i = m - 2; i >= 0; i--) {
			dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - input[i][n - 1], 1);
		}
		for (int j = n - 2; j >= 0; j--) {
			dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - input[m - 1][j], 1);
		}
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				int ans = Math.min(dp[i + 1][j], dp[i][j + 1]);
				dp[i][j] = Math.max(ans - input[i][j], 1);
			}
		}
		return dp[0][0];
	}
}
