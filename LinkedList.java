public class LinkedList {
	private Node head;
	private Node prevLink;

	// Constructor
	public LinkedList(int item) {
		head = new Node();
		head.value = item;
		head.link = null;
	}

	// Class for node
	public class Node {
		private int value;
		private Node link;
	}

	// Method to insert a node
	public boolean insertNode(int item) {
		if (head.link == null) {
			Node n = new Node();
			n.value = item;
			n.link = null;
			head.link = n;
			prevLink = n;
		} else {
			Node currNode = new Node();
			prevLink.link = currNode;
			currNode.value = item;
			currNode.link = null;
			prevLink = currNode;
		}

		return true;
	}

	// Method to delete a node
	public boolean deleteNode(int item) {
		if (head.value == item) {
			head = head.link;
			return true;
		} else {
			Node x = head.link;
			Node y = x.link;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}

			if (y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}
	}

	// Sorting all the elements in linked list using bubble sort (ascending
	// order)
	public void bubbleSortLinkedList() {
		int temp = 0;
		Node a = head;
		Node b = head;
		while (a.link != null) {
			while (b.link != null) {
				if (b.value > b.link.value) {
					temp = b.value;
					b.value = b.link.value;
					b.link.value = temp;
				}
				b = b.link;
			}
			a = a.link;
		}
	}

	// Print all the elements in linked list
	public void printLinkedList() {
		Node presentLink = head;
		while (presentLink != null) {
			System.out.println(presentLink.value);
			presentLink = presentLink.link;
		}
	}
}

//main class

public class Main {
	public static void main(String args[]) {
	try {
			LinkedList ll = new LinkedList(1);

			ll.insertNode(2);
			ll.insertNode(3);
			ll.insertNode(10);
			ll.insertNode(5);
			ll.insertNode(6);
			ll.insertNode(7);
			
			System.out.println("Before deleting..");
			ll.printLinkedList();
			
			ll.deleteNode(5); // Testing random node
			ll.deleteNode(7); // Testing edge case
			ll.deleteNode(1); // Testing edge case
			
			System.out.println("After sorting..");
			ll.bubbleSortLinkedList();
			ll.printLinkedList();
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
