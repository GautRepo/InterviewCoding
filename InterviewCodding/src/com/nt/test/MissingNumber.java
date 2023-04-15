package com.nt.test;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] ar = {1,3,4,1,2,5,7};
		Set<Integer> set = new HashSet<>();
		for(int a :ar) {
			set.add(a);
		}
		
		for(int i=0;i<ar.length;i++) {
			if(!set.contains(i))
				System.out.println(i);
		}

	}

}
