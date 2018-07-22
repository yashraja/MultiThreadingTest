package com.yashraja.linkedlist;

public class LinkedList {

	Node head = null;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void push(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}

	public void displayLL() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void displayLL(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
