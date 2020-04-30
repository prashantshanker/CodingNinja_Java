import java.util.Scanner;

public class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}

	public static void merge(int[] s1, int[] s2, int[] s3) {
		int i = 0, j = 0, k = 0;
		while (i < s1.length && j < s2.length) {
			if (s1[i] <= s2[j]) {
				s3[k] = s1[i];
				i++;
				k++;
			} else {
				s3[k] = s2[j];
				k++;
				j++;	
			}
		}
		if (i < s1.length) {
			while (i < s1.length) {
				s3[k] = s1[i];
				i++;
				k++;
			}
		}
		if (j < s2.length) {
			while (j < s2.length) {
				s3[k] = s2[j];
				k++;
				j++;
			}
		}
	}

	public static void mergeSort(int[] input) {
		if (input.length <= 1) {
			return;
		}
		int leftArray[] = new int[input.length / 2];
		int rightArray[] = new int[input.length - leftArray.length];
		for (int i = 0; i < (input.length/2); i++) {
			leftArray[i] = input[i];
		}
		for (int i = (input.length/2); i < input.length; i++) {
			rightArray[i - input.length/2] = input[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, input);
	}
}
