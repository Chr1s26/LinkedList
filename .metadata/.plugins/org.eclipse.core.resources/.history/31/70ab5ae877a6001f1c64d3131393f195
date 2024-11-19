package OperationOnSinglyLinkedList;

import Node.Node;

public class Search {
	
	public static boolean searchLinkedList(Node head, int target) {
		
		Node current = head;
		boolean isFound = false;
		
		while(current != null) {
			if(current.data == target) {
				isFound = true;
			}
			current = current.next;
		}
		
		return isFound;
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.print(searchLinkedList(node1,4));
	}
}
