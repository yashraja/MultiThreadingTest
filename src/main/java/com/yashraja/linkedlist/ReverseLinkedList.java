package com.yashraja.linkedlist;

public class ReverseLinkedList extends LinkedList {

	public void reverseLL(Node node) {

		Node current = node;

		if (current == null || current.next == null) {
			displayLL(current);
			return ;
		}

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

	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.push(1);
		obj.push(2);
		obj.displayLL();
		obj.reverseLL(obj.getHead());
		System.out.println("----------------");
	}
}
