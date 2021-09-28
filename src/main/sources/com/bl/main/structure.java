package com.bl.main;

import com.bl.linkedlist.LinkedList;

public class structure {
	 public static void main(String[] args) {
		    LinkedList llist = new LinkedList();

		    llist.insertAtEnd(70);
		    llist.insertMiddle(llist.head, 30);
		    llist.insertAtBeginning( 56);

		    System.out.println("Linked list: ");
		    llist.printList();

	}
}