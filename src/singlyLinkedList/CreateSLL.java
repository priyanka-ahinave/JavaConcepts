package singlyLinkedList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}

}

public class CreateSLL {
	Node head = null;
	Node tail = null;
	int size = 0;

	public void add(int i) {

		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			tail = newNode;
			// tail.next = null;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void display() {
		display("");
	}

	public void display(String prefix) {
		Node current = head;
		System.out.print(prefix);
		if (current == null) {
			System.out.println("List is empty");
		} else {
			do {
				System.out.print(" " + current.data);
				// System.out.println(current.next);
				// System.out.println(current.next.next);
				current = current.next;
			} while (current != null);
			System.out.println();
		}

	}

	public void countNode() {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("List is empty");
		} else {
			int count = 0;
			Node current = head;
			do {
				count++;
				current = current.next;
			} while (current != null);
			System.out.println("Number of nodes are:" + count);
		}
	}
	// OR DO LIKE BELLOW

	// public int countNode() {
	// // TODO Auto-generated method stub
	// int count = 0;
	// Node current = head;
	// while (current != null) {
	// count++;
	// current = current.next;
	// }
	// return count;
	//
	// }

	// Display the list reverse way
	public void reverse(Node current) {
		// Checks if list is empty
		if (current == null) {
			System.out.println("List is empty");
			return;
		}
		// Recursively calls the reverse function
		reverse(current.next);
		System.out.print(current.data + " ");
	}

	// Delete the first node of the list
	public void deleteFirstNode() {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("List is empty");
		} else if (head == tail) {
			head = tail = null;
			System.out.println("Node is deleted");
		} else {
			head = head.next;
			System.out.print("Node is deleted successfully.Updated list is :");
		}
		display("");

	}

	public void DeleteNodeFromLast() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head == tail) {
			System.out.println("List contains only one element.. deleting " + head.data);
			head = null;
			return;

		}
		while (current.next != tail) {
			current = current.next;
		}
		System.out.println("deleting " + current.next.data);
		current.next = null;
		tail = current;
	}

	public void ReverseListIterativeWay() {

		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}

		head = prev;
	}

	public void ReverseListRecursiveWayOld(Node current) {
		if (current == null || current.next == null)
			return;

		ReverseListRecursiveWay(current.next);
		current.next.next = current.next;
		current.next = null;
	}

	public Node ReverseListRecursiveWay(Node current) {
		// System.out.println("visiting node " + current.data);

		if (current == null || current.next == null) {
			// System.out.println("empty list");
			return current;
		}

		Node new_head = ReverseListRecursiveWay(current.next);
		// System.out.println("retracing " + current.data);

		current.next.next = current; // Mark next nodes next to current
		current.next = null;
		return new_head;
	}

	public void DeleteMiddleNode() {

		if (head == null) {
			System.out.println("list is empty");
		} else if (head == tail) {
			// List has only one node
			tail = head = null;
			System.out.println("List had one node and its deleted");
		} else {
			Node prev = null;
			Node temp = head;

			int middle = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			// System.out.println("middel is " + middle);
			for (int i = 1; i < middle; i++) {
				prev = temp;
				temp = temp.next;
			}

			prev.next = temp.next;
			temp = null;
			System.out.println("Node is deleted.Updated list is :");

		}
		size--;
	}

	public void CheckPalindrome() {
		Node current = head;
		boolean flag = true;

		int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

		for (int i = 1; i < mid; i++) {
			current = current.next;
		}

		Node revHead = ReverseListRecursiveWay(current); // reversing the half
		// list

		while (head != null && revHead != null) {
			if (head.data != revHead.data) {
				flag = false;
				break;
			}
			head = head.next;
			revHead = revHead.next;
		}

		if (flag) {
			System.out.println("List is palindrome");
		} else {
			System.out.println("List is not palindrome");
		}
	}

	public void FindMinMaxNumberInList() {
		Node current = head;

		int min = current.data;
		int max = current.data;

		while (current.next != null) {
			if (min > current.next.data) {
				min = current.next.data;
			}
			if (max < current.next.data) {
				max = current.next.data;
			}
			current = current.next;
		}

		System.out.println("Min :" + min);
		System.out.println("Max :" + max);
	}

	public void InserNodeAtStart(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void InsertNodeAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void InserNodeAtMiddle(int data) {

		Node current = head;
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			tail.next = null;
		}
		int mid = (size % 2) == 0 ? (size / 2) : ((size + 1) / 2);
		for (int i = 1; i < mid; i++) {
			current = current.next;
		}
		Node nextN = current.next;
		current.next = newNode;
		newNode.next = nextN;
	}

}
