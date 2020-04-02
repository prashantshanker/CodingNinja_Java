import java.util.Scanner;

public class RotateArray {
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
		int n = arr.length;
		int arr1[] = new int[n];
		
		if (d > n) {
			int k=0,p;
			int num =d%n;
			p=num;
			while (p< n) {
				arr1[k] = arr[p];
				p++;
				k++;
			}
			int j = 0;
			while (j < num) {
				arr1[k] = arr[j];
				j++;
				k++;
			}
			for (int l = 0; l < n; l++) {
				arr[l] = arr1[l];
			}
		} else {
			int i = d, k = 0;
			while (i < n) {
				arr1[k] = arr[i];
				i++;
				k++;
			}
			int j = 0;
			while (j < d) {
				arr1[k] = arr[j];
				j++;
				k++;
			}
			for (int l = 0; l < n; l++) {
				arr[l] = arr1[l];
			}

		}

	}

}
