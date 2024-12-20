package LinkedListLeetCodeProblems;

import java.util.ArrayList;

import Node.Node;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		node1.next = node2;
		node2.next = node3;
		
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		node4.next = node5;
		node5.next = node6;
//		node6.next = node7;
		
		
		Node answer = addTwoNumber(node1,node4);
		Node.printNode(answer);
	}
	
	public static Node addTwoNumber(Node l1,Node l2) {
		
		Node temp1 = l1;
		Node temp2 = l2;
		int result = 0;
		int carry = 0;
		
		Node head = new Node(0);
		Node node = head;
		
		while(temp1 != null || temp2 != null) {
		
			int value1 = (temp1 != null) ? temp1.data : 0;
			int value2 = (temp2 != null) ? temp2.data : 0;
			
			result = value1 + value2 + carry;
			
			carry = result / 10;
			
			node.next = new Node(result % 10);
			node = node.next;
			
	        if (temp1 != null) temp1 = temp1.next;
	        if (temp2 != null) temp2 = temp2.next;
	        
		}
		
		if(carry > 0) {
		node.next = new Node(carry);}
		
		return head.next;
	}
	
}
