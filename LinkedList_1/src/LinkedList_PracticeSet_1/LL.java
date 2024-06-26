package LinkedList_PracticeSet_1;

public class LL {

	Node head;
	
	class Node{
		String data;
		Node next;                                                                                                                       
		
		public Node(String data) {
			this.data = data;
			this.next  = null;
		}
	}
	
	// Add ---- first, last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add - last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode= head;
		while(currNode!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//print LIst
	public void printList() {
		if(head == null) {
			System.out.println("List is empty....");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		LL list = new LL();
		list.addFirst("chirag");
		list.addFirst("is");
		list.addFirst("This");
		list.printList();
		
	}
}
