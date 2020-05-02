import java.util.Scanner;

public class DoesScontainT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(checkSequence(large, small));
	}

	public static boolean checkSequence(String a, String b) {
		for (int i = 0; i < b.length(); i++) {
			if (a.contains(b.substring(i, i + 1))) {
				int index = findIndex(a, b.charAt(i));
				a = a.substring(index+1);
			} else {
				return false;
			}
		}
		return true;
	}

	private static int findIndex(String a, char c) {
		int index = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == c) {
				return index = i;
			}
		}
		return index;

	}
}
