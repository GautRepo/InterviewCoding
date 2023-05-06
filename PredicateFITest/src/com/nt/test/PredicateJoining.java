package com.nt.test;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		// there is three default method in predicate negate,or,and
		// predicate also contain one static method isEqual
				
		Predicate<Integer> p1 = (i)->i>5;
		Predicate<Integer> p2=(i)->i%2==0;
		Predicate<String> p4 = Predicate.isEqual("Gautam");
		
		System.out.println(p1.negate().test(10));
		System.out.println(p1.or(p2).test(7));
		System.out.println(p1.and(p2).test(4));
		System.out.println(p4.test("Kumar"));
		
		Predicate<String> p3 = (s)->s.charAt(0)=='G';
		System.out.println(p3.test("Gautam"));
	}

}
