package com.codingbat.recurssion1;

public class CountPair {
	
	public int countPairs(String str) {
		if(str=="") return 0;
		if(str.length()==1) return 0;
		if(str.length()==2) return 0;
		return ((str.charAt(0)==str.charAt(2))?1:0)+countPairs(str.substring(1));
		  
	}

	public static void main(String[] args) {

		System.out.println(new CountPair().countPairs("axax"));
	}

}
