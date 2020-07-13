import java.util.Arrays;
import java.util.Scanner;

public class DpWaysToMakeCoinChange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numDenominations = s.nextInt();
		int denominations[] = new int[numDenominations];
		for (int i = 0; i < numDenominations; i++) {
			denominations[i] = s.nextInt();
		}

		int value = s.nextInt();

		System.out.println(countWaysToMakeChange(denominations, value));

	}

	public static int countWaysToMakeChange(int denominations[], int value) {
		int m = denominations.length;
		return countWays(denominations, m, value);

	}
//with Recursion
	private static int count(int[] denominations, int m, int value) {
		if (value == 0) {
			return 1;
		}

		if (value < 0) {
			return 0;
		}
		if (m <= 0 && value >= 1) {
			return 0;
		}
		return count(denominations, m - 1, value) + count(denominations, m, value - denominations[m - 1]);
	}
//With Iteration
	public static int countWays(int S[], int m, int n) {
		int[] table = new int[n + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				table[j] += table[j - S[i]];
			}
		}
		return table[n];
	}

}
