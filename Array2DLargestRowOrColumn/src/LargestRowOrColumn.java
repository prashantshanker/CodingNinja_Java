import java.util.Scanner;

public class LargestRowOrColumn {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int maxrow=Integer.MIN_VALUE;
		int maxcols=Integer.MIN_VALUE;
		int row=s.nextInt();
		int cols=s.nextInt();
		int posrow=0;
		int poscols=0;
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
			int sumrow=0;
			for(int j=0;j<cols;j++) 
			{
				sumrow=sumrow+arr[i][j];
			}
			if(sumrow>maxrow) 
			{
				posrow=i;
				maxrow=sumrow;
			}
		}
		int sumcols=0;
		int l=0;
		while(l<cols) 
		{
			int k=0;
			while(k<row) 
			{
				sumcols=sumcols+arr[k][l];
				k++;
			}
			if(sumcols>maxcols) 
			{
				poscols=l;
				maxcols=sumcols;
			}
			l++;
			sumcols=0;
		}
		if(maxcols>maxrow) 
		{
			System.out.println("column"+" "+poscols+" "+maxcols);
		}else 
		{
			System.out.println("row"+" "+posrow+" "+maxrow);
		}
	}
}
