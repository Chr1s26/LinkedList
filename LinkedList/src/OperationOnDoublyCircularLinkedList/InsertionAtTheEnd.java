package OperationOnDoublyCircularLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtTheEnd {

	static void printList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
		System.out.println();
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.prev = head;
		head.next.next = new Node(30);
		head.next.next.prev = head.next;
		head.next.next.next = head;
		head.prev = head.next.next;

		head = insert(head, 5);
		printList(head);
	}

	public static Node insert(Node head, int data) {

		Node newNode = new Node(data);

		if (head == null) {

			newNode.next = newNode.prev = newNode;
			head = newNode;
			
		} else {
			
			Node last = head.prev;
			
			newNode.next = head;
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
	
		}

		return head;
	}
}
