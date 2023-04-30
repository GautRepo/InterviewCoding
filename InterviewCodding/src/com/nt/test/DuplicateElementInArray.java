package com.nt.test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		Integer[] ar = {1,2,1,3,1,3,4,2,5,5,4,2,1,6,5};
		Set<Integer> set = new HashSet<>();
		
		Stream.of(ar).forEach(a-> {
			if(!set.contains(a)) {
				set.add(a);
			}else
				System.out.println(a);
		});

	}

}
