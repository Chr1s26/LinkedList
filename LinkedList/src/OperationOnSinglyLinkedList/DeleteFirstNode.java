package OperationOnSinglyLinkedList;

import Node.Node;

public class DeleteFirstNode {
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		delete(node1);
	}
	
	public static void delete(Node head) {
		
		if(head == null) {
			System.out.print("Head is Null");
		}
		
		Node temp = head;
		head = head.next;
		
		Node.printNode(head);
	}
}
