package com.nt.CLL;

public class CircularLinkedList {
	
	Node head;
	
	public void insert(CircularLinkedList list,int element, int data) {
		
		Node newNode = new Node(data);
		
		if(list.head == null) {
			list.head=newNode;
			list.head.next=newNode;
		}else {
			Node temp =list.head;
			
			while(temp.data == element) {
				temp=temp.next;
			}
			newNode.next=list.head;
			temp.next=newNode;
			list.head=newNode;
			
		}
		
	}

}
