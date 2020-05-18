import java.util.Scanner;

public class EvenAfterOdd {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(sortEvenOdd(input()));
	}

	public static Node<Integer> input() {
		int data = s.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;
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
	}

	public static Node<Integer> sortEvenOdd(Node<Integer> head) {
		Node<Integer> evenStart = null, oddStart = null, evenEnd = null, oddEnd = null;
		Node<Integer> temp = head;
		if (head == null || head.next == null) {
			return head;
		}
		while (temp != null) {
			if (temp.data % 2 != 0) {
				if (oddStart == null) {
					oddStart = temp;
					oddEnd = temp;
					temp = temp.next;
				} else {
					oddEnd.next = temp;
					oddEnd = temp;
					temp = temp.next;
				}
			} else {
				if (evenStart == null) {
					evenStart = temp;
					evenEnd = temp;
					temp = temp.next;
				} else {
					evenEnd.next = temp;
					evenEnd = temp;
					temp = temp.next;
				}
			}
		}
		if (evenStart != null && oddEnd != null) {
			oddEnd.next = evenStart;
			evenEnd.next = null;
			return oddStart;
		} else if (evenStart == null) {
			return oddStart;
		} else {
			return evenStart;
		}

	}
}
