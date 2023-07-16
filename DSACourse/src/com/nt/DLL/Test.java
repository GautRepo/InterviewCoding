package com.nt.DLL;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToHead(list, 1);
		list.addToHead(list, 2);
		list.addToHead(list, 3);
		
		list.insertAtTail(list, 4);
		
		list.insertAtPosition(list, 5, 1);
		list.printList(list);
		System.out.println();
		list.deleteNode(list, 3);
		list.printList(list);

	}

}
