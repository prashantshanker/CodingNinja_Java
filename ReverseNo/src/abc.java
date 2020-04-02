import java.util.Scanner;

public class abc {

		static int reversDigits(int num) 
	    { 
	        int rev_num = 0; 
	        while(num > 0) 
	        { 
	            rev_num = rev_num * 10 + num % 10; 
	            num = num / 10; 
	        } 
	        return rev_num; 
	    } 
	      
	  
	    public static void main (String[] args)  
	    { 
	       Scanner s = new Scanner(System.in);
	       int num=s.nextInt();
	        System.out.println(reversDigits(num)); 
	    } 
	}


