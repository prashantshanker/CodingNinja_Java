import java.util.Scanner;

public class RotationTimeComplex {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int index = s.nextInt();
		rotate(arr, index);
		print(arr);
	}

	public static void rotate(int[] arr, int d) {
				int arraySize=arr.length;
		for (int i = 0; i < d; i++) {
			leftRotateByone(arr, arraySize);
		}
	}

	private static void leftRotateByone(int[] arr, int arraySize) {
		
		int temp;
		for (int i = 0; i < arraySize - 1; i++) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

}
