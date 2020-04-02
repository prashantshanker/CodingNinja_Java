import java.util.Scanner;

public class SumOfTwoArray {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(sumOfTwoArrays(arr1, arr2));
	}

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
		int carry = 0,k,i,j;
		int[] arr3;
		if(arr1.length > arr2.length) {
			 arr3 = new int[arr1.length + 1];
			 i = arr1.length - 1;
             j = arr2.length - 1;
			 while(i >= 0 && j >= 0) {
					arr3[i + 1] = (arr1[i] + arr2[j] + carry) % 10;
					carry = (arr1[i] + arr2[j] + carry)/10;
					i--;
					j--;
		}
			 for(k = i+1;k > 0 && i >= 0;k--) {
				 arr3[k] = (arr1[i] + carry) % 10;
			     carry = (arr1[i] + carry) / 10;
               i--;
			 } 
			 arr3[0] = carry;
		}
		else {
			 arr3 = new int[arr2.length + 1];
			 i = arr1.length - 1;
             j = arr2.length - 1;
			 while(i >= 0 && j >= 0) {
					arr3[j + 1] = (arr1[i] + arr2[j] + carry) % 10;
					carry = (arr1[i] + arr2[j] + carry)/10;
					i--;
					j--;
		}
			 for(k = j+1;k > 0 && j >= 0;k--) {
				 arr3[k] = (arr2[j] + carry) % 10;
			     carry = (arr2[j] + carry) / 10;
                 j--;
			 }
			 arr3[0] = carry;
	}
		return arr3;

	}
}
