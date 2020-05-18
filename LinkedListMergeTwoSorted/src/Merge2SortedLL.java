import java.util.Scanner;

public class Merge2SortedLL 
{
static Scanner s = new Scanner(System.in);
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head3 = mergeTwoList(head1, head2);
		print(head3);
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

