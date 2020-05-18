import java.util.Scanner;

public class SwapTwoNode {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(swap_nodes(input(), s.nextInt(), s.nextInt()));
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) 
	{
		int countx = 0, county = 0;
		if (i == j) {
			return head;
		}
		LinkedListNode<Integer> prevX = null, currX = head;
		while (currX != null && countx <= i) {
			countx++;
			prevX = currX;
			currX = currX.next;
		}

		LinkedListNode<Integer> prevY = null, currY = head;
		while (currY != null && county <= j) {
			county++;
			prevY = currY;
			currY = currY.next;
		}
		int temp = 0;
		temp = prevX.data;
		prevX.data = prevY.data;
		prevY.data = temp;
		return head;
	}
}