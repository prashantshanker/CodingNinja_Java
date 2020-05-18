import java.util.Scanner;

public class MidPointLinkedList 
{
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(printMiddel(input()) + "");
	}
	

	public static Node<Integer> input() {
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	public static int printMiddel(Node<Integer> head) 
	{
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		int midpoint=0;
		while(fast!=null) 
		{
			if(fast.next==null) 
			{
				midpoint= slow.data;
			}else if(fast.next.next==null)
			{
				midpoint= slow.data;
			}
			
			if(fast.next==null)
			{
			break;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return midpoint;
	}

}
