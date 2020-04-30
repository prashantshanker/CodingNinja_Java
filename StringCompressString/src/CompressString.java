import java.util.Scanner;

public class CompressString 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(compress(input));
	}
	public static String compress(String inputString) 
	{
		int n=inputString.length();
		String ans="";
		int k=0;
        int count=0,j;
        for(int i=0;i<n;i++)
        {
            for(j=k;j<n;j++)
            {
                if(inputString.charAt(i)==inputString.charAt(j))
                {
                        count++;
                }
                else
                {
                    break;
                }
            }
            if(count==1)
            {
                ans=ans+inputString.charAt(i);
            }
            else
            {
                ans=ans+inputString.charAt(i)+count;
            }
            count=0;
            i=j-1;
            k=j;
        }
		
		return ans;
	}
}
