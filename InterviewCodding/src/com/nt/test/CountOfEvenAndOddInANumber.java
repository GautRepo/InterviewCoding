package com.nt.test;

public class CountOfEvenAndOddInANumber {

	public static void main(String[] args) {
		Integer a = 1234567;
		int temp =a;
		int oddCount =0;
		int evenCount=0;
		while(temp>0) {
			if((temp%10)%2 ==0) {
				evenCount++;
			}else
				oddCount++;
			
			temp = temp/10;
			
		}
		System.out.println("even "+evenCount +" odd "+oddCount);

	}

}
