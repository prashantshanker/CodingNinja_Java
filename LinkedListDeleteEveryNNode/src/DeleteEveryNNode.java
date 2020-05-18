import java.util.Scanner;

public class DeleteEveryNNode {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(skipMdeleteN(input(), s.nextInt(), s.nextInt()));
	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}
	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) 
	{
		LinkedListNode<Integer> retain=null,temp=head,retainTail=null;
		if(N==0 && M==0) 
		{
			return null;
		}
		while (temp != null) {
			int l = M;
			int i = 0;
			while (i < l && temp != null) 
			{
				if(retain==null) 
				{
					retain=temp;
					retainTail=temp;
					temp=temp.next;
					i++;
				}else {
				retainTail.next = temp;
				retainTail=temp;
				temp=temp.next;
				i++;
				}
			}
			if (temp == null) {
				break;
			}
			int j = 0;
			int d = N;
			while (temp != null && j < d) {
				temp = temp.next;
				j++;
			}
			continue;
		}
		if(retainTail!=null) {
		retainTail.next=null;
		}
		return retain;
	}

}
