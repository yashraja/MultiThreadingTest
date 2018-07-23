package com.yashraja.linkedlist;

public class FindNthNodefromLast extends LinkedList{
	
	public void findNthdata(Node head, int numb) {
		Node current = head;
		int count = 0;
		
		Node nthNode = head;
		
		while(current != null) {
			count++;
			if(count > numb) {
				nthNode = nthNode.next;
			}
			current = current.next;
		}
		
		System.out.println("Nth Node from last data is : ");
		System.out.println(nthNode.data);
	}

	public static void main(String[] args) {
		FindNthNodefromLast obj = new FindNthNodefromLast();
		obj.populateLL(10);
		obj.displayLL();
		
		int numb = 4;
		obj.findNthdata(obj.getHead(),  numb);
	}
}
