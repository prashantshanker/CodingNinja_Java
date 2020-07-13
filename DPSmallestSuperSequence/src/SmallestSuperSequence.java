import java.util.Scanner;

public class SmallestSuperSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		int min_len = smallestSuperSequence(str1, str2);
		System.out.print(min_len);
	}

	public static int smallestSuperSequence(String str1, String str2) {
		int lcs = lcs(str1, str2);
		int string1Len = str1.length();
		int string2Len = str2.length();
		return (string1Len + string2Len - lcs);
	}

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
