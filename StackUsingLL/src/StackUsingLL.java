
public class StackUsingLL<T> 
{
	private Node<T> head;
	private int size;
	public StackUsingLL() 
	{
		head=null;
		size=0;
	}
	
	public int size() 
	{
		return size;
	}
	public boolean isEmpty() 
	{
		return head==null;
	}
	public void push(T elem) 
	{
		Node<T> newNode = new Node<T>(elem);
		newNode.next=head;
		head=newNode;
		size++;
	}
	public T pop() throws StackEmptyException{
	    
        if(head==null){
            throw new StackEmptyException();
        }
        T data=head.data;
        head=head.next;
        size--;
        return data;
	}
	
	public T top() throws StackEmptyException{
        
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;
	}
}
class StackEmptyException extends Exception{
    StackEmptyException(){
        super();
    }
}
