import java.util.Scanner;

public class PrintReverse
{
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		printReverseRecursive(input());
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
	public static void printReverseRecursive(Node<Integer> root) 
	{
		if (root == null) 
		{
			return; 
		}
		  printReverseRecursive(root.next); 
		  System.out.print(root.data+" ");
	}

}
