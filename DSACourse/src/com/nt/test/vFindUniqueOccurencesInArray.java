package com.nt.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class vFindUniqueOccurencesInArray {

	public static void main(String[] args) {
		
		//int ar[] = {-3,0,1,-3,1,1,1,-3,10,0};
		int ar[] = {1,2};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a : ar) {
			map.put(a, map.getOrDefault(a, 0) +1);
		}
		
		Set<Integer> set = new HashSet<>();
		boolean flag =true;
		for(int a : map.values()) {
			if(set.contains(a)) {
				flag=false;
				break;
			}else
				set.add(a);
		}

		System.out.println(flag);
	}

}
