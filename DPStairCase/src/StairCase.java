import java.util.Scanner;

public class StairCase {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println(staircase(n));
	}

	public static long staircase(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		long[] cases = new long[n + 1];
		cases[0] = 1;
		cases[1] = 1;
		cases[2] = 2;

		for (int i = 3; i <= n; i++) {
			cases[i] = cases[i - 1] + cases[i - 2] + cases[i - 3];
		}
		return cases[n];
	}
}
