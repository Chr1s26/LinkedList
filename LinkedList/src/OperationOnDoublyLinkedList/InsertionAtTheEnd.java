package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtTheEnd {
	
	public static void insert(Node head, int data) {
		
		Node node = new Node(data);
		Node current = head;
		
		if(current == null) {
			head = node;
			Node.printNode(current);
			return;
		}
		
		while(current.next != null && current != null) {
			current = current.next;
		}
		
		current.next = node;
		node.prev = current;
		
		Node.printNode(head);
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		
		insert(head,4);

	}
}
