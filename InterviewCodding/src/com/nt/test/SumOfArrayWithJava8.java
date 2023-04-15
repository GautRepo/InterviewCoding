package com.nt.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfArrayWithJava8 {

	public static void main(String[] args) {
		
		int[] ar = {2,3,5,7,4};
		int sum1 = Arrays.stream(ar).sum();
		System.out.println(sum1);
		
		int sum2= IntStream.of(ar).sum();
		System.out.println(sum2);
		
		int sum3= Arrays.stream(ar).reduce((x,y)-> x+y).getAsInt();
		System.out.println(sum3);
		
		int sum4 = Arrays.stream(ar).reduce(Integer::sum).getAsInt();
		System.out.println(sum4);
		
		long sum5 = Arrays.stream(ar).summaryStatistics().getSum();
		System.out.println(sum5);

	}

}
