import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("2");

		for (int i = 3; i <= n; i++) {
			validateAndPrintprime(i);
		}
	}

	private static void validateAndPrintprime(int i) {
		int div = 2;
		while (div <= (i - 1)) {
			if (i % div == 0) {
				return;
			}
			div = div + 1;
		}
		System.out.println(i);

	}

}
