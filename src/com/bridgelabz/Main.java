package com.bridgelabz;
public class Main 
{
	public static void main(String[] args) 
	  {
		  linkList llist = new linkList();

	    llist.insertAtEnd(1);
	    llist.insertAtBeginning(2);
	    llist.insertAtBeginning(3);
	    llist.insertAtEnd(4);
	    llist.insertAfter(llist.head.next, 5);

	    System.out.println("Linked list: ");
	    llist.printList();

	    System.out.println("\nAfter deleting an element: ");
	    llist.deleteNode(4);
	    llist.printList();
	  }
}
