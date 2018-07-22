package com.yashraja.linkedlist;

public class LinkedList {
	
	Node head = null;
	
	private void push(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node current = head;
			while(current.next!= null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	
	private void displayLL() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		
		obj.displayLL();
	}
}
