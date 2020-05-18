import java.util.Scanner;

public class MergeSort {
	private static Scanner s = new Scanner(System.in);

	public static Node<Integer> input() {
		int data = s.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
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

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		print(mergeSort(input()));

	}
	public static Node<Integer> mergeSort(Node<Integer> head) 
	{
		Node<Integer> leftSide = null,rightSide=null;
		if(head==null || head.next==null) 
		{
			return head;
		}
		rightSide=mergeSort(midpoint(head));
		leftSide=mergeSort(head);
		Node<Integer> mainHead=mergeTwoList(leftSide, rightSide);
		return mainHead;
	}
	public static Node<Integer> midpoint(Node<Integer> head)
	{
		Node<Integer> slow=head,fast=head;
		Node<Integer> nextList=null;
		while(fast.next!=null && fast.next.next!=null) 
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		nextList=slow.next;
		slow.next=null;
		return nextList;
	}
	public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) 
	{
		 Node<Integer> temp,header1,header2,head3;
	        header1=head1;
	        header2=head2;
		if(header1.data<=header2.data){
            head3=header1;
            temp=head1;
            head1=head1.next;
            temp.next=null;            
        }else{
            head3=header2;
            temp=head2;
            head2=head2.next;
            temp.next=null;
        }
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=head1;
                head1=head1.next;
                temp.next=null;
            }else{
                temp.next=head2;
                temp=head2;
                head2=head2.next;
                temp.next=null;
            }
        }
        if(head1!=null){
            temp.next=head1;
        }
        if(head2!=null){
            temp.next=head2;
        }
        return head3;    
	}
}

