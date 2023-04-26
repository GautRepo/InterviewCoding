package com.nt.test;

import java.util.stream.Stream;

public class DeletingValueFromSpecificIndex {

	public static void main(String[] args) {
		
		int[] ar = {1,2,34,5,6};
		Integer ar1[] = new Integer[ar.length-1];
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(i!=2) {
				ar1[j++]=ar[i];
			}
		}
		
		Stream.of(ar1).forEach(a->System.out.println(a));

	}

}
