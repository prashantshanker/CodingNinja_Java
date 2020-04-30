import java.util.Scanner;

public class ReverseWordwise {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
	public static String reverseWordWise(String input) {
		int n=input.length();
		String reverseWordwise = new String();
		int start=0;
		for(int i=0;i<n;i++) 
		{
			if(input.charAt(i)==' ') 
			{
				reverseWordwise=input.substring(start,i)+" "+reverseWordwise;
				start=i+1;
			}else if(i==n-1) 
			{
				reverseWordwise=input.substring(start,n)+" "+reverseWordwise;
			}
		}
		return reverseWordwise;
	}
}
