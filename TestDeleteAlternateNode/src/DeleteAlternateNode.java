import java.util.Scanner;

public class DeleteAlternateNode {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedListNode<Integer> list = input();
		deleteAlternateNodes(list);
		print(list);
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
		while (data != -1) {
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

	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
		if (head == null) {
			return;
		}
		LinkedListNode<Integer> prev = head;
		LinkedListNode<Integer> now = head.next;

		while (prev != null && now != null) {
			prev.next = now.next;

			now = null;

			prev = prev.next;
			if (prev != null) {
				now = prev.next;
			}
		}
	}
}
