public class DoubleLinkedList {

	private Node head;
	private Node LastNode;

	// Constructor
	public DoubleLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.prev = head;
		head.next = null;
	}

	// Class for node
	public class Node {
		private int value;
		private Node prev;
		private Node next;

	}

	// Method to insert a node
	public boolean insertNode(int item) {
		if (head.next == null) {
			Node n = new Node();
			n.value = item;
			n.next = null;
			head.next = n;
			n.prev = head;
			LastNode = n;
		} else {
			Node newNode = new Node();
			newNode.value = item;
			newNode.prev = LastNode;
			newNode.next = null;
			LastNode.next = newNode;
			LastNode = newNode;
		}

		return true;
	}

	// Method to delete a node
	public boolean deleteNode(int item) {
		if (head.value == item) {
			head = head.next;
			return true;
		} else {
			Node x = head.next;
			Node y = x.next;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}

			if (y != null) {
				x.next = y.next;
				y.prev = x;
				return true;
			} else {
				return false;
			}
		}
	}

	// Print all the elements in linked list
	public void printDoublyLinkedList() {
		Node presentLink = head;
		while (presentLink != null) {
			System.out.println(presentLink.value);
			presentLink = presentLink.next;
		}
	}
}

//main class

public class Main {
	public static void main(String args[]) {
			try {
			DoubleLinkedList dll = new DoubleLinkedList(1);

			dll.insertNode(2);
			dll.insertNode(3);
			dll.insertNode(10);
			dll.insertNode(5);
			dll.insertNode(6);
			dll.insertNode(7);
			System.out.println("After inserting..");
			dll.printDoublyLinkedList();

			dll.deleteNode(5); // Testing random node
			dll.deleteNode(7); // Testing edge case
			dll.deleteNode(1); // Testing edge case

			System.out.println("After deleting..");
			dll.printDoublyLinkedList();
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
	}
}

