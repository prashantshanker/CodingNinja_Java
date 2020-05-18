import java.util.Scanner;

public class InsertNodeRecursion 
{
	static Scanner s = new Scanner(System.in);

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while (data != -1) {
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

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int pos = s.nextInt();
		int data = s.nextInt();
		head = insert(head, data, pos);
		print(head);
	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos)
	{
		Node<Integer> nodeToBeInserted = new Node<Integer>(data);
		if(head==null && pos>0) 
		{
			return head;
		}
		if(pos==0) 
		{
			nodeToBeInserted.next=head;
			head=nodeToBeInserted;
		}else 
		{
			insert(head.next, data, pos-1);
			if(pos==1) 
			{
				nodeToBeInserted.next=head.next;
				head.next=nodeToBeInserted;
			}
		}
		return head;
	}
}
