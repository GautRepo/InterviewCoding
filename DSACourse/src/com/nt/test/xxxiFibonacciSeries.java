package com.nt.test;

import java.util.Scanner;

public class xxxiFibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value ");

		int num =sc.nextInt();
		
		System.out.println(febonacciNum(num));
		
		
	}

	private static int febonacciNum(int num) {
		
		if(num==0) 
			return 0;
		if(num==1) {
			return 1;
		}
			
		return 	febonacciNum(num-1) +febonacciNum(num-2) ;
	}
}
