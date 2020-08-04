import java.util.Scanner;

public class Islands {
	public static int[] u = new int[5005];
	public static int[] v = new int[5005];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n, m;
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
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0; i < m; ++i) {
			arr[u[i] - 1][v[i] - 1] = 1;
			arr[v[i] - 1][u[i] - 1] = 1;
		}
		boolean[] visited = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (visited[i] == false) {
				count++;
				DFS(arr, visited, n, i);
			}
		}

		return count;
	}

	public static void DFS(int[][] arr, boolean[] visited, int n, int sv) {

		visited[sv] = true;

		for (int i = 0; i < n; ++i) {
			if (i == sv) {
				continue;
			}
			if (arr[sv][i] == 1 && visited[i] == false) {
				DFS(arr, visited, n, i);
			}
		}

		return;
	}
}
