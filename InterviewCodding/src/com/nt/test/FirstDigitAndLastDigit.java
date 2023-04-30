package com.nt.test;

public class FirstDigitAndLastDigit {

	public static void main(String[] args) {
		int a=1076;
		int temp=a;
		
		while(temp>=10) {
			temp=temp/10;
		}
		
		System.out.println("first Digit "+ temp +" Last Digit " +a%10);

	}

}
