package OperationOnCircularLinkedList;

import Node.Node;

public class DeleteAtTheEnd {
	
	   public static void main(String[] args){
	       
	        Node first = new Node(2);
	        first.next = new Node(3);
	        first.next.next = new Node(4);

	        Node last = first.next.next;
	        last.next = first;

	        System.out.print("Original list: ");
	        printList(last);

	       
	        last = delete(last);

	        System.out.print("List after deleting last node: ");
	        printList(last);
	    }
	   
	   public static void printList(Node last){
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
	   
	   public static Node delete(Node last) {
		   
		   if(last == null) {
			   System.out.print("List is Empty");
			   return null;
		   }
		   
		   if(last == last.next) {
			   last = null;
			   return null;
		   }
		   
		   Node current = last.next;
		   Node prev = last;
		   
		   while(current != last) {
			   prev = current;
			   current = current.next;
		   }
		   
		   prev.next = last.next;
		   last = prev;
		   
		   return last;
	   }
}
