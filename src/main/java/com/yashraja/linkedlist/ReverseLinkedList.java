package com.yashraja.linkedlist;

public class ReverseLinkedList extends LinkedList {

	public void reverseLL(Node node) {

		Node current = node;
		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		System.out.println("&&&&&&&&&&");
		displayLL(prev);
		System.out.println("&&&&&&&&&&");
	}
	
	public Node reverseInChunks(Node head, int k) {
		Node current = head;
		Node prev = null;
		Node next = null;
		int i = 1;
		while(current != null && i <= k) {
			i++;
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		if(next != null) {
			head.next = reverseInChunks(next, k);
		}
		
		return prev;
	}

	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.displayLL();
//		obj.reverseLL(obj.getHead());
		System.out.println("----------------");
		Node newNode = obj.reverseInChunks(obj.head, 3);
		obj.displayLL(newNode);
	}
}
