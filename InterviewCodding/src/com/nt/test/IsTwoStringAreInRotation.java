package com.nt.test;

import java.util.Scanner;

public class IsTwoStringAreInRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2= sc.next();
		
		String s3= s+s;
		
		if(s3.contains(s2) && s.length()==s2.length()) {
			System.out.println("yes");
			
		}else
			System.out.println("no");

	}

}
