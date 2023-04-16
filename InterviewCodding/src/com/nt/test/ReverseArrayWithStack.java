package com.nt.test;

import java.util.Stack;

public class ReverseArrayWithStack {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<ar.length;i++) {
			stack.push(ar[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
