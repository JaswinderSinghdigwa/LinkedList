package com.bl.main;

import com.bl.linkedlist.LinkedList;

public class structure {
	 public static void main(String[] args) {
		    LinkedList llist = new LinkedList();

		    llist.insertAtBeginning(56);
		    llist.insertAfter(llist.head.next,30);
		    llist.insertAtEnd(70);
		//    llist.deletefirst();
		  //  llist.deletelast(llist.head.next.next);
		    int item_to_find = 30;
		    if (llist.search(llist.head, item_to_find))
		      System.out.println(item_to_find + " is found");
		    else
		      System.out.println(item_to_find + " is not found");

		    System.out.println("Linked list: ");
		    llist.insertAfter(llist.head.next, 40);
		    llist.deletelast(llist.head.next.next);
		    llist.printList();

//		  ;
	}
}
