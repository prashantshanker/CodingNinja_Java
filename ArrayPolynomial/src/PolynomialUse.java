import java.util.Scanner;
public class PolynomialUse {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Polynomial p1= new Polynomial();
		int coff1=s.nextInt();
		int degree1=s.nextInt();
		p1.setCoefficient(degree1,coff1);
		p1.print();
	}

}
