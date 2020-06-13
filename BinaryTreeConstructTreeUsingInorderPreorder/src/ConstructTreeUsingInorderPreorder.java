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

public class ConstructTreeUsingInorderPreorder {
	static Scanner s = new Scanner(System.in);

	public static void printLevelWiseAtDiffLine(BinaryTreeNode<Integer> root){
		if(root == null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<BinaryTreeNode<Integer>>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<BinaryTreeNode<Integer>>();

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
		BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(pre, in);
		printLevelWiseAtDiffLine(root);
		
	}
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in)
	{
		if(pre.length==0 && in.length==0) 
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[0]);
		int leftCount=0;
		for(int i=0;i<in.length;i++) 
		{
			if(pre[0]==in[i]) 
			{
				break;
			}
			leftCount++;
		}
		int preOrderLeft[] = new int[leftCount];
		int preOrderRight[] =new int[pre.length-leftCount-1];
		for(int i=1;i<pre.length;i++) 
		{
			if(i<=leftCount) 
			{
				preOrderLeft[i-1]=pre[i];
			}else 
			{
				preOrderRight[i-preOrderLeft.length-1]=pre[i];
			}
		}
		int inOrderLeft[] = new int[leftCount];
		int inOrderRight[] =new int[in.length-leftCount-1];
		for(int i=0;i<in.length;i++) 
		{
			if(i<leftCount) 
			{
				inOrderLeft[i]=in[i];
			}else if(i>leftCount)
			{
				inOrderRight[i-inOrderLeft.length-1]=in[i];
			}
		}
		root.left=getTreeFromPreorderAndInorder(preOrderLeft, inOrderLeft);
		root.right=getTreeFromPreorderAndInorder(preOrderRight, inOrderRight);
		return root;		
	}
}
