
public class Queue {
	private int[] q;
	private int total;
	private int size;
	private int front;
	private int rear;

	// default constructor
	public Queue() {
		total = 0;
		size = 50;
		front = 0;
		rear = 0;
		q = new int[size];
	}

	// constructor with values
	public Queue(int size) {
		total = 0;
		this.size = size;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}

	// method to check queue is full
	public boolean isFull() {
		if (total == size) {
			return false;
		} else {
			return true;
		}
	}

	// method to enqueue

	public boolean enqueue(int value) {
		if (isFull()) {
			return false;
		} else {
			total++;
			q[rear] = value;
			rear = (rear + 1) % size;
			return true;
		}
	}

	// method to dequeue()
	public int dequeue() {
		int value = q[front];
		total--;
		front = (front + 1) % size;

		return value;
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.println("" + q[f]);
				f = (f + 1) % size;
			}

		}
	}
}

//main class

public class Main {
	public static void main(String args[]) {
	Queue q = new Queue();
	q.enqueue(1); 
	q.enqueue(4);
	
	q.showAll();
}
}
