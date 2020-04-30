import java.util.Scanner;

public class RotationCount {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] agrs) {
		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		getArray(arr, arraySize);
		printArray(arr);
		System.out.println(countRotation(arr, arraySize));
	}

	private static int countRotation(int[] arr, int arraySize) {
		int start = 0, end = arraySize - 1, mid;
		while (start <= end) {
			if (arr[start] == arr[end]) {
				return end;
			}
			mid = (start + end) / 2;
			if (arr[mid] < arr[mid + 1]) {
				end = end - 1;
			} else if (arr[mid] > arr[mid + 1]) {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void getArray(int[] arr, int arraySize) {
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
	}
}
