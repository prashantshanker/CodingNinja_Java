import java.util.Scanner;

public class AppendLastNToFirst 
{
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(append(input(), s.nextInt()));
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

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}
	
	public static Node<Integer> append(Node<Integer> root, int n) 
	{
		Node<Integer> prev=root;
		Node<Integer> last=root;
		Node<Integer> lengthNode=root;
		Node<Integer> newRoot=null;
		int count=1;
		int length =1;
		while(lengthNode!=null) 
		{
			length++;
			lengthNode=lengthNode.next;
		}
		while(count<=(length-n)-2) 
		{
			count++;
			prev=prev.next;
		}
		newRoot=prev.next;
		int countLength=1;
		while(countLength<=length-2) 
		{
			countLength++;
			last=last.next;
		}
		last.next=root;
		prev.next=null;
		
		return newRoot;
	}

}
