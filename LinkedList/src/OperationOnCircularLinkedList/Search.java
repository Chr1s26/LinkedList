package OperationOnCircularLinkedList;

import Node.Node;

public class Search {

	public static void printList(Node last) {
		if (last == null)
			return;

		Node head = last.next;
		while (true) {
			System.out.print(head.data + " ");
			head = head.next;
			if (head == last.next)
				break;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Node first = new Node(2);
		first.next = new Node(3);
		first.next.next = new Node(4);

		Node last = first.next.next;
		last.next = first;

		System.out.print("Original list: ");
		printList(last);

		int key = 4;
		boolean found = search(last, key);
		if (found) {
			System.out.println("Value " + key + " found in the list.");
		} else {
			System.out.println("Value " + key + " not found in the list.");
		}
	}
	
	
	public static boolean search(Node last,int key) {
		
		boolean found = false;
		
		if(last == null) {
			return found;
		}
		
		if(last.next == last) {
			if(last.data == key) {
				found = true;
				return found;
			}
		}
		
		Node current = last.next;
		
		while(current != last) {
			if(current.data == key) {
				found = true;
			}
			current = current.next;
		}
		
		if(current.data == key) {
			found = true;
		}
		
		return found;
	}
}
