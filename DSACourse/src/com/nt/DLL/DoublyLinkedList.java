package com.nt.DLL;

public class DoublyLinkedList {

	Node head;

	public void addToHead(DoublyLinkedList list, int data) {

		Node temp = new Node(data);
		if (list.head == null) {
			list.head = temp;
		} else {
			temp.next = list.head;
			list.head.pre = temp;
			list.head = temp;
		}

	}

	public void printList(DoublyLinkedList list) {
		Node temp = list.head;
		while (temp.next != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}

		System.out.print(temp.data + "-->");
	}
	
	public void insertAtTail(DoublyLinkedList list, int data) {
		
		Node newNode = new Node(data);
		
		if(list.head == null) {
			list.head=newNode;
		}else {
			Node temp =list.head;
			while(temp.next != null) {
				temp=temp.next;
			}
			
			temp.next=newNode;
			newNode.pre=temp;
			
		}
		
		
	}
	
	public void insertAtPosition(DoublyLinkedList list , int data,int index) {
		Node newNode = new Node(data);
		Node temp = list.head;
		if(index==1) {
			addToHead(list,data);
			return;
		}
		
		int count=1;
		
		while(count<index-1) {
			temp=temp.next;
			count++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		newNode.pre=temp;
		
	}
	
	
	public void deleteNode(DoublyLinkedList list,int index) {
		
		Node temp = list.head;
		int count =1;
		
		while(count < index-1) {
			temp=temp.next;
			count++;
		}
		
		Node n = temp.next;
		temp.next =n.next;
		temp.next.pre=temp;
		
	}

}














