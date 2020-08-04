import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {
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
		ArrayList<Integer> path = new ArrayList<Integer>();
		boolean[] visited = new boolean[V];
		path = dfTraversalHasPath(adjMatrix, start, destination, visited);
		if (path == null) {
			System.out.println();
		} else {
			for (int i = 0; i < path.size(); i++) {
				System.out.print(path.get(i) + " ");
			}
		}
	}

	public static ArrayList<Integer> dfTraversalHasPath(int[][] adjMatrix, int start, int destination,
			boolean[] visited) {
		visited[start] = true;
		if (start == destination) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(start);
			return arr;
		}
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[start][i] == 1 && visited[i] != true) {
				ArrayList<Integer> smalllist = dfTraversalHasPath(adjMatrix, i, destination, visited);
				if (smalllist.size() > 0) {
					smalllist.add(start);
					return smalllist;
				}

			}

		}
		return new ArrayList();
	}
}
