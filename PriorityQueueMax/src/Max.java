import java.util.ArrayList;
import java.util.Scanner;

public class Max {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		int choice = s.nextInt();
		while (choice != -1) {
			switch (choice) {
			case 1: // insert
				int element = s.nextInt();
				pq.insert(element);
				break;
			case 2: // getMax
				System.out.println(pq.getMax());
				break;
			case 3: // removeMax
				System.out.println(pq.removeMax());
				break;
			case 4: // size
				System.out.println(pq.getSize());
				break;
			case 5: // isEmpty
				System.out.println(pq.isEmpty());
			default:
				return;
			}
			choice = s.nextInt();
		}
	}
}

class PriorityQueue {
	private ArrayList<Integer> heap;

	public PriorityQueue() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		while (leftChildIndex < heap.size()) {
			if (heap.get(leftChildIndex) > heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if (minIndex == index) {
				break;
			} else {
				int temp2 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp2);
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}
}