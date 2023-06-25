package com.nt.test;

import java.util.Scanner;

public class xxxixAtoThePowerB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res =recursiveCall(a,b);
		System.out.println(res);

	}

	private static int recursiveCall(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		if(b==1) {
			return a;
		}
		
		int res = recursiveCall(a,b/2);
		
		if(b%2==0) {
			return res*res;
		}else
			return a* res* res;
		
		
	}

}
