package com.nt.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// predicate is a Functional interface which contain test method with single arg and returns boolean value 
		
		Predicate<Integer> p = (i)->i>10;
		System.out.println(p.test(15));
		
		Predicate<String> p2 = (s)->s.length()>1;
		System.out.println(p2.test("H"));
		
		Predicate<Collection> p3 = (c)->c.isEmpty();
		ArrayList list = new ArrayList();
		list.add("hi");
		System.out.println(p3.test((Collection) list));
		

	}

}
