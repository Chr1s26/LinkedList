package OperationOnCircularLinkedList;

import Node.Node;

public class InsertAtSpecificPosition {

	    public static void main(String[] args)
	    {
	        Node first = new Node(2);
	        first.next = new Node(3);
	        first.next.next = new Node(4);

	        Node last = first.next.next;
	        last.next = first;

	        System.out.print("Original list: ");
	        printList(last);

	        int data = 5, pos = 2;
	        last = insert(last, data, pos);
	        System.out.print("List after insertions: ");
	        printList(last);
	    }
	    
	    public static Node insert(Node last,int data,int pos) {
	    	Node newNode = new Node(data);
	    	
	    	int count = 0;
	    	
	    	Node current = last;
	    	
	    	while(count < pos - 1) {
	    		count++;
	    		current = current.next;
	    	}
	    	
	    	if(current != null) {
	    		
	    		newNode.next = current.next;
	    		current.next = newNode;
	    	}
	    	
	    	System.out.print("Invalid Position");

	    	
	    	return last;
	    }
	    
	    public static void printList(Node last){
	        if (last == null)
	            return;

	        Node head = last.next;
	        while (true) {
	            System.out.print(head.data + "->");
	            head = head.next;
	            if (head == last.next) break;
	        }
	        System.out.println(last.next.data);
	    }
}
