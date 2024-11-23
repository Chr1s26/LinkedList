package OperationOnDoublyCircularLinkedList;

import DoublyLinkedList.Node;

public class InsertionAfterGivenNode {
	
	static void printList(Node head) {
        if (head == null) return;
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

        head = insert(head, 5, 30);
        printList(head);
    }
    
    public static Node insert(Node head,int newData,int givenData) {
    	
    	Node newNode = new Node(newData);
    	
    	if(head == null) {
    		System.out.print("List is null");
    		return null;
    	}
    	
    	Node current = head;
    	
    	while(current.next != head) {
    		if(current.data == givenData) {
    			
    			newNode.next = current.next;
    			current.next.prev = newNode;
    			
    			current.next = newNode;
    			newNode.prev = current;
    			
    		}
    		current = current.next;
    	}
    	
    	if(current.data == givenData) {
    		current.next = newNode;
    		newNode.prev = current;
    		newNode.next = head;
    		head.prev = newNode;
    	}
    	
    	return head;
    }
}
