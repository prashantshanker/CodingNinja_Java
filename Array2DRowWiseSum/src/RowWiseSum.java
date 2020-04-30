import java.util.Scanner;
public class RowWiseSum 
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int row=s.nextInt();
		int cols=s.nextInt();
		int[][] arr=new int[row][cols];
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++) 
		{
			int sum=0;
			for(int j=0;j<cols;j++) 
			{
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
}
