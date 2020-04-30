import java.util.Scanner;

public class HighestOccuringChar {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(highestOccuringCharacter(input));
	}
	public static char highestOccuringCharacter(String inputString) 
	{
		int n=inputString.length();
		char ch=' ';
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<n;j++)
			{
				
				if(inputString.charAt(i)==inputString.charAt(j)) 
				{
					count++;
				}
			}
			if(count>max) 
			{
				ch=inputString.charAt(i);
				max=count;
			}
			count=0;
		}
		return ch;
	}
}
