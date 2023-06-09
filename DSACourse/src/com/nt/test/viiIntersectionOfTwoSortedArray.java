package com.nt.test;

import java.util.HashSet;
import java.util.Set;

public class viiIntersectionOfTwoSortedArray {
	public static void main(String[] args) {
		
		int a1[] = {1, 2, 2, 2, 3, 4};
		int a2[] = {2,2, 3,3};
		int i=0,j=0;
		Set<Integer> list = new HashSet<>();
		while(i<a1.length && j<a2.length) {
			
			if(a1[i] == a2[j]) {
				list.add(a1[i]);
				i++;
				j++;
			}else if(a1[i] < a2[j]) {
				i++;
			}else
				j++;
			
		}
		for(int a : list) {
			System.out.print(a +" ");
		}
	}
	

}
