import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {
}


class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}


class QueueUsingLL<T> {


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

public class reeUsingInorderPostorder {
	static Scanner s = new Scanner(System.in);

	public static void printLevelWiseAtDiffLine(BinaryTreeNode<Integer> root){
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enqueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			try {
				current = primary.dequeue();
			} catch (QueueEmptyException e) {
				System.out.println("Not possible");
			}
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enqueue(current.left);
			}
			if(current.right != null){
				secondary.enqueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
		}
		public static void main(String[] args) {
			
			int size = s.nextInt();
			int[] pre = new int[size];
			for(int i = 0; i < size; i++){
				pre[i] = s.nextInt();
			}
			int in[] = new int[size];
			for(int i = 0; i < size; i++){
				in[i] = s.nextInt();
			}
			BinaryTreeNode<Integer> root = getTreeFromPostorderAndInorder(pre, in);
			printLevelWiseAtDiffLine(root);	
		}
		public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
				int[] in)
		{
			BinaryTreeNode<Integer> root=buildTreeFromPostInorder(post,in,0,post.length-1,0,in.length-1);
			return root;				
		}
		private static BinaryTreeNode<Integer> buildTreeFromPostInorder(int[] post, int[] in, int startIndexPost, int endIndexPost, int startIndexIn,
				int endIndexIn) {
			if(startIndexIn>endIndexIn) 
			{
				return null;
			}
			int rootData=post[endIndexPost];
			BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
			int i=startIndexIn;
			for(i=startIndexIn;i<endIndexIn;i++) 
			{
				if(in[i]==rootData) 
				{
					break;
				}
			}
			int siInLeft=startIndexIn;
			int eiInLeft=i-1;	
			int siInRight=i+1;
			int eiInRight=endIndexIn;

			int siPostLeft=startIndexPost;
			int eiPostRight=endIndexPost-1;
			int leftLength=eiInLeft-siInLeft+1;
			int eiPostLeft=siPostLeft+leftLength-1;
			int siPostRight=eiPostLeft+1;
			
						
			BinaryTreeNode<Integer> left= buildTreeFromPostInorder(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
			BinaryTreeNode<Integer> right=buildTreeFromPostInorder(post, in, siPostRight, eiPostRight, siInRight, eiInRight);
			root.left=left;
			root.right=right;
			return root;
		}
}
