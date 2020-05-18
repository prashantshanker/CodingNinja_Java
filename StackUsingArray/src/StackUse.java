
public class StackUse 
{
	public static void main(String[] agrs) throws StackFullException, StackEmptyException 
	{
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.top();
		stack.pop();
		stack.size();
		stack.isEmpty();
	}
}
