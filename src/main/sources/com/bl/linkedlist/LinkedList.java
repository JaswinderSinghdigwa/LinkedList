package com.bl.linkedlist;

public class LinkedList {
		  public Node head;
		  // Insert at the beginning
		  public void insertAtBeginning(int new_data) {
		    // insert the data
		    Node new_node = new Node(new_data);
		    new_node.next = head;
		    head = new_node;
		  }
		  public void insertMiddle(Node next_node ,int new_data) {
			  if(next_node == null) {
			      System.out.println("The given previous node cannot be null");
			      return;

			  }
			  Node temp = head;

			  int position = 2;
			for(int i=2; i < position ; i++) {
			    if(temp.next != null) {
			      temp = temp.next;
			    }
			  }
			  Node new_node = new Node(new_data);
			  new_node.next = temp.next;
			  temp.next = new_node;
		  }


		 //Insert after a node
		  public void insertAfter(Node prev_node, int new_data) {
		    if (prev_node == null) {
		      System.out.println("The given previous node cannot be null");
		      return;
		    }
		    Node new_node = new Node(new_data);
		    new_node.next = prev_node.next;
		    prev_node.next = new_node;
		  }

		  // Insert at the end
		  public void insertAtEnd(int new_data) {
		    Node new_node = new Node(new_data);

		    if (head == null) {
		      head = new Node(new_data);
		      return;
		    }

		    new_node.next = null;

		    Node last = head;
		    while (last.next != null)
		      last = last.next;

		    last.next = new_node;
		    return;
		  }

		  // Print the linked list
		  public void printList() {
		    Node tnode = head;
		    while (tnode != null) {
		      System.out.print(tnode.data + " ");
		      tnode = tnode.next;
		    }

		  }

}