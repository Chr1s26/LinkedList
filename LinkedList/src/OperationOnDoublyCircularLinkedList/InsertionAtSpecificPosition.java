package OperationOnDoublyCircularLinkedList;

import DoublyLinkedList.Node;

public class InsertionAtSpecificPosition {
	
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

        head = insert(head, 4, 5);
        printList(head);
        
    }
    
    public static Node insert(Node head,int pos,int newData) {
    	
    	Node newNode = new Node(newData);
    	
    	if(head == null) {
    		if(pos > 1) {
    			return null;
    		}
            newNode.prev = newNode;
            newNode.next = newNode;
            
            return newNode;  
    	}
    	
    	Node current = head;
    	Node last = head.prev;
    	int count = 1;
    	
    	if(pos == 1) {
    		newNode.next = head;
    		newNode.prev = last;
    		last.next = newNode;
    		head.prev = newNode;
    		head = newNode;
    		
    		return head;
    	}
    	
    	while(count < pos-1) {
    		count++;
    		current = current.next;
    		if(current == head) {
    			System.out.print("Position out of range!");
    			return head;
    		}
    	}
    		newNode.next = current.next;
    		if (current.next != null) {
                current.next.prev = newNode;
            }
    		current.next = newNode;
    		newNode.prev = current;

    	
    	return head;
    }
}
