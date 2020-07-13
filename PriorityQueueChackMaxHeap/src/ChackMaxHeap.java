import java.util.Scanner;

public class ChackMaxHeap {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(checkMaxHeap(arr));
	}

	public static boolean checkMaxHeap(int arr[]) {
		for (int parentIndex = 0; parentIndex < arr.length / 2; parentIndex++) {
			int leftChild = 2 * parentIndex + 1;
			int rightChild = 2 * parentIndex + 2;
			if (leftChild < arr.length) {
				if (arr[parentIndex] < arr[leftChild]) {
					return false;
				}
				if (rightChild < arr.length && arr[parentIndex] < arr[rightChild]) {
					return false;
				}
			}
		}
		return true;
	}
}
