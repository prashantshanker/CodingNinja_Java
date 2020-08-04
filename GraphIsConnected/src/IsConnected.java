import java.util.Scanner;

public class IsConnected {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int V = s.nextInt();
		int E = s.nextInt();

		int[][] adjMatrix = new int[V][V];

		for (int i = 0; i < E; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			adjMatrix[a][b] = 1;
			adjMatrix[b][a] = 1;

		}

		boolean[] visited = new boolean[V];
		dfs(adjMatrix, V, 0, visited);
		boolean ans = true;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				ans = false;
				break;

			}
		}
		System.out.print(ans);

	}

	public static void dfs(int[][] adjMatrix, int n, int start, boolean[] visited) {

		visited[start] = true;
		for (int i = 0; i < n; i++) {
			if (i == start) {
				continue;
			}
			if (adjMatrix[start][i] == 1) {
				if (visited[i] != true) {
					dfs(adjMatrix, n, i, visited);

				}
			}
		}

	}

}
