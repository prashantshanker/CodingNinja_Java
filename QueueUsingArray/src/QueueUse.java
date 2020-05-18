
public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		QueueUsingArray queue= new QueueUsingArray();
		int arr[]= {10,20,30,40};
		for(int elem: arr) 
		{
			queue.enqueue(elem);
		}
		while(!queue.isEmpty()) 
		{
			System.out.print(queue.dequeue()+" ");
		}
	}

}
