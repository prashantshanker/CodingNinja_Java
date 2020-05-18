import java.util.Scanner;

public class IthNode {
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
		printIth(head, pos);
	}
	public static void printIth(Node<Integer> head, int i)
	{
		Node<Integer> temp= head;
		int count=0;
		while(temp!=null) 
		{
			if(count==i) 
			{
				System.out.println(temp.data);
			}
			count++;
			temp=temp.next;
		}
		
	}
}
