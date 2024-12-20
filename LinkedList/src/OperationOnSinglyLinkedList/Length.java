package OperationOnSinglyLinkedList;

import Node.Node;

public class Length {
	
	public static int findLength(Node head) {
		
		Node current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.print(findLength(node1));
	}
}
