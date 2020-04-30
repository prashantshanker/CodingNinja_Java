import java.util.Scanner;

public class Rotation {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		getArray(arraySize, arr);
		printArray(arr);
		int x = s.nextInt();
		int noOfRotation;
		if (x > arraySize) {
			noOfRotation = x % arraySize;
		} else {
			noOfRotation = x;
		}
		System.out.println("Enter the Choice 1 for Left & 2 for Right:");
		int choice = s.nextInt();
		if (choice == 1) {
			RotateArray(arr, noOfRotation, arraySize);
		} else if (choice == 2) {
			RotateArrayR(arr, noOfRotation, arraySize);
		} else {
			return;
		}
		printArray(arr);
	}

	private static void RotateArrayR(int[] arr, int noOfRotation, int arraySize) {
		for (int i = 0; i < noOfRotation; i++) {
			rightRotateByone(arr, arraySize);
		}
	}

	private static void rightRotateByone(int[] arr, int arraySize) {
		int temp;
		for (int i = arraySize - 1; i > 0; i--) {
			temp = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = temp;
		}
	}

	private static void RotateArray(int[] arr, int noOfRotation, int arraySize) {
		for (int i = 0; i < noOfRotation; i++) {
			leftRotateByOne(arr, arraySize);
		}

	}

	private static void leftRotateByOne(int[] arr, int arraySize) {
		int temp;
		for (int i = 0; i < arraySize - 1; i++) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void getArray(int arraySize, int[] arr) {
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
	}

}
