import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

class QueueUsingLL<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException {
		if (head == null) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if (head == tail) {
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class LevelWiseLinkedList {
	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput() {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		ArrayList<Node<BinaryTreeNode<Integer>>> output = LLForEachLevel(root);
		for (Node<BinaryTreeNode<Integer>> head : output) {
			Node<BinaryTreeNode<Integer>> temp = head;
			while (temp != null) {
				System.out.print(temp.data.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		ArrayList<Node<BinaryTreeNode<Integer>>> arr = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		queue.enqueue(null);
		try {
			Node<BinaryTreeNode<Integer>> head = null;
			Node<BinaryTreeNode<Integer>> tail = null;
			while (!queue.isEmpty()) {
				BinaryTreeNode<Integer> temp = queue.dequeue();
				if (temp == null) {
					arr.add(head);
					head = null;
					tail = null;
					if (!queue.isEmpty()) {
						queue.enqueue(null);
					}
					continue;
				}
				Node<BinaryTreeNode<Integer>> var = new Node<BinaryTreeNode<Integer>>(temp);
				if (head == null) {
					head = var;
					tail = var;
				} else {
					tail.next = var;
					tail = var;
				}
				if (temp.left != null) {
					queue.enqueue(temp.left);
				}
				if (temp.right != null) {
					queue.enqueue(temp.right);
				}

			}
		} catch (Exception e) {

		}
		return arr;
	}

}
