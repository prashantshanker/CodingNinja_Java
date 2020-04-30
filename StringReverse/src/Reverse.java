import java.util.Scanner;

public class Reverse {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(reverseString(str));
	}
	public static String reverseString(String str){
		int n=str.length();
		String reverseString="";
		for(int i=n-1;i>=0;i--) 
		{
			reverseString+=str.charAt(i);
			
		}
		
		return reverseString;
	}
}
