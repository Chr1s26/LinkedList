package OperationOnSinglyLinkedList;

import Node.Node;

public class InsertionAtTheEnd {
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		insert(node1,5);
	}
	
	public static void insert(Node head,int data) {
		
		Node current = head;
		Node node = new Node(data);
		
		if(current == null) {
			Node.printNode(node);
			return;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
		
		Node.printNode(head);
	}
}
