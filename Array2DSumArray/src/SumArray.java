import java.util.Scanner;

public class SumArray {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int sum=0;
		int n=in.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				arr[i][j]=in.nextInt();
			}
		}
		int sumFirstrow=0;
		int i=0,j=0;
		while(j<n) 
		{
			sumFirstrow=sumFirstrow+arr[i][j];
			j++;
		}		
		int sumLastrow=0;
		int k=n-1,l=0;
		while(l<n) 
		{
			sumLastrow=sumLastrow+arr[k][l];
			l++;
		}		
		int sumFirstcols=0;
		int m=0,p=1;
		while(p<n-1) 
		{
			sumFirstcols=sumFirstcols+arr[p][m];
			p++;
		}
		int sumLastcols=0;
		int q=n-1,r=1;
		while(r<n-1) 
		{
			sumLastcols=sumLastcols+arr[r][q];
			r++;
		}		
		int sumDiagonal=0;
		for(int u=1;u<n-1;u++) 
		{
			for(int v=1;v<n-1;v++) 
			{
				if(u==v) 
				{
					sumDiagonal+=arr[u][v];
				}else if((u+v)==(n-1)) 
				{
					sumDiagonal+=arr[u][v];
				}
			}	
		}
		sum=sumDiagonal+sumFirstcols+sumFirstrow+sumLastcols+sumLastrow;
		System.out.println(sum);
	}
}
