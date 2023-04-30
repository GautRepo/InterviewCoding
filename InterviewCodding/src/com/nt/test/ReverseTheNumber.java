package com.nt.test;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int a =2726;
		int r=0;
		
		while(a>0) {
			r =r*10 + (a%10);
			a= a/10;
		}
		System.out.println(r);

	}

}
