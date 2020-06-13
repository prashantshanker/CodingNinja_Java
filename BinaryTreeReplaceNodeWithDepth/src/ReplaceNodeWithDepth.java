import java.util.Scanner;

class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}

}

class QueueUnderFlowException extends Exception {

}

class QueueUsingLinkedList<T> {
	Node<T> front;
	Node<T> rear;
	int size;

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> nyaNode = new Node<>(data);
		if (front == null) {
			front = nyaNode;
			rear = nyaNode;
		} else {
			rear.next = nyaNode;
			rear = rear.next;
		}
		size++;
	}

	public T dequeue() throws QueueUnderFlowException {
		if (front == null) {
			throw new QueueUnderFlowException();
		}
		Node<T> temp = front;
		front = front.next;
		size--;
		return temp.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public void printQueue() {
		Node<T> temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}
}
public class ReplaceNodeWithDepth {
	static Scanner s = new Scanner(System.in);

	static BinaryTreeNode<Integer> prepareTree() throws QueueUnderFlowException {

		int data = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLinkedList<BinaryTreeNode<Integer>> queue = new QueueUsingLinkedList();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();

			int leftData = s.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(
						leftData);
				currentNode.setLeft(leftNode);
				queue.enqueue(currentNode.getLeft());

			}

			int rightData = s.nextInt();
			if (rightData != -1) {
				currentNode.setRight(new BinaryTreeNode<>(rightData));
				queue.enqueue(currentNode.getRight());
			}
		}
		return root;
	}

	public static void main(String[] args) throws QueueUnderFlowException {
		BinaryTreeNode<Integer> root = prepareTree();
		replaceDepth(root);
	}
	static void replaceDepth(BinaryTreeNode<Integer> n1) 
	{
		replaceNode(n1,0);
		printInOrder(n1);
	}

	private static void replaceNode(BinaryTreeNode<Integer> n1, int level) 
	{
		if(n1==null) 
		{
			return;
		}
		n1.data=level;
		replaceNode(n1.left, level+1);
		replaceNode(n1.right, level+1);
	}
	public static void printInOrder(BinaryTreeNode<Integer> root) {
		if(root==null) 
		{
			return;
		}
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}

}
