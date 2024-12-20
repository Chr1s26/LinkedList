package LinkedListLeetCodeProblems;

import Node.Node;

public class RemoveNthNodeFromEndOfList {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		Node updataedNode = removeNthNodeFromEndOfList(node1,2);
		Node.printNode(updataedNode);
	}
	
	public static Node removeNthNodeFromEndOfList(Node head, int n) {
		
		if(n < 1 || head == null) {
			System.out.print("Position out of range");
			return null;
		}
		
		Node current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
			current = head;
			
		if(count-n == 0) {
			current = current.next;
			head = current;
			return head;
			}
			
		for(int i = 1; i < count-n; i++) {
			current = current.next;
		}
		
		current.next = current.next.next;
		
		return head;
	}
}
