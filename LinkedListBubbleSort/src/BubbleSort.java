import java.util.Scanner;

public class BubbleSort {
	private static Scanner s = new Scanner(System.in);

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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(bubbleSort(input()));
	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		for (int i = 0; i < count - 1; i++) {
			LinkedListNode<Integer> prev = null;
			LinkedListNode<Integer> curr = head;
			for (int j = 0; j < count - i - 1; j++) {
				if (curr.data <= curr.next.data) {
					prev = curr;
					curr = curr.next;
				} else {
					if (prev == null) {
						LinkedListNode<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					} else {
						LinkedListNode<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
				}
			}
		}
		return head;
	}
}
