package singlyLinkedList;

public class SLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSLL csll = new CreateSLL();

		// **********************************
		// add elements to the list
		csll.add(2);
		csll.add(4);
		// csll.add(6);
		csll.add(4);
		csll.add(1);

		// **********************************
		// Display the list
		csll.display();

		// ***********************************
		// Insert node at the Middle
		csll.InserNodeAtMiddle(10);
		csll.display();
		// ***********************************
		// Insert node at the end
		// csll.InsertNodeAtEnd(3);
		// csll.display();

		// **********************************
		// csll.InserNodeAtStart(19);
		// csll.display();

		// **************************************
		// Find min and max number in list
		// csll.FindMinMaxNumberInList();

		// ************************************
		// List palindrome
		// csll.CheckPalindrome();

		// **********************************
		// Count total no of the nodes available in linked list
		// csll.countNode();

		// **********************************
		// Display the list reverse way
		// csll.reverse(csll.head);

		// **********************************
		// Delete the first node from the list until list is completely empty
		// while (csll.head != null) {
		// csll.deleteFirstNode();
		// }
		// csll.ReverseListIterativeWay();
		// csll.display();

		// CreateSLL csll = null;
		// for (int i = 0; i < 5; i++) {
		// System.out.println("\n\nTest Case: " + i);
		// csll = new CreateSLL();
		// for (int j = 0; j < i; j++) {
		// csll.add(j);
		// }
		// csll.display("Before: ");
		// // csll.head = csll.ReverseListRecursiveWay(csll.head);
		// // csll.ReverseListIterativeWay();
		//
		// csll.display("After: ");
		// }
	}

}
