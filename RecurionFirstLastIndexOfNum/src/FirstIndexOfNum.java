import java.util.Scanner;

public class FirstIndexOfNum {
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
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
		System.out.println(lastIndex(input, x));
	}

	public static int firstIndex(int input[], int x) {
		if (input.length == 0) {
			return -1;
		}
		if (input[0] == x) {
			return 0;
		}
		int smallArray[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallArray[i - 1] = input[i];

		}
		int fi = firstIndex(smallArray, x);
		if (fi == -1) {
			return -1;
		} else {
			return fi + 1;
		}
	}
	public static int lastIndex(int input[], int x) 
	{
		if (input.length == 0) {
			return -1;
		}
		if (input[input.length-1] == x) {
			return input.length;
		}
		int smallArray[] = new int[input.length - 1];
		for (int i = 0; i < input.length-1; i++) {
			smallArray[i] = input[i];

		}
		int fi = lastIndex(smallArray, x);
		if (fi == -1) {
			return -1;
		} else {
			return fi;
		}
	}
}
