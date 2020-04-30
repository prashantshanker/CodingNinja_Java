import java.util.Scanner;

public class PrintLikeWave {
	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput2D() {

		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {

		int input[][] = takeInput2D();
		wavePrint(input);
	}

	public static void wavePrint(int input[][]) {
		int row = input.length;
		int cols = input[0].length;
		int j = 0;
		while (j < cols)
		{
			if (j % 2 == 0) 
			{
				int i = 0;
				while (i < row) {
					System.out.print(input[i][j] + " ");
					i++;
				}
				j++;
			}else if(j%2!=0) 
			{
				int i=row-1;
				while (i >= 0) {
					System.out.print(input[i][j] + " ");
					i--;
				}
				j++;
			}
		}

	}
}
