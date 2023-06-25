package com.nt.test;

import java.util.Scanner;

public class xxxPowerOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value ");
		int num = sc.nextInt();
		System.out.println(getRes(num));
		

	}

	private static int getRes(int n) {
		
		if(n==0) {
			return 1;
		}
		
		return 2*getRes(n-1);
	}

}
