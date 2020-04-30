import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}

	public static boolean isStringPalindrome(String input) {
		int n = input.length();
		if (n == 0) {
			return true;
		}
		return palindromeCheck(input, 0, n - 1);
	}

	private static boolean palindromeCheck(String input, int s, int e) {
		if (s == e) {
			return true;
		}
		if ((input.charAt(s)) != (input.charAt(e))) {
			return false;
		}

		if (s < e + 1) {
			return palindromeCheck(input, s + 1, e - 1);
		}

		return true;

	}
}