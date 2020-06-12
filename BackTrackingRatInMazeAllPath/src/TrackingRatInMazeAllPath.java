import java.util.Scanner;

public class TrackingRatInMazeAllPath {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		ratInAMaze(maze);	
	}
	public static void ratInAMaze(int maze[][]){
		int size = maze.length;
		int path[][] = new int[size][size];
		solveMaze(maze,0,0,path);
	}
	private static void solveMaze(int[][] maze, int i, int j, int[][] path) 
	{
		int n=maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1) 
		{
			return;
		}
		path[i][j]=1;
		if(i==n-1 && j==n-1) 
		{
			for(int k=0;k<n;k++) 
			{
				for(int l=0;l<n;l++) 
				{
					System.out.print(path[k][l] + " ");
				}
			}
			System.out.println();
			path[i][j]=0;
			return;
		}
		solveMaze(maze, i-1, j, path);
		solveMaze(maze, i, j+1, path); 
		solveMaze(maze, i+1, j, path);
		solveMaze(maze, i, j-1, path);
		path[i][j]=0;
	}

}
