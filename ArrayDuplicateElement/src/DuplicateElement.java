import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(duplicate(arr));
	}

	public static int duplicate(int[] arr) {

		Arrays.sort(arr);
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = arr[i] ^ arr[i + 1];
			if (res == 0) {
				return arr[i];
			}
		}
		return -1;
	}
}
