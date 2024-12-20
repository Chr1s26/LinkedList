package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtTheBeginning {
	
	public static void insert(Node head,int data) {
		
		Node node = new Node(data);
		
		if(head == null) {
			Node.printNode(head);
			return;
		}
		
		node.next = head;
		head.prev = node;
		
		
		Node.printNode(node);
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		
		insert(head,0);

	}
}
