package com.nt.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
	// Consumer is FI which has one abstract method accept 
		//void accept(T val)
		// one default method andThen
		
		Consumer<Integer> f= (s)-> System.out.println(s+2);
		Consumer<? super Integer> f2= s->System.out.println("Hi "+s+" ");
		f.accept(10);
		
		Consumer<Integer> f3 = f.andThen(f2).andThen(f);
		f3.accept(10);
		
		BiConsumer<String,String> bi= (a,b)->System.out.println(a+b);
		bi.accept("Hi ", "Gautam");
		

	}

}
