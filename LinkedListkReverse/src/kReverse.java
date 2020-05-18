import java.util.Scanner;

public class kReverse {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(kReverse(input(), s.nextInt()));
	}
	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> input, int nextInt) 
	{
		if(input== null){
            return null;
        }
        LinkedListNode<Integer> current = input;
		LinkedListNode<Integer> next = null; 
		LinkedListNode<Integer> prev = null; 
		int count = 0; 
		while (count < nextInt && current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
			count++; 
		} 
		if (next != null) { 
			input.next = kReverse(next, nextInt); 
		} 
		return prev;
    }
}
