import java.util.Scanner;

public class RemoveConsecutiveDuplicates 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}
	public static String removeConsecutiveDuplicates(String input) 
	{
		int n=input.length();
		String s1="";
		int i=0;
		while(i<n-1) 
		{
			if(input.charAt(i)==input.charAt(i+1)) 
			{
				i++;
			}else 
			{
				s1=s1+input.charAt(i);
				i++;
			}
			if(i==n-1) 
			{
				s1=s1+input.charAt(i);
			}
			
		}
		return s1;
	}
}
