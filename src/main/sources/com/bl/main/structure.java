package com.bl.main;

import com.bl.linkedlist.LinkedList;

public class structure {
	 public static void main(String[] args) {
		    LinkedList llist = new LinkedList();

		    llist.insertAtBeginning(56);
		    llist.insertAfter(llist.head.next,30);
		    llist.insertAfter(llist.head.next,70);

		    System.out.println("Linked list: ");
		    llist.printList();

//		  ;
	}
}
