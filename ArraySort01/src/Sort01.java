import java.util.Scanner;

public class Sort01 {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		sortBinaryArray(arr);
		print(arr);
	}

	private static void sortBinaryArray(int[] arr) {
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
}
