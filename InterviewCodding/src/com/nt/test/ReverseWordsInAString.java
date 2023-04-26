package com.nt.test;

public class ReverseWordsInAString {
	
	public static void main(String[] args) {
		String str = "Welcome to world of java";
		String[] ar= str.split(" ");
		String s="";
		for(int i=ar.length-1 ;i>=0 ;i--) {
			s= s+ ar[i] +" " ;
		}
		System.out.println(s);
	}

}
