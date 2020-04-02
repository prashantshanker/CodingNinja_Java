package ques153;

import java.util.Scanner;

public class ques153 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = getNoOfDigit(n);

		int N = n;

		int sum = armStrongNumberSum(N, x);
		System.out.println(sum);
	    checking(sum,n);

	}
	private static void checking(int sum,int n) 
	{
		if(sum==n) 
		{
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

	private static int armStrongNumberSum(int N, int x) {
		int pow = 1;
		int sum = 0;
		while (N > 0) {
			int X = x;
			int rem = N % 10;

			while (X > 0) {
				pow = rem * pow;
				X--;
			}

			sum = sum + pow;
			pow = 1;
			N = N / 10;
		}
		return sum;
	}

	private static int getNoOfDigit(int n) {
		int div = 1, x = 0;
		while (n > 0) {
			n = n / div;
			div = div * 10;
			x++;
		}
		return x;
	}
}
