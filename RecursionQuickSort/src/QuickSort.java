import java.util.Scanner;

public class QuickSort {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void quickSort(int[] input) {

		if (input.length == 0 || input.length == 1) {
			return;
		}
		quickSort(input, 0, input.length - 1);
	}

	public static void quickSort(int[] input, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivotElement = partition(input, start, end);
		quickSort(input, start, pivotElement - 1);
		quickSort(input, pivotElement + 1, end);

	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}
}
