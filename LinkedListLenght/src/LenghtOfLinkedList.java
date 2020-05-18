import java.util.Scanner;

public class LenghtOfLinkedList 
{
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
		System.out.println(length(head));
	}
	public static int length(Node<Integer> head)
	{
		int count =0;
		while(head!=null) 
		{
			count++;
			head=head.next;
		}
		return count;
		
	}
}
