package com.nt.test;

import java.util.Scanner;

public class xxixFactorialWithRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int a = sc.nextInt();
		
		System.out.println(getFact(a));

	}

	private static int getFact(int a) {
		
		if(a==0) {
			return 1;
		}
		
		return a*getFact(a-1);
	}

}
