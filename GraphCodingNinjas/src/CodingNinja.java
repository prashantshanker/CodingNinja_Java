import java.util.Scanner;

public class CodingNinja {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int N, M, i;
		N = scan.nextInt();
		M = scan.nextInt();
		String[] Graph = new String[N];
		for (i = 0; i < N; i++) {
			Graph[i] = scan.next();
		}
		System.out.println(solve(Graph, N, M));
	}

	public static int solve(String[] Graph, int N, int M) {
		boolean[][] visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (Graph[i].charAt(j) == 'C') {
					if (checker(Graph, N, M, i, j, "ODINGNINJA", visited)) {
						return 1;
					}
					for (int p = 0; p < N; p++) {
						for (int q = 0; q < M; q++) {
							visited[p][q] = false;
						}
					}
				}
			}
		}
		return 0;
	}

	public static boolean checker(String[] arr, int n, int m, int i, int j, String s, boolean[][] visited) {
		if (s.length() == 0) {
			return true;
		}
		if (i < 0 || j < 0 || i >= n || j >= m) {
			return false;
		}
		int row_array[] = { i - 1, i, i + 1 };
		int col_array[] = { j - 1, j, j + 1 };
		for (int p = 0; p < 3; p++) {
			for (int q = 0; q < 3; q++) {
				if (row_array[p] == i && col_array[q] == j) {
					continue;
				}

				int row = row_array[p];
				int col = col_array[q];
				if (row < 0 || col < 0 || row >= n || col >= m) {
					continue;
				}
				if (arr[row].charAt(col) == s.charAt(0) && !visited[row][col]) {
					visited[row][col] = true;
					boolean checked = checker(arr, n, m, row, col, s.substring(1), visited);
					if (checked) {
						return checked;
					} else {
						visited[row][col] = false;
					}
				}
			}
		}
		return false;
	}
}
