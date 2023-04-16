package com.nt.test;

public class TwoStack {
	static Integer[] ar = new Integer[5];
	static int top=-1;
	static int top2=5;

	public static void main(String[] args) {
		
		
		push1(10);
		push1(12);
		push2(15);
		push2(17);
		push2(20);
		pop1(top);
		pop2(top2);
				

	}

	private static void pop2(int top2) {
		if(top2<5) {
			System.out.println(ar[top2]);
			top2++;
		}else
			System.out.println("stack over flow");
		
	}

	private static void pop1(int top) {
		if(top>0) {
			System.out.println(ar[top]);
			top--;
		}else
			System.out.println("stack overflow");
		
	}

	private static void push1(int i) {
		top++;
		if(top<top2) {
			ar[top]=i;
			top++;
		}else {
			System.out.println("stack over flow");
		}
		
	}
	private static void push2(int i) {
		top2--;
		if(top>top2) {
			ar[top2]=i;
			top2--;
		}else {
			System.out.println("stack over flow");
		}
		
	}

}
