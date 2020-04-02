import java.util.Scanner;

public class Pattern15 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = 2*m+1;
		int x = n / 2;
		int z = n - x;
		int i = 1;

		if(m==0) {
			System.out.println("*");
		}
		
		while (i <= z) {
			
			System.out.print("*");

			int j = 1;
			while (j <= i-1) {
				System.out.print(j);
				j++;
			}
			int dec = i - 2;
			while (dec > 0) {
				System.out.print(dec);
				dec--;
			}
			if(i!=1) 
			{
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		
		int l = 1;

		while (l <= x) {
			System.out.print("*");
			int y = x - l +1;
			int p=1;
			while (y > 1) {
				System.out.print(p);
				y--;
				p++;
			}

			int dec = x - l-1;
			while (dec > 0) {
				System.out.print(dec);
				dec--;
			}
			if(l!=x) {
			System.out.print("*");
			}
			System.out.println();
			l++;
		}
		

	}
}
