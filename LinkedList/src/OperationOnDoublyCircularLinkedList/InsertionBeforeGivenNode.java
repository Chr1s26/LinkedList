package OperationOnDoublyCircularLinkedList;

import DoublyLinkedList.Node;

public class InsertionBeforeGivenNode {
	
    public static void printList(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
      
        // Linked List : 10<->20<->30
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
    	Node prev = head.prev;
    	
    	do {
    		
    		if(current.data == givenData) {
    			prev.next = newNode;
    			newNode.next = current;
    			newNode.prev = prev;
    			current.prev = newNode;
    			
    			if(current == head) {
    				head = newNode;
    			}
    		}
    		
    		prev = current;
    		current = current.next;
    		
    	}while(current != head);
    	
    	
    	return head;
    }
}
