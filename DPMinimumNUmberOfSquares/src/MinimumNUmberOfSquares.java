import java.util.Scanner;

public class MinimumNUmberOfSquares {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		System.out.println(minCount(n));
		System.out.println(minCountIterative(n));
	}
//  Following code is using Recursion
//	public static int minCount(int n) {
//		if (n == 0) {
//			return 0;
//		}
//		int minAns=Integer.MAX_VALUE;
//		for (int i = 1; i * i <= n; i++) {
//			int minSq = minCount(n - i * i);
//			if(minAns>minSq) 
//			{
//				minAns=minSq;
//			}
//		}
//		int minCount=minAns+1;
//		return minCount;
//	}

//  Following code is using Recursion + Memoization
	public static int minCount(int n) {
		int[] dp = new int[n + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		return minCountHelper(dp, n);
	}

	private static int minCountHelper(int[] dp, int n) {
		if (n == 0) {
			return 0;
		}
		int minAns = Integer.MAX_VALUE;
		for (int i = 1; (i * i) <= n; i++) {
			int minSquare;
			if (dp[i] == -1) {
				minSquare = minCountHelper(dp, n - (i * i));
				dp[n - (i * i)] = minSquare;
			} else {
				minSquare = dp[n - (i * i)];
			}
			if (minAns > minSquare) {
				minAns = minSquare;
			}
		}
		int minCount = minAns + 1;
		return minCount;
	}

//  Following code is using DP with Iterative
	public static int minCountIterative(int n) {
		if(n==0) 
		{
			return 0;
		}
		int[] dp = new int[n+1];
		dp[0]=0;
		for(int i=1;i<dp.length;i++) 
		{
			int minAns=Integer.MAX_VALUE;
			for(int j=1;(j*j)<=i;j++) 
			{
				int minSquare=dp[i-(j*j)];
				if(minAns>minSquare) 
				{
					minAns=minSquare;
				}
			}
			dp[i]=1+minAns;
		}
		return dp[n];
	}

}
