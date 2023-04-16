package com.nt.test;

import java.util.Stack;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		String st = "Hello World";
		Stack<Character> stack = new Stack<>();
		
		for(int i =0;i<st.length();i++) {
			if(st.charAt(i) != ' ') {
				stack.push(st.charAt(i));
			}else {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(" ");
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		

	}

}
