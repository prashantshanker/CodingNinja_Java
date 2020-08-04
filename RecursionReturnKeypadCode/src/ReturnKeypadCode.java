import java.util.Scanner;

public class ReturnKeypadCode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public static String[] keypad(int n) {
		if (n == 0) {
			String output[] = { "" };
			return output;
		}
		int smallerInput = n / 10;
		int remainder = n % 10;
		String smallerOutput[] = keypad(smallerInput);
		String text = keypadHelper(remainder);
		String output[] = new String[text.length() * smallerOutput.length];
		int k = 0;
		for (int i = 0; i < smallerOutput.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				output[k] = smallerOutput[i] + text.charAt(j);
				k++;
			}
		}
		return output;
	}

	private static String keypadHelper(int d) {
		if (d == 2) {
			return "abc";
		} else if (d == 3) {
			return "def";
		} else if (d == 4) {
			return "ghi";
		} else if (d == 5) {
			return "jkl";
		} else if (d == 6) {
			return "mno";
		} else if (d == 7) {
			return "pqrs";
		} else if (d == 8) {
			return "tuv";
		} else if (d == 9) {
			return "wxyz";
		} else {
			return " ";
		}
	}

}
