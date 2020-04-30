import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionArray {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		
		
		/*
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0,j = 0;
        while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
          i++;
        }
        else if(arr2[j] < arr1[i]){
         j++;          
        }
        else{
        System.out.println(arr1[i]);
          i++;
          j++;
        }
      }
        
		*/

		if (m > n) {
			int tempp[] = arr1;
			arr1 = arr2;
			arr2 = tempp;

			int temp = m;
			m = n;
			n = temp;
		}
		for (int i = 1; i < arr1.length; i++) {
			int j = i - 1;
			int temp = arr1[i];
			while (j >= 0 && arr1[j] > temp) {
				arr1[j + 1] = arr1[j];
				j--;
			}
			arr1[j + 1] = temp;
		}
		for (int i = 0; i < arr2.length; i++) {
			if (binarySearch(arr1, 0, arr1.length - 1, arr2[i]) != -1)
				System.out.println(arr2[i]);
		}
	}

	public static int binarySearch(int[] arr1, int start, int end, int num) {

		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr1[mid] > num) {
				end = mid - 1;
			} else if (arr1[mid] < num) {
				start = mid + 1;
			} else if (arr1[mid] == num) {
				arr1[mid] = 0;
				return mid;
			}
		}

		return -1;
//		if (end >= start)  
//        { 
//            int mid = start + (end - start) / 2; 
//              if (arr1[mid] == num) 
//              {
//                return mid; 
//              }
//            if (arr1[mid] > num) 
//            {
//                return binarySearch(arr1, start, mid - 1, num); 
//            }
//            return binarySearch(arr1, mid + 1, end, num); 
//        } 
//          return -1;
	}

}
