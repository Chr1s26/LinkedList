package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtSpecificPosition {
	
	public static void insert(Node head, int pos, int new_data) {
		int count = 1;
		Node newNode = new Node(new_data);
		Node current = head;
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}
		while(count < pos-1) {
			count++;
			current = current.next;
		}
		if(current == null) {
			System.out.print("Invalid Position");
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		newNode.prev = current;
		 
		
		Node.printNode(head);
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		Node fourth = new Node(5);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		third.next = fourth;
		fourth.prev = third;
		
		insert(head,3,3);

	}
}
