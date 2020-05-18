import java.util.Scanner;

public class InsertNode {
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

	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		int lenght = 0;
		Node<Integer> a = head;
		while (a != null) {
			lenght++;
			a = a.next;
		}

		if (pos == 0) {
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;

		} else if (pos == lenght) {
			Node<Integer> newNode = new Node<>(data);
			Node<Integer> temp = head;
			int count = 1;
			Node<Integer> posI = null;
			while (temp != null) {
				if (count == pos) {
					posI = temp;
				}
				count++;
				temp = temp.next;
			}
			posI.next = newNode;
			newNode.next = null;
			return head;
		} else if (pos > 0 && pos < lenght) {
			Node<Integer> newNode = new Node<>(data);
			Node<Integer> temp = head;
			int count = 1;
			Node<Integer> posI = null;
			Node<Integer> posI1 = null;
			while (temp != null) {
				if (count == pos) {
					posI = temp;
				} else if (count == pos + 1) {
					posI1 = temp;
					break;
				}
				count++;
				temp = temp.next;
			}
			posI.next = newNode;
			newNode.next = posI1;
			return head;
		} else {
			return head;
		}
	}
}
