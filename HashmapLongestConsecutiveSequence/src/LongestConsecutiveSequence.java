import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

import java.util.ArrayList;

public class LongestConsecutiveSequence {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
		for (int num : ans) {
			System.out.println(num);
		}
	}

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) 
		{
			a.add(arr[i]);
		}
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++) {
            map.put(arr[i], false);
        }
        for (int e : map.keySet()) {
            if (!map.get(e)) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(e);
                map.put(e, true);
                for (int i = 1; map.containsKey(e + i); i++) {
                    temp.add(e + i);
                    map.put(e + i, true);
                }
                if(output.size()==temp.size()) 
                {
                	int outputpos=a.indexOf(output.get(0));
                	int temppos=a.indexOf(temp.get(0));
                	if(outputpos>temppos) 
                	{
                		output=temp;
                	}
                }else if (output.size() < temp.size()) {
                    output = temp;
                }
            }
        }
		return output;
 	}
}
