import java.util.HashMap;
import java.util.Scanner;

public class PairSumTo0 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		PairSum(arr, n);
	}

	public static void PairSum(int[] input, int size) {
		HashMap<Integer, Integer> negativeMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> positiveMap = new HashMap<Integer, Integer>();
		int noOfZeros = 0;

		for (int e : input) {
			if (e == 0) {
				noOfZeros++;
			} else if (e < 0) {
				if (negativeMap.containsKey(e)) {
					int temp = negativeMap.get(e);
					negativeMap.put(e, temp + 1);
				} else {
					negativeMap.put(e, 1);
				}
			} else if (e > 0) {
				if (positiveMap.containsKey(e)) {
					int temp = positiveMap.get(e);
					positiveMap.put(e, temp + 1);
				} else {
					positiveMap.put(e, 1);
				}
			}
		}
		for (int i = 0; i < noOfZeros * noOfZeros; i++) {
			System.out.println("0 0");
		}

		for (int negData : negativeMap.keySet()) {
			int posData = -1 * negData;
			if (positiveMap.containsKey(posData)) {
				int negV = negativeMap.get(negData);
				int posV = positiveMap.get(posData);

				for (int i = 0; i < negV * posV; i++) {
					System.out.println(negData + " " + posData);
				}
			}

		}
	}
}
