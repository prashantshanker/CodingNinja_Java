import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(countBracketReversals(str));
	}
	public static int countBracketReversals(String input)
	{
		int len = input.length();    
	    if (len % 2 != 0) 
	    { 
	        return -1;  
	    }
	    int ans = 0;  
	    int i;  
	    int open = 0;  
	    int close = 0;  
	   for (i = 0; i < len; i++) 
	    { 
	        if (input.charAt(i) == '{') 
	        { 
	            open++;  
	        }else 
	        {  
	            if (open == 0) 
	            { 
	                close++;  
	            }
	            else 
	            {
	                open--;  
	            }
	        }  
	    }  
	   	ans = (close / 2) + (open / 2);    
	    close %= 2;  
	    open %= 2;  
	    if (close != 0) 
	    { 
	        ans += 2;  
	    }
	  
	    return ans;  
	}  	
}

