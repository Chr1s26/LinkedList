package OperationOnSinglyLinkedList;

import Node.Node;

public class DeleteLastNode {
	
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
		
		Node current = head;
		
		if(head == null) {
			System.out.print("head is null");
			return;
		}
		
		if(head.next == null) {
			head = null;
			System.out.print("Null");
		}
		
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		
		Node.printNode(head);
	}
}
