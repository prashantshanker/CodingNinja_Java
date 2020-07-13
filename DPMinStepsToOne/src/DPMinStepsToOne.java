import java.util.Scanner;

public class DPMinStepsToOne {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println(countStepsTo1(n));
	}

	public static int countStepsTo1(int n) {
		if (n == 1 || n == 0) {
			return 0;
		} else if (n == 2 || n == 3) {
			return 1;
		}
		int[] cases = new int[n + 1];
		cases[0] = 0;
		cases[1] = 0;
		cases[2] = 1;
		cases[3] = 1;
		for (int i = 4; i <= n; i++) {
			int ans1 = cases[i - 1];
			int ans2 = Integer.MAX_VALUE;
			if ((i % 2) == 0) {
				ans2 = cases[i / 2];
			}
			int ans3 = Integer.MAX_VALUE;
			if ((i % 3) == 0) {
				ans3 = cases[i / 3];
			}
			cases[i] = Math.min(ans1, Math.min(ans2, ans3)) + 1;
		}
		return cases[n];
	}
}
