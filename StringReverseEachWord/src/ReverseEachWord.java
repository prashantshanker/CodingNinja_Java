import java.util.Scanner;

public class ReverseEachWord 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(reverseEachWord(input));
	}
	public static String reverseEachWord(String input)
	{
		String wholeString="";
		int start=0;
		for(int i=0;i<input.length();i++) 
		{
			if(input.charAt(i)==' ') 
			{
				int end=i-1;
				String reverseWord="";
				for(int j=start;j<=end;j++)
				{
					reverseWord=input.charAt(j)+reverseWord;
				}
				wholeString+=reverseWord+" ";
				start =i+1;
			}
			if(i==input.length()-1) 
			{
				String reverseWord="";
				for(int j=start;j<=input.length()-1;j++) 
				{
					reverseWord=input.charAt(j)+reverseWord;
				}
				wholeString+=reverseWord+" ";
			}
		}
		
		return wholeString;
		
	}
}
