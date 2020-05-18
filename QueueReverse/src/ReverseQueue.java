import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int size = s.nextInt();
		Queue<Integer> input = new Queue<Integer>();
		for(int i = 0; i < size; i++) {
			input.enqueue(s.nextInt());
		}
		reverseQueue(input);
		while(!input.isEmpty()) {
			System.out.print(input.dequeue() + " ");
		}
	}
	public static void reverseQueue(Queue<Integer> q) 
	{
		Stack<Integer> stack =new Stack<Integer>(); 
		int n=q.size();
		for(int i=0;i<n;i++) 
		{
			stack.push(q.dequeue());
		}
		for(int i=0;i<n;i++) 
		{
			q.enqueue(stack.pop());
		}
	}
}
