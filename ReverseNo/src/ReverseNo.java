import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int x = getNoOfDigit(n);

			int N = n;
			int sum = reverse(N, x);
			if(N>0 && N<100) 
			{
				sum=sum/10;
				System.out.println(sum);
			}else 
			{
				System.out.println(sum);
			}
			
		    

		}
	

		private static int reverse(int N, int x) {
			int pow = 1;
			int sum = 0;
			int multi=1;
			
			while (N > 0) {
				int X = x;
				int rem = N % 10;

				while (X > 1) {
					pow = 10 * pow;
					
					X--;
					
				}
				multi=rem*pow;
				sum = sum + multi;
				pow = 1;
				N = N / 10;
				x--;
			}
			return sum;
		}

		private static int getNoOfDigit(int n) {
			int div = 10, x = 1;
			
			while (n > 0) {
				n = n / div;
				if(n<0)
				{
					return x;
					
				}
				else{
					x++;
				}
				div = div * 10;
				
				}
			return x;
		}

	}

