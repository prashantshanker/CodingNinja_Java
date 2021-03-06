import java.util.Scanner;

public class DeleteNode {
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
	
	public static void print(Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int pos = s.nextInt();
		head = deleteIthNode(head, pos);
		print(head);
	}
	public static Node<Integer> deleteIthNode(Node<Integer> head, int i)
	{
		Node<Integer> newHead=null;
		if(i==0) 
		{
			newHead=head.next;
			return newHead;
			
		}else 
		{
			int count=0;
			Node<Integer> prev=head;
			while(count<i-1) 
			{
				count++;
				prev=prev.next;
			}
			if(prev.next!=null) 
			{
				prev.next=prev.next.next;
			}
			return head;
		}
	}
}
