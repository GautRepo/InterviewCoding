package com.nt.test;

public class CountOfDigitsInANumber {

	public static void main(String[] args) {
		int a =123345698;
		int temp =a;
		int count=0; 
		while(temp>0) {
			count++;
			
			temp = temp/10;
		}
		System.out.println(count);

	}

}
