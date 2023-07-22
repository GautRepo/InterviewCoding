package com.nt.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		/*
		 * Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		 * 
		 * */
		
		list.stream().filter(a-> a%2==0).forEach(a -> System.out.println(a));
		
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		list.stream().map(a-> a+"").filter(a -> a.startsWith("1")).forEach(a-> System.out.println(a));
		
		//How to find duplicate elements in a given integers list in java using Stream functions?
		
		Set<Integer> set = new HashSet<>();
		
		list.stream().filter(a -> !set.add(a)).forEach(a -> System.out.println(a));
		
		//Given the list of integers, find the first element of the list using Stream functions?
		
		list.stream().findFirst().ifPresent(a-> System.out.println(a));
		
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		long count =list.stream().count();
		System.out.println(count);
		
		//Given a list of integers, find the maximum value element present in it using Stream functions?
		
		int max =list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		
		//Given a String, find the first non-repeated character in it using Stream functions?
		
		String input = "Java articles are Awesome";
		
		Character result =input.chars()
			.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream()
			.filter(entry -> entry.getValue()==1)
			.map(entry -> entry.getKey()).
			findFirst().get();
		
		System.out.println(result);
		
		//Given a String, find the first repeated character in it using Stream functions?
		
		input.chars()
			.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()))
			.entrySet().stream()
			.filter(entry -> entry.getValue()>1)
			.map(entry -> entry.getKey())
			.findFirst().get();
		
		//Given a list of integers, sort all the values present in it using Stream functions?
		
		list.stream().sorted().forEach(a -> System.out.println(a));
		
		//Given a list of integers, sort all the values present in it in descending order using Stream functions?
		
		list.stream().sorted((i,j)-> -i.compareTo(j)).forEach(a-> System.out.println(a));
		
		//given an integer array nums, return true if any value appears at 
		//least twice in the array, and return false if every element is distinct
		
		Integer[] nums = {1,2,3,1};
		Set<Integer> setnum = new HashSet<>();
		
		Stream.of(nums).filter(a -> !setnum.add(a)).forEach(a -> System.out.println(a));
		
		//Java 8 program to perform cube on list elements and filter numbers greater than 500.
		
		list.stream().map(i-> i*i*i).filter(a -> a>500).forEach(a -> System.out.println(a));
		
		//How to count each element/word from the String ArrayList in Java8?
		
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		
		names.stream().
		collect(Collectors.groupingBy(Function.identity(), HashMap :: new , Collectors.counting()))
		.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.map(entry -> entry.getKey())
		.forEach(a -> System.out.println(a));
		
		
		System.out.println();
		
		//Write a program to print the count of each character in a String? 
		String s = "string data to count each character";
		
		Map<String,Long> map =Arrays.stream(s.split(""))
		.map(a -> a.toLowerCase())
		.collect(Collectors.groupingBy(a->a,HashMap::new ,Collectors.counting()));
		
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		

	}

}
