package com.nt.test;

import java.util.stream.Stream;

public class FebonacciSeries {

	public static void main(String[] args) {
		
		Integer[] ar = new Integer[10];
		ar[0]=0;
		ar[1]=1;
		
		for(int i=2;i<10;i++) {
			ar[i]=ar[i-1]+ar[i-2];
		}
		
		Stream.of(ar).forEach(a->System.out.println(a));

	}

}
