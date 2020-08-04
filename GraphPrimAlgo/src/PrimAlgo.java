import java.util.Scanner;

public class PrimAlgo {
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
		primsAlgo(graph);
	}

	public static void primsAlgo(int[][] graph) {
		int n = graph.length;
		boolean visited[] = new boolean[n];
		int parent[] = new int[n];
		int weight[] = new int[n];
		parent[0] = -1;
		weight[0] = 0;
		for (int i = 1; i < n; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < n; i++) {
			int minVertex = findMin(visited, weight);
			visited[minVertex] = true;
			for (int j = 0; j < n; j++) {
				if (graph[minVertex][j] != 0 && !visited[j]) {
					if (weight[j] > graph[minVertex][j]) {
						weight[j] = graph[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
		}
		for (int i = 1; i < n; i++) {
			if (i < parent[i]) {
				System.out.println(i + " " + parent[i] + " " + weight[i]);
			} else {
				System.out.println(parent[i] + " " + i + " " + weight[i]);
			}
		}

	}

	public static int findMin(boolean[] visited, int[] weight) {
		int minVertex = -1;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}
}
