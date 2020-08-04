import java.util.Scanner;

public class ThreeCycle {
	public static int[] u = new int[5005];
	public static int[] v = new int[5005];

	public static void main(String[] args) {
		int n, m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			u[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			v[i] = scan.nextInt();
		}
		System.out.println(solve(n, m, u, v));
	}

	public static int solve(int n, int m, int U[], int V[]) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < m; i++) {
			arr[u[i] - 1][v[i] - 1] = 1;
			arr[v[i] - 1][u[i] - 1] = 1;
		}
		return count_cycles(arr, n) / 6;
	}

	public static int count_cycles(int[][] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && arr[i][j] == 1) {
					for (int k = 0; k < n; k++) {
						if (j != k && k != i && arr[j][k] == 1) {
							if (arr[i][k] == 1) {
								count += 1;
							}
						}
					}
				}
			}
		}
		return count;
	}
}
