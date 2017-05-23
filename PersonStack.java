public class PersonStack {
	// properties
	private int top;
	private Person[] stack;
	private int size;

	// default constructor
	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person[50];
	}

	// constructor
	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[this.size];
	}

	// method to push
	public boolean push(Person item) {
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
	public Person pop() {
		return stack[top--];
	}

}

//person class


public class Person {
	private String name;
	private String rollno;

	// constructor
	public Person(String name, String rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return "name : " + this.name + "rollno : " + this.rollno;
	}

}

//main class


public class MainPerson {
	public static void main(String args[]) {

		Person person1 = new Person("sarika", "123");
		Person person2 = new Person("laddu", "345");

		PersonStack stack = new PersonStack();

		stack.push(person1);
		stack.push(person2);

		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
	}
}

