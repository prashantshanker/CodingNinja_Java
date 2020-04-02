import java.util.Scanner;

public class sub {

	public static void main(String a[]) {

		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		Complex c1 = new Complex(real1, imaginary1);
		Complex c2 = new Complex(real2, imaginary2);
		

		int choice = s.nextInt();

		if (choice==1) 
		{
			c1.add(c2);
			c1.print();
		} else if (choice==2) {

			c1.multiply(c2);
			c1.print();
		} else {
			return;
		}
	}
}
