import java.util.Scanner;

public class Palindrome {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(checkPalindrome(str));
	}

	public static boolean checkPalindrome(String str) {
		int n = str.length();
		int start = 0;
		int end = n - 1;
		while (start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
