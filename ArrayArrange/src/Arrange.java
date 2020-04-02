import java.util.Scanner;
public class Arrange {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}

	private static int[] arrange(int n) 
	{
		int array[]=new int[n];
		for(int i=1;i<=n;i++) 
		{
			if(i%2!=0)
			{
				array[(i)/2]=i;
			}
			else 
			{
				array[n-(i/2)]=i;
			}
		}
		
		return array;
	}

}
