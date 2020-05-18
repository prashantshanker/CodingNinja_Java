import java.util.Scanner;

public class Palindrome {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(isPalindrome_2(input()));
	}

	public static Node<Integer> input() {
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
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
	public static boolean isPalindrome_2(Node<Integer> head) 
    {
		Node<Integer> temp=head;
		int length =0;
		while(temp!=null) 
		{
			length++;
			temp=temp.next;
		}		
		int count=0;
		int leftSum=0;
		int rightSum=0;
		if(length%2!=0) 
		{
			while(head!=null) 
			{
				if(count>(length/2+1)) 
				{
					rightSum+=head.data;
				}else 
				{
					leftSum+=head.data;
				}
				count++;
				head=head.next;
			}

		}else 
		{
		while(head!=null) 
		{
			if(count<length/2) 
			{
				leftSum+=head.data;
			}else 
			{
				rightSum+=head.data;
			}
			count++;
			head=head.next;
		}
		}
		if(rightSum==leftSum) 
		{
			return true;
		}else 
		{
		return false;
		}
    }
}
