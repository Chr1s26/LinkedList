package OperationOnSinglyLinkedList;

import Node.Node;

public class InsertionAtSpecificPosition {
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		insert(node1,2,2);
	}
	
	public static void insert(Node head,int pos, int data) {
		
		Node current = head;
		Node node = new Node(data);
		int count = 1;
		if(pos < 1) {
			System.out.print("Invalid Position!!");
			return;
		}
		
		if(pos == 1) {
			node.next = head;
			head = node;
			Node.printNode(node);
			return;
		}
		
		while(count != pos - 1 && current != null) {
			current = current.next;
			count++;
		}
		
		if(current == null) {
			System.out.print("Invalid Position");
			return;
		}
		
		node.next = current.next;
		current.next = node;
		
		Node.printNode(head);
	}
}
