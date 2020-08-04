import java.util.Scanner;

public class DijkstraAlgo {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int V = s.nextInt();
		int E = s.nextInt();
		int graph[][] = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			graph[v1][v2] = weight;
			graph[v2][v1] = weight;
		}
		dijstraAlgo(graph);
	}

	public static void dijstraAlgo(int[][] graph) {
		int n = graph.length;
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for (int i = 1; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < n - 1; i++) {
			int minVertex = findMin(visited, distance);
			visited[minVertex] = true;
			for (int j = 0; j < n; j++) {
				if (graph[minVertex][j] > 0 && !visited[j] && graph[minVertex][j] < Integer.MAX_VALUE) {
					int newDistance = distance[minVertex] + graph[minVertex][j];
					if (newDistance < distance[j]) {
						distance[j] = newDistance;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + distance[i]);
		}
	}

	public static int findMin(boolean[] visited, int[] distance) {
		int minVertex = -1;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}

}
