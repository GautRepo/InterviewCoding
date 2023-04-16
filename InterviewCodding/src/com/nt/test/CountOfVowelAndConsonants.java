package com.nt.test;

public class CountOfVowelAndConsonants {

	public static void main(String[] args) {
		String name ="Gautam";
		int vow=0;
		int cons= 0;
		for(int i=0;i<name.length();i++) {
			switch(name.charAt(i)){
			case 'a':
				vow++;
				break;
			case 'e':
				vow++;
				break;
			case 'i':
				vow++;
				break;
			case 'o':
				vow++;
				break;
			case 'u':
				vow++;
				break;
			default :
				cons++;
				break;
			}
			
			
		}
		System.out.println("vowel="+vow + "consonant=" +cons);

	}

}
