package OperationOnCircularLinkedList;

import Node.Node;

public class DeleteSpecificNode {
	
    public static void printList(Node last) {
        if (last == null) return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data + "->");
            head = head.next;
            if (head == last.next) break;
        }
        System.out.println(last.next.data);
    }
    
    public static void main(String[] args){
        
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;
        last.next = first;

        System.out.print("Original list: ");
        printList(last);
        int key = 4;
        last = delete(last, key);

        System.out.print("List after deleting node " + key
                         + ": ");
        printList(last);
    }
    
    public static Node delete(Node last,int key) {
    	
    	if(last == null) {
    		System.out.print("List is empty");
    		return null;
    	}
    	
    	Node current = last.next;
    	
    	if(current == last && current.data == key) {
    		last = null;
    		return last;
    	}
    	
    	if(current.data == key) {
    		last.next = current.next;
    		return last;
    	}
    	
    	while(current.next != last.next) {
    		if(current.next.data == key) {
    			current.next = current.next.next;
    			if(current == last) {
    				last = current;
    			}
    			return last;
    		}
    		current =current.next;
    	}
    	System.out.print("Key not found");
    	
    	return last;
    }
}
