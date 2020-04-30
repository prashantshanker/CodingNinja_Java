import java.util.Scanner;

public class PrintSprial {
	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int a[][] = takeInput2D();
		spiralPrint(a);
	}
	public static void spiralPrint(int matrix[][])
	{
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;
		int i,j,c = 1;
		if((rowEnd + 1) ==1) {
			for(j = colStart;j <= colEnd;j++ ) {
				System.out.print(matrix[rowStart][j] + " ");
			}
		}
		else if((colEnd + 1) ==1) {
			for(i = rowStart;i <= rowEnd;i++) {
				System.out.print(matrix[i][colStart] + " ");	
			}
		}
		else {
		while(c <= (matrix.length*matrix[0].length)) {
			for(j = colStart;j <= colEnd;j++) {
				System.out.print(matrix[rowStart][j] + " ");
				c++;
			}
			rowStart++;
			for(i = rowStart;i <= rowEnd;i++) {
				System.out.print(matrix[i][colEnd] + " ");
				c++;
			}
			colEnd--;
			for(j = colEnd ;j >= colStart ;j--) {
				System.out.print(matrix[rowEnd][j] + " ");
				c++;
			}
			rowEnd--;
			for(i = rowEnd;i >= rowStart;i--) {
				System.out.print(matrix[i][colStart] + " ");
				c++;
			}
			colStart++;
		}
		}
		
	}
}
