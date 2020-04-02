import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int div = 2;
	//	boolean isprime = true;
		while (div <= (n - 1)) {
			if (n % div == 0) {
				// System.out.println("not");
				//isprime = false;
				System.out.println("Composite");
				return;
			}
			div = div + 1;
		}
		System.out.println("Prime");
		
////		if (isprime == true) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Composite");
//		}
//		s.close();
	}

}
