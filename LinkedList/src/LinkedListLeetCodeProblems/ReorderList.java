package LinkedListLeetCodeProblems;

import Node.Node;

public class ReorderList {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		Node result = reorderList(node1);
		Node.printNode(result);
	}
	
	public static Node reorderList(Node head) {
		
		if(head == null || head.next == null) {
			System.out.print("List is null");
			return null;
		}
		
		Node current = head;
		int count = 0;
		Node temp = head;
		
		Node firsthalf = new Node(0);
		Node dummy1 = firsthalf;
		
		Node secondhalf = new Node(0);
		Node dummy2 = secondhalf;
		
		Node answer = new Node(0);
		Node result = answer;
		int tempCount = 0;
		
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		int mid = count / 2;
		tempCount = count - mid;
		
		for(int i = 1; i <= mid; i++ ) {
			firsthalf.next = temp;
			firsthalf = firsthalf.next;
			temp = temp.next;
		}
		
		firsthalf.next = null;
		
		secondhalf.next = temp;

		while(tempCount >= 1) {
			
			for(int j = 1; j < tempCount; j++) {
				
				dummy2 = dummy2.next;
				
			}
			
			if(dummy1.next != null) {
				dummy1 = dummy1.next;
				answer.next = new Node(dummy1.data);
				answer = answer.next;
			}
			
			answer.next = new Node(dummy2.next.data);
			answer = answer.next;
			
			
			dummy2 = secondhalf;
			
			tempCount--;
		
		}
		
		return result.next;
	}
}
