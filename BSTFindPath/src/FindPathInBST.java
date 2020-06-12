import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {
}

class Queue<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
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

public class FindPathInBST {
	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput(){
		Queue<BinaryTreeNode<Integer>>  pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we can skip writing again inside <> after java version 1.7 
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		int data = s.nextInt();
		ArrayList<Integer> output = findPath(root, data);
		if(output != null) {
			for(int i : output) {
				System.out.println(i);
			}
		}
	}
	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
		if(root==null) 
		{
			return null;
		}
		if(root.data==data) 
		{
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		if(data<root.data) 
		{
			ArrayList<Integer> leftPath=pathOfBST(root.left,data);
			if(leftPath!=null) 
			{
				leftPath.add(root.data);
			}
			return leftPath;
		}else
		{
			ArrayList<Integer> rightPath=pathOfBST(root.right,data);
			if(rightPath!=null) 
			{
				rightPath.add(root.data);
			}
			return rightPath;
		}
	}

	private static ArrayList<Integer> pathOfBST(BinaryTreeNode<Integer> root, int x) 
	{
		if(root==null) 
		{
			return null;
		}
		if(root.data==x) 
		{
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftSubTree = pathOfBST(root.left, x);
		if(leftSubTree!=null) 
		{
			leftSubTree.add(root.data);
			return leftSubTree;
		}
		ArrayList<Integer> rightSubTree = pathOfBST(root.right, x);
		if(rightSubTree!=null) 
		{
			rightSubTree.add(root.data);
			return rightSubTree;
		}
		return null;
	}

}
