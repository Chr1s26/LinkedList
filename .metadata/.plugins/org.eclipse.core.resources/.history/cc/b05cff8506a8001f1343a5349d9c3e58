package DoublyLinkedList;

public class Node {
	
	public int data;
	public Node prev;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		prev = next = null;
	}
	
	public static void printNode(Node head) {
		
		if(head == null) {
			System.out.print("null");
			return;
		}
		
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		
		System.out.print("null");
	}
	
	public static void printPrevNode(Node last) {
		
		if(last == null) {
			System.out.print("null");
			return;
		}
		
		while(last != null) {
			System.out.print(last.data+"->");
			last = last.prev;
		}
		
		System.out.print("null");
	}
}
