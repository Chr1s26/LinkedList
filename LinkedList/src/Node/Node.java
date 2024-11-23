package Node;



public class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node() {
		
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static void printNode(Node node) {

		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print("null");
	}

	public static void printCircularNode(Node head) {

		Node current = head;
		Node temp = head;
		while (current.next != temp) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print(head.data);
	}
	
	public static void printLastCircularNode(Node last) {
		Node head = last.next;
		
		while(head.next != last.next) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print(head.data);
	}
}
