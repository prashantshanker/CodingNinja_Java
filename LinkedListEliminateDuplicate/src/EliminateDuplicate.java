import java.util.Scanner;

public class EliminateDuplicate 
{
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(removeDuplicates(input()));
	}

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

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
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) 
	{
		 Node<Integer> temp=head;
	      while(temp.next!=null){
	        if(temp.data.equals((temp.next).data)){ //  
	          temp.next=temp.next.next;          
	        }else{
		      temp=temp.next;
	        }
	      }
	      return head;
	    }
	}

