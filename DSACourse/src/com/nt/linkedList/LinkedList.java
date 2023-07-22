package com.nt.linkedList;

public class LinkedList {

	Node head;

	public void insertAtHead(LinkedList list, int data) {

		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;

	}
	
	public void printLinkedList() {
		Node temp = head;
		
		while(temp.next != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		System.out.println(temp.data);
	}
	
	public void insertAtTail(LinkedList list ,int data) {
		Node newNode = new Node(data);
		if(list.head == null) {
			list.head=newNode;
		}else {
			Node temp = list.head;
			while(temp.next != null) {
				temp= temp.next;
			}
			temp.next=newNode;
			
			
		}
		
	}
	
	public void insertAtMiddle(LinkedList list,int index,int data) {
		
		Node newNode = new Node(data);
		Node temp = list.head;
		int count =1;
		while(count <= index-1) {
			temp = temp.next;
			count++;
		}
		newNode.next= temp.next;
		temp.next=newNode;
		
		
	}
	
	public void deleteAtIndex(LinkedList list , int index) {
		
		Node temp = list.head;
		int count =1;
		while(count < index) {
			temp= temp.next;
			count++;
		}
		
		Node n = temp.next;
		
		temp.next=n.next;
		
	}
	
	public void reverseLinkedList(LinkedList list) {
		Node temp = list.head;
		
		while(temp.next != null) {
			Node n = temp.next;
			temp.next
			
			temp=temp.next;
		}
	}

}












