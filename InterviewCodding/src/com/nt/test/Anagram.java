package com.nt.test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "avaj";
		char[] ar = s1.toCharArray();
		char[] ar1 = s2.toCharArray();
		boolean flag = true;
		if (s1.length() != s2.length()) {
			flag = false;
		} else {
			Arrays.sort(ar);
			Arrays.sort(ar1);

			flag = Arrays.equals(ar, ar1);
		}
		System.out.println(flag);

	}

}
