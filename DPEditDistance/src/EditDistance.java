import java.util.Scanner;

public class EditDistance {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.println(editDistance(str1, str2));

	}

	public static int editDistance(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		return editDistDP(s1, s2, m, n);
	}

//With DP
	public static int editDistDP(String str1, String str2, int m, int n) {
		int dp[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
				}
			}
		}

		return dp[m][n];
	}

	// With Recursion
//	public static int editDistRecursion(String str1, String str2, int m, int n) {
//		if (m == 0) {
//			return n;
//		}
//		if (n == 0) {
//			return m;
//		}
//		if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
//			return editDistRecursion(str1, str2, m - 1, n - 1);
//		}
//
//		return 1 + Math.min(editDistRecursion(str1, str2, m, n - 1),
//				Math.min(editDistRecursion(str1, str2, m - 1, n), editDistRecursion(str1, str2, m - 1, n - 1)));
//	}

}
