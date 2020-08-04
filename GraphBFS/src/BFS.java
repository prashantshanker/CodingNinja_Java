import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
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
		boolean visitedArray[] = new boolean[adjMatrix.length];
		for (int i = 0; i < adjMatrix.length; i++) {
			if (visitedArray[i] == false) {
				bfsTraversal(adjMatrix, visitedArray, i);
			}
		}
	}

	public static void bfsTraversal(int[][] adjMatrix, boolean[] visitedArray, int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		visitedArray[i] = true;
		while (!queue.isEmpty()) {
			int front = queue.poll();
			System.out.print(front + " ");
			for (int j = 0; j < adjMatrix.length; j++) {
				if (adjMatrix[front][j] == 1 && visitedArray[j] == false) {
					queue.add(j);
					visitedArray[j] = true;
				}
			}
		}
	}
}
