import java.util.Scanner;

public class LeaderOfArray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		leaders(input);
	}

	public static void leaders(int[] input) {
		int i;
		int j;

		for (i = 0; i < input.length - 1; i++) {
			for (j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					break;
				}
			}
			if (j == input.length) {
				System.out.print(input[i] + " ");
			}
		}
		System.out.print(input[input.length - 1]);
	}

}
