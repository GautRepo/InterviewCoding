package com.nt.test;

public class NameSorting {

	public static void main(String[] args) {
		String[] name= {"Orange","Banana","Apple","Grapes"};
		
		for(int i=0;i<name.length;i++) {
			
			for(int j=i+1;j<name.length;j++) {
				if(name[i].compareTo(name[j])>0) {
					String temp= name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(String n : name) {
			System.out.println(n);
		}
		

	}

}
