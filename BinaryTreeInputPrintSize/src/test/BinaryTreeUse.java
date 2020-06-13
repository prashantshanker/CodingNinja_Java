package test;

import java.util.Scanner;

public class BinaryTreeUse {

	static int count=0;
	public static void printTree1(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printTree1(root.left);
		printTree1(root.right);
//		if(root.left!=null) 
//		{
//			printTree1(root.left);
//		}
//		if(root.right!=null) 
//		{
//			printTree1(root.right);
//		}
	}

	public static void main(String[] agrs) {
		BinaryTreeNode<Integer> root=takeTreeInput(true,0,true);
		printDetailTree(root);
		System.out.println(count);
	}

	private static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isleft) 
	{
		if(isRoot) 
		{
			System.out.println("Enter root data");
		}else 
		{
			if(isleft) 
			{
				System.out.println("Enter Left Child of" + parentData);
			}else 
			{
				System.out.println("Enter Right Child of" + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData==-1) 
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild= takeTreeInput(false, rootData, true);
		BinaryTreeNode<Integer> rightChild= takeTreeInput(false, rootData, false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}

	private static void printDetailTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		count++;
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data);
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printDetailTree(root.left);
		printDetailTree(root.right);
	}

}
