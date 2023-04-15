package com.nt.test;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,5,4};
		int[] b = {2,3,1,4,6,7};
		
		Set<Integer> set = new HashSet<>();
		for(int c : a) {
			set.add(c);
		}
		
		for(int d : b) {
			if(set.contains(d))
				System.out.println(d);
		}

	}

}
