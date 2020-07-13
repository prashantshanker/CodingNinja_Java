import java.util.Scanner;

public class ByteLandian {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		long n = s.nextLong();
		System.out.println(bytelandian(n));
	}

	static long v = 1000001;
	static long a[] = new long[(int) v];

	public static long bytelandian(long n) {
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		for (int i = 4; i < v; i++) {
			long k = a[i / 2] + a[i / 3] + a[i / 4];
			a[i] = k > i ? k : i;
		}
		long x = calc(n);
		return x;
	}

	public static long calc(long l) {
		if (l < v) {
			// System.out.println( a[(int)l]);
			return a[(int) l];
		} else {
			long z = calc(l / 2) + calc(l / 3) + calc(l / 4);
			z = z > l ? z : l;
			return z;
		}
	}
}
