import java.util.ArrayList;

import java.util.Scanner;
import java.util.Stack;

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

public class PathSumRootToLeaf 
{
	static Scanner s = new Scanner(System.in);
	static int k;

		public static BinaryTreeNode<Integer> takeInput(){
			Queue<BinaryTreeNode<Integer>>  pendingNodes = new Queue<BinaryTreeNode<Integer>>(); // we can skip writing again inside <> after java version 1.7 
			Scanner s = new Scanner(System.in);
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
			k = s.nextInt();
			return root;
		}
		
		public static void main(String[] args) {
			BinaryTreeNode<Integer> root = takeInput();
			rootToLeafPathsSumToK(root,k);
		}

		static int sum=0;
		static Stack<Integer> stack=new Stack<Integer>();
		public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) 
		{
			
			if(root==null) 
			{
				return;
			}
			sum=sum+root.data;
			stack.push(root.data);
			if(sum==k && root.left==null && root.right==null) 
			{
				PrintStack(stack);
				System.out.println();
			}
			rootToLeafPathsSumToK(root.left, k);
			rootToLeafPathsSumToK(root.right, k);
			sum=sum-root.data;
			stack.pop();
		}

		public static void PrintStack(Stack<Integer> s)  
		{  
			Stack<Integer> s1 =new Stack<Integer>(); 
			s1.addAll(s);
			PrintStackNext(s1);
		}
		public static void PrintStackNext(Stack<Integer> s) 
		{
			if (s.isEmpty()) 
			{
		        return;  
			} 
		    int x = s.peek();  
		    s.pop();  
		    PrintStackNext(s);  
		    System.out.print(x + " ");  
		    s.push(x); 
		}  

}
