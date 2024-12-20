package OperationOnDoublyLinkedList;

import DoublyLinkedList.Node;

public class ForwardAndBackwardTraversal {
	
	public static void forwardTraversal(Node head) {
		
		if(head == null) {
			System.out.print("Null");
		}
		
		while(head != null) {
			System.out.print(head.data+"->");
			 head = head.next;
		}
		System.out.print("null");
	}
	
	public static void backwardTraversal(Node third) {
		if(third == null) {
			System.out.print("Null");
		}
		
		while(third != null) {
			System.out.print(third.data+"->");
			third = third.prev;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		
		System.out.println("Forward Traversal");
		forwardTraversal(head);
		System.out.println("\nBackward Traversal");
		backwardTraversal(third);
	}
}
