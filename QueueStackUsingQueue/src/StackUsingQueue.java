import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue<T> {
	static Queue<Integer> q1;
	static Queue<Integer> q2;
	static int curr_size;

	public StackUsingQueue() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		curr_size = 0;
	}

	public int getSize() {
		return curr_size;
	}

	public Integer top() {
		if (q1.isEmpty()) {
			return -1;
		}
		return q1.peek();
	}

	public Integer pop() {
		int temp = q1.peek();
		q1.remove();
		curr_size--;
		return temp;
	}

	public void push(int input) {
		curr_size++;
		q2.add(input);
		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	public Boolean isEmpty() 
	{
		return curr_size==0;
	}

	public Queue<Integer> getQueue() {
		Stack<Integer> stack = new Stack<>(); 
		int n=q1.size();
        for(int i=0;i<n;i++) 
        {
        	stack.push(q1.poll());
        } 
        for(int i=0;i<n;i++) 
        {
        	q1.add(stack.pop());
        } 
        return q1;
	}

}
