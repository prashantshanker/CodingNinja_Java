import java.util.Scanner;

public class AllSubString 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String str = s.nextLine();
		printSubstrings(str);
	}
	public static void printSubstrings(String str){
	int n=str.length();
	for(int i=0;i<n;i++) 
	{
		for(int j=i+1;j<n+1;j++) 
		{
			System.out.println(str.substring(i,j));
		}
	}

	}

}
