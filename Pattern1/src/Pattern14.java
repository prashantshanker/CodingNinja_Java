import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = n / 2;
		int z = n - x;
		int i = 1;

		while (i <= z) {
			int k = (z - i);
			while (k > 0) {
				System.out.print(" ");
				k--;
			}

			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			int dec = i - 1;
			while (dec > 0) {
				System.out.print("*");
				dec--;
			}
			System.out.println();
			i++;
		}
		int l = 1;

		while (l <= x) {
			int k = l;
			while (k > 0) {
				System.out.print(" ");
				k--;
			}
			int y = x - l + 1;
			while (y > 0) {
				System.out.print("*");
				y--;
			}

			int dec = x - l;
			while (dec > 0) {
				System.out.print("*");
				dec--;
			}
			System.out.println();
			l++;
		}

	}

}
