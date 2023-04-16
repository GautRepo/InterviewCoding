package com.nt.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str ="Gautam";
		Set<Character> set = new LinkedHashSet<>();
		for(int i = 0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		set.forEach(a-> System.out.print(a));

	}

}
