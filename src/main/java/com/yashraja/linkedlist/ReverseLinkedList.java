package com.yashraja.linkedlist;

public class ReverseLinkedList extends LinkedList {

	public Node reverseLL(Node node) {

		Node current = node;

		if (current == null || current.next == null) {
			return current;
		}

		Node prev = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.push(1);
		obj.push(2);
		obj.displayLL();
		Node rev = obj.reverseLL(obj.getHead());
		System.out.println("----------------");
		obj.displayLL(rev);
	}
}
