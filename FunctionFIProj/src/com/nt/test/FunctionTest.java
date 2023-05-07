package com.nt.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// It is one of the predefine FI which takes two input Function<T,R> T is input type and R is return type 
		// it has one abstract method apply 
		
		
		Function<String,Integer> f = (s)->s.length();
		System.out.println(f.apply("Gautam"));

		Function<String,String> f1 = (s)-> s.toUpperCase();
		Function<String,String> f2 = (s)->s.substring(0, 4);
		Function<Object, Object> f3= Function.identity(); 
		
		System.out.println(f1.andThen(f2).apply("Gautam"));
		System.out.println(f2.andThen(f1).apply("Gautam"));
		System.out.println(f1.compose(f2).apply("Djkgj"));
		System.out.println(f3.apply("String"));
		
		BiFunction<Integer,Integer,String> bi = (a,b)->
		{
			if((a+b) % 2==0) {
				return "yes";
			}else
				return "No";
		};
		
		System.out.println(bi.apply(10, 10));

	}

}
