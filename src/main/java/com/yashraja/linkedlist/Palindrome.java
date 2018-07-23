package com.yashraja.linkedlist;

public class Palindrome extends LinkedList {

	public void isPalindrome(Node head) {

		int count = 0;
		Node current = head;
		Node middle = head;

		while (current != null) {
			if (count != 0 && count % 2 == 0) {
				middle = middle.next;
			}
			count++;
			current = current.next;
		}

//		System.out.println("Middle Node is :" + middleNode);
//		System.out.println("Middle Node is :" + middle.next.data);

		boolean isPalindrome = false;
		if (count % 2 == 0) {
			isPalindrome = compareTwo(head, reverseLL(middle));
		} else {
			isPalindrome = compareTwo(head, reverseLL(middle.next));
		}
		if (isPalindrome) {
			System.out.println("Node is Palidrome");
		} else {
			System.out.println("Node is not a Palidrome");
		}

	}

	public Node reverseLL(Node head) {

		Node current = head;
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

	public boolean compareTwo(Node head, Node secondHalf) {
		boolean isPalindrome = true;
		while (secondHalf.next != null) {
			if (secondHalf.data != head.data) {
				isPalindrome = false;
			}
			secondHalf = secondHalf.next;
			head = head.next;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();

		obj.populateLL(4);
		obj.push(5);
		obj.push(6);
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(1);

//		obj.displayLL();
		System.out.println("----------------");
		obj.isPalindrome(obj.getHead());

	}
}
