import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {
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
		int startindex = s.nextInt();
		int endindex = s.nextInt();

		boolean[] visited = new boolean[V];

		ArrayList<Integer> path = getpathbfs(adjMatrix, startindex, endindex, visited);
		if (path == null) {
			System.out.println();
		} else {
			for (int i = 0; i < path.size(); i++) {
				System.out.print(path.get(i) + " ");
			}
		}
	}

	public static ArrayList<Integer> getpathbfs(int[][] adjMatrix, int startindex, int endindex, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		queue.add(startindex);
		visited[startindex] = true;
		int flag = 0;
		while (!queue.isEmpty()) {
			int front = queue.poll();
			for (int i = 0; i < adjMatrix.length; i++) {
				if (adjMatrix[front][i] == 1 && visited[i] != true) {
					queue.add(i);
					visited[i] = true;
					map.put(i, front);
					if (i == endindex) {
						flag = 1;
						break;
					}
				}
			}
		}
		if (flag == 0) {
			return null;
		}
		ArrayList<Integer> path = new ArrayList<>();
		path.add(endindex);
		int x = endindex;
		while (x != startindex) {
			path.add(map.get(x));
			x = map.get(x);
		}

		return path;

	}
}
