package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class DeleteAtSpecificPosition {
	
	public static void delete(Node head,int pos) {
		
		if(pos < 1) {
			System.out.print("Invalid Position");
			return;
		}
		
		Node current = head;
		int count = 1;
		
		while(count < pos) {
			count++;
			current = current.next;
		}
		if(current == null) {
			System.out.print("Position is out of range");
		}
		
		if(current.prev != null) {
			
		current.prev.next = current.next;
		
		}
		Node.printNode(head);
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		Node fourth = new Node(3);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		third.next = fourth;
		fourth.prev = third;
		
		delete(head,4);

	}
}
