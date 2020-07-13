import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubsetZeroSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();

		int size = scan.nextInt();
		for (int i = 0; i < size; i++)
			arr.add(scan.nextInt());

		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
		scan.close();
	}

	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int longestSubset = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			if (arr.get(i) == 0 && longestSubset == 0) {
				longestSubset = 1;
			}
			if (sum == 0) {
				longestSubset = i + 1;
			}
			Integer prevI = map.get(sum);
			if (prevI != null) {
				longestSubset = Math.max(longestSubset, i - prevI);
			} else {
				map.put(sum, i);
			}
		}

		return longestSubset;

	}
}
