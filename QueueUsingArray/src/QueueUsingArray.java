
public class QueueUsingArray {
	private int data[];
	private int frontIndex;
	private int rearIndex;
	private int size;

	public QueueUsingArray() {
		data = new int[5];
		frontIndex = -1;
		rearIndex = -1;
		size = 0;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		frontIndex = -1;
		rearIndex = -1;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int elem) throws QueueFullException {
		if (size == data.length) {
		//	throw new QueueFullException();
			doubleCapacity();
		}
		if (size == 0) {
			frontIndex++;

		}
		rearIndex = (rearIndex + 1) % data.length;
		data[rearIndex] = elem;
		size++;
	}

	private void doubleCapacity() 
	{
		int temp[]=data;
		data=new int [2*temp.length];
		int index=0;
		for(int i=frontIndex;i<temp.length;i++) 
		{
			data[index++]=temp[i];
		}
		for(int i=0;i<frontIndex-1;i++) 
		{
			data[index++]=temp[i];
		}
		frontIndex=0;
		rearIndex=temp.length-1;
	}

	public int front() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return data[frontIndex];
	}

	public int dequeue() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		int temp = data[frontIndex];
		size--;
		frontIndex = (frontIndex + 1) % data.length;
		if (size == 0) {
			frontIndex = -1;
			rearIndex = -1;
		}
		return temp;
	}
}
