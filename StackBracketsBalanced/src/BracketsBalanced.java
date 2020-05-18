import java.util.Scanner;
import java.util.Stack;

public class BracketsBalanced {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(checkBalanced(input));
	}

	public static boolean checkBalanced(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			} else if (exp.charAt(i) == '}' || exp.charAt(i) == ']' || exp.charAt(i) == ')') {
				if (exp.charAt(i) == ')') {
					if (stack.isEmpty()) {
						return false;
					} else if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
				} else if (exp.charAt(i) == '}') {
					if (stack.isEmpty()) {
						return false;
					} else if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
				} else if (exp.charAt(i) == ']') {
					if (stack.isEmpty()) {
						return false;
					} else if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		if(stack.isEmpty()) 
		{
		return true;
		}else 
		{
			return false;
		}
	}
}
