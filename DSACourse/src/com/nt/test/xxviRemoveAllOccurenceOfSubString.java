package com.nt.test;

import java.util.Scanner;

public class xxviRemoveAllOccurenceOfSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		String str=sc.nextLine();//daabcbaabcbc  //abc
		
		while(str.length() !=0 && str.contains("abc")) {
			str= str.replace("abc", "");
		}
		System.out.println(str);
		sc.close();

	}

}
