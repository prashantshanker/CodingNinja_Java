import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KSmallestELement {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> output = kSmallest(input, k);
		for (int i : output) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> kSmallest(int[] input, int k) {
		MaxPQComparator maxPQComparator = new MaxPQComparator();
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(maxPQComparator);
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			pQueue.add(input[i]);
		}
		while (pQueue.size() != k) {
			pQueue.remove();
		}
		while (!pQueue.isEmpty()) {
			output.add(pQueue.remove());
		}
		return output;
	}
}

class MaxPQComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 0;
		}
	}
}