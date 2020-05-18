import java.util.Scanner;
import java.util.Stack;

public class ReverseStack 
{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int size = s.nextInt();
		Stack<Integer> input = new Stack<Integer>();
		for(int i = 0; i < size; i++) {
			input.push(s.nextInt());
		}
		Stack<Integer> extra = new Stack<Integer>();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			System.out.print(input.pop() + " ");
		}
	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) 
	{
		int i=s1.size();
		for(int n=0;n<i;n++) 
		{
			s2.push(s1.peek());
			s1.pop();
		}
		s1.addAll(s2);
	}
}
