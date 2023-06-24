package com.nt.test;

import java.util.Scanner;

public class xxvReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		String str= sc.nextLine();
		String[] ar = str.split(" ");
		String res="";
		for(String s : ar) {
			char[] ch = s.toCharArray();
			res = res+ reverseString(ch);
		}
		System.out.println(res);
		
		sc.close();
	}

	private static String reverseString(char[] ch) {
		
		int s=0,e=ch.length-1;
		
		while(s<e) {
			char a = ch[s];
			ch[s]=ch[e];
			ch[e]=a;
			s++;
			e--;
		}
		
		
		return new String(ch)+" ";
	}

}
