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
public class PrintNodeAtDistanceKFromNode {
	static Scanner s = new Scanner(System.in);
	static int target;
	static int k;
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
		target = s.nextInt();
		k = s.nextInt();
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();

		nodesAtDistanceK(root, target, k);
	}
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) 
	{
		if(root==null || k<0) 
		{
			return;
		}
		printkdistanceNode(root, node, k);
	}
	public static int printkdistanceNode(BinaryTreeNode<Integer> root, int node, int k)  
	    { 
	        if (root == null) {
	            return -1; 
	        } 
	        if (root.data == node)  
	        { 
	            printkdistanceNodeDown(root, k); 
	            return 0; 
	        } 
	        int leftSubTree = printkdistanceNode(root.left, node, k); 
	        if (leftSubTree != -1)  
	        {  
	            if (leftSubTree + 1 == k)  
	            { 
	                System.out.print(root.data); 
	                System.out.println(""); 
	            } 
	            else {
	                printkdistanceNodeDown(root.right, k - leftSubTree - 2); 
	            }
	   	        return 1 + leftSubTree; 
	        } 
	        int rightSubTree = printkdistanceNode(root.right, node, k); 
	        if (rightSubTree != -1)  
	        { 
	            if (rightSubTree + 1 == k)  
	            { 
	                System.out.print(root.data); 
	                System.out.println(""); 
	            }  
	            else {
	                printkdistanceNodeDown(root.left, k - rightSubTree - 2); 
	            }
	            return 1 + rightSubTree; 
	        } 
	        return -1; 
	    } 

	private static void printkdistanceNodeDown(BinaryTreeNode<Integer> root, int k) 
	{
		if (root == null || k < 0) {
            return; 
		}
        if (k == 0)  
        { 
            System.out.print(root.data); 
            System.out.println(""); 
            return; 
        } 
        printkdistanceNodeDown(root.left, k - 1); 
        printkdistanceNodeDown(root.right, k - 1); 
	}
}
