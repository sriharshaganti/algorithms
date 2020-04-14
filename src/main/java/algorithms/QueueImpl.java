package algorithms;

public class QueueImpl {
	
	private int integer_queue[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	public QueueImpl(int size) {
		integer_queue = new int[size];
		front = 0;
		rear = -1;
		capacity = size;
		count = 0;
	}
	
	public boolean isEmpty() {
		return(count ==0);
	}
	
	public boolean isFull() {
		return(count == capacity);
	}
	
	public void enqueue(int i) {
		if(isFull()) {
			System.out.println("Queue if full");
		}
		rear = (rear+1)%capacity;
		integer_queue[rear] = i;
		count++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int item = integer_queue[front];
		front = (front+1)%capacity;
		count--;
		return item;
		
	}
	public static void main(String[] args) {
		QueueImpl queue = new QueueImpl(10);
System.out.println(queue.dequeue());
		
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
queue.enqueue(40);
queue.enqueue(50);
queue.enqueue(60);
queue.enqueue(70);
queue.enqueue(80);
queue.enqueue(90);
		
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	System.out.println(queue.isEmpty());
		
	}
}
