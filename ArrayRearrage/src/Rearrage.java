import java.util.Scanner;

public class Rearrage {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		getArray(arraySize, arr);
		System.out.println(rearrangearray(arr, arraySize));
	}

	private static int[] rearrangearray(int[] arr, int arraySize) {
		for (int i = 0; i < arraySize-1; i++) {
			if (arr[i] != -1 && arr[i] != i) {
				int x = arr[i];
				while (arr[x] != -1 && arr[x] != x) {
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				arr[x] = x;
				if (arr[i] != i) {
					arr[i] = -1;
				}
			}
		}
		return arr;
	}

	private static void getArray(int arraySize, int[] arr) {
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
	}

}
