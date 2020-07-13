import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueKthlargestElement {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(kthLargest(arr, k));
	}

	public static int kthLargest(int arr[], int k) {
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pQ.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (pQ.element() < arr[i]) {
				pQ.remove();
				pQ.add(arr[i]);
			}
		}
		return pQ.element();
	}
}
