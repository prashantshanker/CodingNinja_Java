import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(isPermutation(input1, input2));
	}

	public static boolean isPermutation(String input1, String input2) {
		 	int n1 = input1.length();  
		    int n2 = input2.length();   
		    if (n1 != n2) 
		    {  
		    return false;  
		    }
		    char ch1[] = input1.toCharArray(); 
		    char ch2[] = input2.toCharArray();   
		    Arrays.sort(ch1);  
		    Arrays.sort(ch2); 

		for (int i = 0; i < n1; i++)
			if (ch1[i] != ch2[i])
			{
				return false;
			}
		return true;
	}
}
