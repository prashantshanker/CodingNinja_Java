import java.util.Scanner;
public class CountWord {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(countWords(str));
	}
	public static int countWords(String str){
		int n=str.length();
		int count=1;
		for(int i=0;i<n;i++) 
		{
			if(str.charAt(i)==' ') 
			{
				count++;
			}
		}
		
		return count;
	}
}
