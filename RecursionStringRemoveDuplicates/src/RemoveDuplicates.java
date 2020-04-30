import java.util.Scanner;

public class RemoveDuplicates {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }
	public static String removeConsecutiveDuplicates(String s) 
	{
		if(s.length()==1) 
		{
			return s;
		}
		String smallOutput=removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0)==s.charAt(1)) 
		{
			return smallOutput;
		}else
		{
		return s.charAt(0)+ smallOutput;
		}
	}
}
