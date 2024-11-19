package Node;

public class Node {
	
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public static void printNode(Node node) {
		
		while(node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print("null");
	}
}
