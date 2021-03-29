package singlyLinkedList;

public class DeleteNodeFromLast_SLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSLL cl = new CreateSLL();
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.display();
		while (cl.head != null) {
			cl.DeleteNodeFromLast();
		}

	}

}
