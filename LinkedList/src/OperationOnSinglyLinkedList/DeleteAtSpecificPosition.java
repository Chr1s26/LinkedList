package OperationOnSinglyLinkedList;

import Node.Node;

public class DeleteAtSpecificPosition {
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		delete(node1,1);
	}
	
	public static void delete(Node head,int pos) {
		int count = 1;
		Node current = head;
		
		if(pos == 1) {
			Node temp = head;
			head = head.next;
			temp = null;
			Node.printNode(head);
			return;
		}
		
		if(pos < 1 || head == null) {
			System.out.print("Invalid Position");
			return;
		}
		
		while(count != pos-1 && current != null) {
			count ++;
			current = current.next;
		}
		
		if(current == null || current.next == null) {
			System.out.print("Position is out of range !!");
			return;
		}
		
		current.next = current.next.next;
		
		Node.printNode(head);
	}
}
