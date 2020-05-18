import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets 
{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(checkRedundantBrackets(input));
	}
	
		public static boolean isRedundant = false;
		public static boolean consecutiveStartBrackets = false;
		public static boolean checkRedundantBrackets(String input) 
			{
		        int i = 0;
				Stack<Character> stack = new Stack<>();
				for (i = 0; i < input.length() - 1; i++) {
					if (input.charAt(i) == '(') {
						if (input.charAt(i + 1) == ')') {
							isRedundant = true;
							break;
						} else if (input.charAt(i + 1) == '(') {
							consecutiveStartBrackets = true;
						}
						stack.push(input.charAt(i));
					} 
					if (input.charAt(i) == ')') {
						if (input.charAt(i + 1) == ')') {
							if (consecutiveStartBrackets == true) {
								isRedundant = true;
								break;
							}
						} else if (!stack.isEmpty() && stack.pop() == '(') {
							stack.pop();
							continue;
						} else {
							break;
						}
					}
				}
		return isRedundant;
	}
}
