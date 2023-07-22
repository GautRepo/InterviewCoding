package com.nt.linkedList;

public class LLTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtHead(list, 1);
		list.insertAtHead(list, 2);
		list.insertAtHead(list, 3);
		list.insertAtHead(list, 4);
		
		list.printLinkedList();
		System.out.println();
		list.insertAtTail(list, 5);
		list.insertAtTail(list, 6);
		list.printLinkedList();
		System.out.println();
		list.insertAtMiddle(list, 2, 7);
		
		list.printLinkedList();
		
		list.deleteAtIndex(list, 4);
		System.out.println();
		list.printLinkedList();
	}

}
