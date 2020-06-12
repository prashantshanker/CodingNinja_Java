import java.util.Scanner;
 class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
public class ConstructByArray {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; ++i) {
			arr[i] = sc.nextInt();
		}
		BinaryTreeNode<Integer> ans = SortedArrayToBST(arr);
		
		preOrder(ans);
	}
	
	private static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		BinaryTreeNode<Integer> root = buildTreeFromArray(arr,0,arr.length-1);
		return root;	
	}

	private static BinaryTreeNode<Integer> buildTreeFromArray(int[] arr, int arrStartIndex, int arrEndIndex) 
	{
		if(arrStartIndex>arrEndIndex) 
		{
			return null;
		}
		int mid=(arrEndIndex+arrStartIndex)/2;
		int rootData=arr[mid];
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		
		int siArrLeft=arrStartIndex;
		int eiArrLeft=mid-1;	
		int siArrRight=mid+1;
		int eiArrRight=arrEndIndex;
		
		root.left=buildTreeFromArray(arr, siArrLeft, eiArrLeft);
		root.right=buildTreeFromArray(arr, siArrRight, eiArrRight);
		return root;
	}
}
