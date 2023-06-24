package com.nt.test;

import java.util.Scanner;

public class xxivPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int s=0, e= ch.length-1;
		boolean flag = true;
		while(s<e) {
			if(ch[s] != ch[e]) {
				flag = false;
				break;
			}
			s++;e--;
		}
		System.out.println(flag);
		sc.close();
		
		

	}

}
