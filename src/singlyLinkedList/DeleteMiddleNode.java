package singlyLinkedList;

//class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}

class Create_SLL {
	int size;
	Node head = null;
	Node tail = null;

	public void Add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;

		} else {

			tail.next = newNode;
			tail = newNode;

		}
		size++;
	}

	void deleteFromMid() {
		Node temp, current;
		// Checks if the list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			// Store the mid position of the list
			int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			// Checks whether the head is equal to the tail or not, if yes then
			// the list has only one node.
			if (head != tail) {
				// Initially, temp will point to head
				temp = head;
				current = null;
				// Current will point to node previous to temp
				// If temp is pointing to node 2 then current will point to node
				// 1.
				for (int i = 0; i < count - 1; i++) {
					current = temp;
					temp = temp.next;
				}
				if (current != null) {
					// temp is the middle that needs to be removed.
					// So, current node will point to node next to temp by
					// skipping temp.
					current.next = temp.next;
					// Delete temp
					temp = null;
				}
				// If current points to NULL then, head and tail will point to
				// node next to temp.
				else {
					head = tail = temp.next;
					// Delete temp
					temp = null;
				}
			}
			// If the list contains only one element
			// then it will remove it and both head and tail will point to NULL
			else {
				head = tail = null;
			}
		}
		size--;
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

	public void Display() {
		// TODO Auto-generated method stub
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
	}
}

public class DeleteMiddleNode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_SLL sll = new Create_SLL();
		sll.Add(1);
		sll.Add(2);
		sll.Add(3);
		sll.Add(4);
		sll.Add(5);

		sll.Display();
		System.out.println("-------------------");
		while (sll.head != null) {
			// sll.DeleteMiddleNode();
			sll.deleteFromMid();
			sll.Display();
			System.out.println("-------------------");
		}
	}

}
