package com.nt.test;

import java.util.Scanner;

public class xxxiiClimbingStaris {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a = sc.nextInt();
		
		int res = waysToClimb(a);
		System.out.println(res);

	}

	private static int waysToClimb(int a) {
		if(a==0) {
			return 1;
		}
		if(a<0) {
			return 0;
		}
		return waysToClimb(a-1)+waysToClimb(a-2);
	}

}
