import java.util.Scanner;

public class Rearrage {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		getArray(arraySize, arr);
		rearrageArray(arr);
		printArray(arr);
	}
	
	private static int[] rearrageArray(int[] arr) 
	{	
		int n=arr.length;
		int evenpos=(n/2);
		int oddpos=n-evenpos;
		int tempeven[] = new int[evenpos];
		int tempodd[] = new int[oddpos];
		int i=0;
		for( i=0;i<oddpos;i++) 
		{
			tempodd[i]=arr[i];
		}
		for(int j=0;j<evenpos;j++) 
		{
			tempeven[j]=arr[i];
			i++;
		}
		int k=0;
		int l=oddpos-1;
		int m=0;
		while(k<arr.length) 
		{
			if(k%2==0) 
			{
				arr[k]=tempodd[l];
				k++;
				l--;
			}else if(k%2!=0)
			{
				arr[k]=tempeven[m];
				m++;
				k++;
			}
		}
		return arr;
		
	}

	private static void getArray(int arraySize, int[] arr) {
		for (int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
