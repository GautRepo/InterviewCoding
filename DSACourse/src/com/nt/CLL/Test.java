package com.nt.CLL;

public class Test {

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.insert(list, 5,3);
		list.insert(list, 3,5);
		list.insert(list, 5,6);

	}

}
