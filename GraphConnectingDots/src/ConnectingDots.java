import java.util.Scanner;

public class ConnectingDots {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int N, M, i;
		N = scan.nextInt();
		M = scan.nextInt();
		String[] board = new String[N];
		for (i = 0; i < N; i++) {

			board[i] = scan.next();

		}
		System.out.println(solve(board, N, M));
	}

	public static int solve(String[] board, int n, int m) {
		int[][] visited = new int[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (checker(board, n, m, i, j, visited, board[i].charAt(j))) {
					return 1;
				}
				for (int p = 0; p < n; p++) {
					for (int q = 0; q < m; q++) {
						visited[p][q] = 0;
					}
				}
			}
		}
		return 0;
	}

	public static boolean checker(String arr[], int n, int m, int i, int j, int[][] visited, char current_character) {
		int condition_up = 0;
		if (i - 1 > 0) {
			condition_up = visited[i - 1][j];
		}
		int condition_down = 0;
		if (i + 1 < n - 1) {
			condition_down = visited[i + 1][j];
		}
		int condition_right = 0;
		if (j < m + 1) {
			condition_right = visited[i][j + 1];
		}
		int condition_left = 0;
		if (j > 0) {
			condition_left = visited[i][j - 1];
		}
		int sum = condition_up + condition_down + condition_right + condition_left;
		if (sum == 2) {
			return true;
		}
		boolean check = false;
		if (i > 0 && arr[i - 1].charAt(j) == current_character && visited[i - 1][j] == 0) {
			visited[i - 1][j] = 1;
			if (checker(arr, n, m, i - 1, j, visited, current_character)) {
				check = true;
			} else {
				visited[i - 1][j] = 0;
			}
		}

		if (j > 0 && arr[i].charAt(j) == current_character && visited[i][j - 1] == 0) {
			visited[i][j - 1] = 1;
			if (checker(arr, n, m, i, j - 1, visited, current_character)) {
				check = true;
			} else {
				visited[i][j - 1] = 0;
			}
		}

		if (i < n - 1 && arr[i + 1].charAt(j) == current_character && visited[i + 1][j] == 0) {
			visited[i + 1][j] = 1;
			if (checker(arr, n, m, i + 1, j, visited, current_character)) {
				check = true;
			} else {
				visited[i + 1][j] = 0;
			}
		}

		if (j < m - 1 && arr[i].charAt(j) == current_character && visited[i][j + 1] == 0) {
			visited[i][j + 1] = 1;
			if (checker(arr, n, m, i, j + 1, visited, current_character)) {
				check = true;
			} else {
				visited[i][j + 1] = 0;
			}
		}
		return check;
	}
}
