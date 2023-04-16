package com.nt.test;

import java.util.HashMap;
import java.util.Map;

public class WordCountVowelCountUpperCaseCharCount {

	public static void main(String[] args) {
		String str = "Welcome To Java Programing";
		int wordCount=1;
		int vowelCount=0;
		int upperCaseCount=0;
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				wordCount++;
			
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				vowelCount++;
			if(str.charAt(i)>=60 && str.charAt(i)<=90)
				upperCaseCount++;
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		System.out.println(wordCount);
		System.out.println(vowelCount);
		System.out.println(upperCaseCount);
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("k="+entry.getKey()+",v="+entry.getValue());
		}
		
		
		

	}

}
