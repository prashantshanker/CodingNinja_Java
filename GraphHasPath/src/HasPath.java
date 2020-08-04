import java.util.Scanner;

public class HasPath {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int V = s.nextInt();
		int E = s.nextInt();
		int adjMatrix[][] = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		int start = s.nextInt();
		int destination = s.nextInt();
		boolean[] visited = new boolean[V];
		System.out.println(dfTraversalHasPath(adjMatrix, start, destination, visited));
	}

	private static boolean dfTraversalHasPath(int[][] adjMatrix, int start, int destination, boolean[] visited) {
		visited[start] = true;
		boolean isTrue = false;
		if (visited[destination] == true) {
			return true;
		}
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[start][i] == 1 && visited[i] == false) {
				isTrue = isTrue || dfTraversalHasPath(adjMatrix, i, destination, visited);
			}
		}
		return isTrue;
	}
}
