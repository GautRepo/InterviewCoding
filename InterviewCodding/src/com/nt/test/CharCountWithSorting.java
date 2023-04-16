package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCountWithSorting {
	
	public static void main(String[] args) {
		String name = "banana";
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			if(map.containsKey(name.charAt(i))) {
				map.put(name.charAt(i), map.get(name.charAt(i))+1);
			}else
				map.put(name.charAt(i), 1);
		}
		
		Set<Entry<Character,Integer>> set = map.entrySet();
		
		List<Entry<Character,Integer>> list = new ArrayList<>(set);
		
		Collections.sort(list, new Comparator<Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return -o1.getValue().compareTo(o2.getValue());
			}
		});
		
		list.forEach(a -> System.out.println(a.getKey() +"=" +a.getValue()));
		
	}

}
