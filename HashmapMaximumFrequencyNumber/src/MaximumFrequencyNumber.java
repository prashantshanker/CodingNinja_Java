import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyNumber {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int sze = s.nextInt();
		int[] arr = new int[sze];
		for (int index = 0; index < sze; index++) {
			arr[index] = s.nextInt();
		}
		System.out.println(maxFrequencyNumber(arr));
	}

	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = Integer.MIN_VALUE;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
				if (map.get(arr[i]) > count) {
					count = map.get(arr[i]);
					value = arr[i];
				}
			} else {
				map.put(arr[i], 1);
				if (map.get(arr[i]) > count) {
					count = map.get(arr[i]);
					value = arr[i];
				}
			}
		}
		return value;
	}
}
