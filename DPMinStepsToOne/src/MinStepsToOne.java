import java.util.Scanner;

public class MinStepsToOne {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countStepsTo1(n));
	}

	public static int countStepsTo1(int n) {
		int arr[] = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = -1;
		}
		return getMinSteps(n, arr);
	}

	private static int getMinSteps(int n, int[] temp) {
		if (n == 1) {
			return 0;
		}
		if (temp[n] != -1) {
			return temp[n];
		}
		int res = getMinSteps(n - 1, temp);

		if (n % 2 == 0) {
			res = Math.min(res, getMinSteps(n / 2, temp));
		}
		if (n % 3 == 0) {
			res = Math.min(res, getMinSteps(n / 3, temp));
		}
		temp[n] = 1 + res;
		return temp[n];
	}
}
