import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDiffK {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		findPairsDifferenceK(input, k);
	}

	public static void findPairsDifferenceK(int[] input, int k) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		HashMap<Integer, HashMap<Integer, String>> pairs = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			int v = input[i];
			if (map.containsKey(v)) {
				map.get(v).add(i);
			} else {
				ArrayList<Integer> tempList = new ArrayList<>();
				tempList.add(i);
				map.put(v, tempList);
			}
		}
		for (int i = 0; i < input.length; i++) {
			int v = input[i];
			int calcVal = v - k;
			if (map.containsKey(calcVal)) {
				for (int j : map.get(calcVal)) {
					if (i != j) {
						int lowerIndex = i < j ? i : j;
						int higherIndex = i > j ? i : j;
						int newValue = input[j];
						int lowerValue = v < newValue ? v : newValue;
						int higherValue = v > newValue ? v : newValue;
						String str = lowerValue + " " + higherValue;
						if (pairs.containsKey(lowerIndex)) {
							if (pairs.get(lowerIndex).containsKey(higherIndex)) {
							} else {
								pairs.get(lowerIndex).put(higherIndex, str);
							}
						} else {
							HashMap<Integer, String> tempMap = new HashMap<>();
							tempMap.put(higherIndex, str);
							pairs.put(lowerIndex, tempMap);
						}
					}
				}
			}
		}
		for (int v1 : pairs.keySet()) {
			for (int v2 : pairs.get(v1).keySet()) {
				System.out.println(pairs.get(v1).get(v2));
			}
		}
	}
}
