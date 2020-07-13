import java.util.Scanner;

public class MinimumNumberOfChocolates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		System.out.println(getMin(arr, N));
	}

	public static int getMin(int arr[], int N) {
		int m = arr.length;
		int[] candiesArray = new int[m];
		candiesArray[0] = 1;
		int sumCandies = 0;
		for (int i = 1; i < m; i++) {
			if (arr[i] > arr[i - 1]) {
				candiesArray[i] = candiesArray[i - 1] + 1;
			} else {
				candiesArray[i] = 1;
			}
		}
		for (int i = m - 2; i >= 0; i--) {

			if (arr[i] > arr[i + 1] && candiesArray[i] <= candiesArray[i + 1]) {
				candiesArray[i] = candiesArray[i + 1] + 1;
			}
			sumCandies += candiesArray[i];
		}

		sumCandies += candiesArray[m - 1];

		return sumCandies;

	}

}
