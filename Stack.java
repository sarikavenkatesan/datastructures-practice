public class Stack {
	// properties
	private int top;
	private int[] stack;
	private int size;

	// default constructor
	public Stack() {
		top = -1;
		size = 50;
		stack = new int[50];
	}

	// constructor
	public Stack(int size) {
		top = -1;
		this.size = size;
		stack = new int[50];
	}

	// method to push
	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	// method to check stack is full
	public boolean isFull() {
		return (top == stack.length - 1);
	}

	// method to check stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// method to pop
	public int pop() {
		return stack[top--];
	}

}


//main class

public class MainStack {
 public static void main(String args[]) {
	 Stack stackProgram = new Stack();
		
		stackProgram.push(1);
		stackProgram.push(2);
		System.out.println(stackProgram.pop());
		System.out.println(stackProgram.pop());
 }
}
