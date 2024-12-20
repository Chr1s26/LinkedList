package OperationOnSinglyLinkedList;

import Node.Node;

public class Traversal {
	
	public static void traverseLinkedList(Node head) {
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data +"->");
			current = current.next;
		}
		
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		traverseLinkedList(node1);
	}
}
