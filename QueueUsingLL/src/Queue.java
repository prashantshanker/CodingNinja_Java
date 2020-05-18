
public class Queue<T>
{
	private Node<T> front;
	private Node<T> rear;
	int size;
		public Queue() {
			front=null;
			rear=null;
			size=0;
		}

		public void enqueue(T data) {
			Node<T> newNode = new Node<T>(data);
			if(size==0) 
			{
				front=newNode;
				rear=newNode;
				size++;
			}else 
			{
				rear.next=newNode;
				rear=newNode;
				size++;
			}

		}

		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return size==0;
		}

		public T dequeue() throws QueueEmptyException {
			if(size==0) 
			{
				throw new QueueEmptyException();
			}
			T temp=front.data;
			front=front.next;
			if(front==null) 
			{
				rear=null;
			}
			size--;
			return temp;
		}

		public T front() throws QueueEmptyException {
			if(size==0) 
			{
				throw new QueueEmptyException();
			}
			return front.data;
		}

}
