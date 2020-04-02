import java.util.Scanner;
public class Pattern16 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int k = i;
			while (k > 1) {
				System.out.print(" ");
				k--;
			}
			int y = n;
			while (y > 0) {
				System.out.print("*");
				y--;
			}
			System.out.println();
			i++;
		}
	}

}
