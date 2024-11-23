package OperationOnDoublyCircularLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtTheBeginning {

	public static void printList(Node head) {
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

		Node node = new Node(data);

		if (head == null) {
			node.next = node;
			node.prev = node;
			head = node;

		} else {
			node.prev = head.prev;
			node.next = head;
			head.prev.next = node;
			head.prev = node;
			head = node;
		}
		return head;
	}
}
