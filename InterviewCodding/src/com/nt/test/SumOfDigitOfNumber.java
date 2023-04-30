package com.nt.test;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		
		int a =98576;
		int temp=a;
		int sum =0;
		while(temp>0) {
			sum = sum + temp%10;
			temp =temp/10;
		}
		System.out.println(sum);

	}

}
