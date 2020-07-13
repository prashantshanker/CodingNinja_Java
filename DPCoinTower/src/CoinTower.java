import java.util.Scanner;

public class CoinTower {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int x, n, y;
		n = scan.nextInt();
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println(solve(n, x, y));
	}

	public static String solve(int n, int x, int y) {
		String[] dp = new String[n + 1];
		dp[0] = "Whis";
		dp[1] = "Beerus";
		for (int i = 2; i <= n; i++) {
			if (i - 1 >= 0 && dp[i - 1] == "Whis") {
				dp[i] = "Beerus";
			} else if (i - x >= 0 && dp[i - x] == "Whis") {
				dp[i] = "Beerus";
			} else if (i - y >= 0 && dp[i - y] == "Whis") {
				dp[i] = "Beerus";
			} else {
				dp[i] = "Whis";
			}
		}
		return dp[n];
	}
}
