package OperationOnCircularLinkedList;

import Node.Node;

public class InsertAtTheEnd {
	
    public static void main(String[] args){
        
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;
        last.next = first;

        System.out.print("Original list: ");
        printList(last);


        last = insert(last, 5);
        last = insert(last, 6);

        System.out.print("List after inserting 5 and 6: ");
        printList(last);
    }
    
    public static Node insert(Node last,int data) {
    	Node newNode = new Node(data);
    	if(last == null) {
    		last = newNode;
    		newNode.next = newNode;
    	}
    	else {
    		newNode.next = last.next;
    		last.next = newNode;
    		last = newNode;
    	}
    	
    	return last;
    }
    
    public static void printList(Node last){
        if (last == null) return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data + "->");
            head = head.next;
            if (head == last.next) break;
        }
        System.out.print(last.next.data);
        System.out.println();
    }
}
