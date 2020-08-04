import java.util.Scanner;

public class LargestPiece {
	public static String[] cake = new String[55];

	public static void main(String[] args) {
		int n, m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			cake[i] = scan.nextLine();
		}
		System.out.println(solve(n, cake));
	}

	public static int solve(int n, String cake[]) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = cake[i].charAt(j) - '0';
			}
		}
		int maximum = 0;
		boolean[][] visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					visited[i][j] = true;
					int current_maximum = count_ones(arr, n, i, j, visited);
					if (current_maximum > maximum) {
						maximum = current_maximum;
					}
					for (int p = 0; p < n; p++) {
						for (int q = 0; q < n; q++) {
							visited[p][q] = false;
						}
					}
				}
			}
		}
		return maximum;
	}

	public static int count_ones(int[][] arr, int n, int i, int j, boolean[][] visited) {
		int count = 1;
		if (i > 0 && !visited[i - 1][j] && arr[i - 1][j] == 1) // up
		{
			visited[i - 1][j] = true;
			count += count_ones(arr, n, i - 1, j, visited);
		}
		if (j > 0 && !visited[i][j - 1] && arr[i][j - 1] == 1) // left
		{
			visited[i][j - 1] = true;
			count += count_ones(arr, n, i, j - 1, visited);
		}
		if (i < n - 1 && !visited[i + 1][j] && arr[i + 1][j] == 1) // down
		{
			visited[i + 1][j] = true;
			count += count_ones(arr, n, i + 1, j, visited);
		}
		if (j < n - 1 && !visited[i][j + 1] && arr[i][j + 1] == 1) // right
		{
			visited[i][j + 1] = true;
			count += count_ones(arr, n, i, j + 1, visited);
		}
		return count;
	}

}
