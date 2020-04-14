package algorithms;

public class StackImpl {
	
	private int[] integer_stack;
	private int top;
	private int capacity;
	
	public StackImpl(int size) {
		integer_stack = new int[size];
		top = -1;
		capacity = size;
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public int size() {
		return (top+1);
	}
	
	public void push(int i) {
		integer_stack[++top] = i;
	}
	
	public int pop() {
		if(!isEmpty()) {
			return integer_stack[top--];
		}
		return 0;
	}
	public boolean isFull() {
		return(top == capacity-1);
	}
	
	public static void main(String[] args) {
		StackImpl stack = new StackImpl(10);
		System.out.println(stack.pop());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.isEmpty());
		
		
	}

	
}
