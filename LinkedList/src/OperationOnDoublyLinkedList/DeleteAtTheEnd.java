package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class DeleteAtTheEnd {
	
	public static void delete(Node head) {
		
		if(head == null) {
			Node.printNode(head);
			return;
		}
		
		if(head.next == null) {
			System.out.print("null");
			return;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		if(current.prev != null) {
		current.prev.next = null;
		}
		
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
		
		delete(head);

	}
}
