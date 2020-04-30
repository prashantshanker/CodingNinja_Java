import java.util.Scanner;

public class RemoveCharacter
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(input, c));
	}
	public static String removeAllOccurrencesOfChar(String input, char c)
	{
		int n=input.length();
		String ans="";
		int i=0;
		while(i<n) 
		{
			if(input.charAt(i)==c) 
			{
				i++;
			}else
			{
				ans=ans+input.charAt(i);
				i++;
			}
		}
		return ans;
	}
}
