package com.bl.main;

import com.bl.linkedlist.LinkedList;

public class structure {
	 public static void main(String[] args) {
		    LinkedList llist = new LinkedList();

		    llist.insertAtEnd(70);
		    llist.insertMiddle(llist.head, 70);
		    llist.insertAfter(llist.head.next, 2);

		    System.out.println("Linked list: ");
		    llist.printList();

//		    System.out.println("\nAfter deleting an element: ");
//		    llist.deleteNode(3);
//		    llist.printList();
//
//		    System.out.println();
//		    int item_to_find = 3;
//		    if (llist.search(llist.head, item_to_find))
//		      System.out.println(item_to_find + " is found");
//		    else
//		      System.out.println(item_to_find + " is not found");
//
//		    llist.sortLinkedList(llist.head);
//		    System.out.println("\nSorted List: ");
//		    llist.printList();
	}
}
