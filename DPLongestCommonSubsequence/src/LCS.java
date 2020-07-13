import java.util.Scanner;

public class LCS {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.println(lcs(str1, str2));
	}
	// With Recursion
//	public static int lcs(String s1, String s2) {
//		if (s1.isEmpty() || s2.isEmpty()) {
//			return 0;
//		}
//		if (s1.charAt(0) == s2.charAt(0)) {
//			return 1 + lcs(s1.substring(1), s2.substring(1));
//		} else {
//			return Math.max(lcs(s1.substring(1), s2.substring(0)), lcs(s1.substring(0), s2.substring(1)));
//		}
//	}

	// With Memoization
//	private static int lcs(String str1, String str2) {
//		int n = str1.length();
//		int m = str2.length();
//		int[][] dp = new int[n + 1][m + 1];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		return lcsDP(str1, str2, 0, 0, dp);
//	}
//
//	private static int lcsDP(String str1, String str2, int i, int j, int[][] dp) {
//		if (i == str1.length() || j == str2.length()) {
//			return 0;
//		}
//		int lcs;
//		if (str1.charAt(i) == str2.charAt(j)) {
//			int smallAns;
//			if (dp[i + 1][j + 1] == -1) {
//				smallAns = lcsDP(str1, str2, i + 1, j + 1, dp);
//				dp[i + 1][j + 1] = smallAns;
//			} else {
//				smallAns = dp[i + 1][j + 1];
//			}
//			lcs = 1 + smallAns;
//		} else {
//			int ans1, ans2;
//			if (dp[i + 1][j] == -1) {
//				ans1 = lcsDP(str1, str2, i + 1, j, dp);
//			} else {
//				ans1 = dp[i + 1][j];
//			}
//			if (dp[i][j + 1] == -1) {
//				ans2 = lcsDP(str1, str2, i, j + 1, dp);
//			} else {
//				ans2 = dp[i][j + 1];
//			}
//			lcs = Math.max(ans1, ans2);
//		}
//		return lcs;
//	}

	// With Iteration
	public static int lcs(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = 1 + dp[i + 1][j + 1];
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		return dp[0][0];
	}
}
