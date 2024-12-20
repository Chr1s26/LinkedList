package OperationOnCircularLinkedList;

import Node.Node;

public class InsertAtEmptyList {
	
	public static void main(String[] args) {
		Node last = null;
	    last = insert(last, 1);
	 
	    System.out.print("List after insertion \n");
	    Node.printCircularNode(last);
	}
	
	public static Node insert(Node last, int data) {
		
		if(last != null) {
			return last;
		}
		
		Node node = new Node(data);
		node.next = node;
		
		last = node;
		
		return last;
	}
}
