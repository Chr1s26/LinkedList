package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class findLength {
	
	public static int length(Node third) {
		int count = 0;
		Node current = third;
		
		if(third == null) {
			return 0;
		}
		
		if(third.prev == null && third != null) {
			return 1;
		}
		
		while(current != null) {
			count++;
			current = current.prev;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		
		System.out.println("Find Length");
		System.out.print(length(third));
	}
}
