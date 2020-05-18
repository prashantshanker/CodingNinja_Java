import java.util.Scanner;

public class ReverseRecursion 
{
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		print(reverse_R(input()));
	}
	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
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
	public static Node<Integer> reverse_R(Node<Integer> head) 
    {
		if(head==null || head.next==null) 
		{
			return head;
		}
		Node<Integer> reverseHead=reverse_R(head.next);	
		Node<Integer> tail = reverseHead;
		while(tail.next!=null) 
		{
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		return reverseHead;
	}

}
