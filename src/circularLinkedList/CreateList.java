package circularLinkedList;

public class CreateList {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Linked list is :");
			do {
				System.out.print(current.data);
				System.out.println(" " + current.next);
				current = current.next;
			} while (current != head);
			System.out.println("");
		}
	}

	public void countNode() {
		// TODO Auto-generated method stub
		int count = 0;
		Node current = head;
		do {
			count++;
			current = current.next;
		} while (current != head);
		System.out.println("Number of nodes are:" + count);

	}

	public void deleteNodeAtStart() {

	}
}
