import java.util.Scanner;

public class FindNode {
static Scanner s = new Scanner(System.in);
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	

	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(indexOfNIter(head, n));
	}
	public static int indexOfNIter(Node<Integer> head, int n) 
	{
		Node<Integer> temp=head;
		int count =0;
		while(temp!=null) 
		{
			if(temp.data==n) 
			{
				return count;
			}
			count++;
			temp=temp.next;
		}
		return -1;
	}
}
