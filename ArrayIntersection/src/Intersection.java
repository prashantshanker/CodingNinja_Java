import java.util.Scanner;
public class Intersection 
{
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersections(arr1, arr2);
	}

	private static void intersections(int[] arr1, int[] arr2) 
	{
		int n=arr1.length;
		int m=arr2.length;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");
					arr2[j]=-1;
					break;
				}
			}
		}
	}

}
