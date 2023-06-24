package com.nt.test;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class xxviiRemoveAllAdjacentArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		char[] ch = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		
		set.forEach(a -> System.out.print(a));
		

	}

}
