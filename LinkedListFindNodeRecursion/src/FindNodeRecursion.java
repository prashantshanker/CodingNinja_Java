import java.util.Scanner;

public class FindNodeRecursion {

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

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(indexOfNRec(head, n));
	}

	public static int indexOfNRec(Node<Integer> head, int n) {
		if (head == null) {
			return -1;
		}
		if (head.data == n) {
			return 0;
		}
		int numToBeFind = 1 + indexOfNRec(head.next, n);
		if (numToBeFind > 0) {
			return numToBeFind;
		} else {
			return -1;
		}
	}
}
