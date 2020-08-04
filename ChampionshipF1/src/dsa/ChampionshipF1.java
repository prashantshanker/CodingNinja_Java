package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ChampionshipF1 {
	public static void main(String[] args) {
		/*
		 * Your class should be named Main. Read input as specified in the question.
		 * Print output as specified in the question.
		 */

		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.parallelSort(arr);
		int max = arr[arr.length - 1];
		int num = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			max = Math.max(max, arr[i] + num);
			num++;
		}
		int winner = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + n >= max) {
				winner++;
			}
		}
		System.out.println(winner);
	}
}
