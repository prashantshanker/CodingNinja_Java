import java.util.Arrays;
import java.util.Scanner;

public class KruskalAlgo {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int V = s.nextInt();
		int E = s.nextInt();
		Edge graph[] = new Edge[E];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			Edge e = new Edge(v1, v2, weight);
			graph[i] = e;
		}
		Edge mst[] = ekruskalAlgo(graph, V);
		for (int i = 0; i < mst.length; i++) {
			if (mst[i].v1 < mst[i].v2) {
				System.out.println(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].weight);
			} else {
				System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);
			}
		}
	}

	public static Edge[] ekruskalAlgo(Edge[] graph, int n) {
		Arrays.sort(graph);
		Edge mst[] = new Edge[n - 1];
		int parent[] = new int[n];
		for (int j = 0; j < n; j++) {
			parent[j] = j;
		}
		int count = 0;
		int i = 0;
		while (count != n - 1) {
			Edge currentEdge = graph[i++];
			int v1Parent = findParent(currentEdge.v1, parent);
			int v2Parent = findParent(currentEdge.v2, parent);
			if (v1Parent != v2Parent) {
				mst[count] = currentEdge;
				count++;
				parent[v1Parent] = v2Parent;
			}
		}
		return mst;
	}

	public static int findParent(int v1, int[] parent) {
		if (v1 == parent[v1]) {
			return v1;
		}
		return findParent(parent[v1], parent);
	}
}

class Edge implements Comparable<Edge> {
	int v1;
	int v2;
	int weight;

	Edge(int v1, int v2, int weight) {
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
}
