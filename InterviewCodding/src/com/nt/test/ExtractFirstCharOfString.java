package com.nt.test;

public class ExtractFirstCharOfString {

	public static void main(String[] args) {
		String str= "Welcome to java coding";
		String[] ar = str.split(" ");
		for(String s : ar) {
			System.out.print(s.charAt(0));
		}

	}

}
