package com.nt.test;

import java.util.HashMap;
import java.util.Map;

public class WordAndCharCount {

	public static void main(String[] args) {
		String str = "Hello World";
		String[] ar = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String a : ar) {
			map.put(a, a.length());
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +"->"+entry.getValue());
		}

	}

}
