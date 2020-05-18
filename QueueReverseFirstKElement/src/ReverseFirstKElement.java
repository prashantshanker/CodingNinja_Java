import java.util.*;

public class ReverseFirstKElement {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			q.add(s.nextInt());
		}
		int k = s.nextInt();
		Queue<Integer> ans = reverseKElements(q,k);
		while(!ans.isEmpty()){
			System.out.print(ans.remove()+" ");
		}
	}
	public static Queue<Integer> reverseKElements(Queue<Integer> input,int k)
	{
		int n=input.size();
		Queue<Integer> queueSmall = new LinkedList<Integer>();
		for(int i=0;i<k;i++)
		{
			queueSmall.add(input.poll());
		}
		reverseQueue(queueSmall);
		for(int i=0;i<n-k;i++) 
		{
			queueSmall.add(input.poll());
		}
		return queueSmall;
	}
	public static void reverseQueue(Queue<Integer> q) 
	{
		Stack<Integer> stack =new Stack<Integer>(); 
		int n=q.size();
		for(int i=0;i<n;i++) 
		{
			stack.push(q.poll());
		}
		for(int i=0;i<n;i++) 
		{
			q.add(stack.pop());
		}
	}
}
