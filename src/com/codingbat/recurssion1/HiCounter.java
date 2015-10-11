package com.codingbat.recurssion1;

public class HiCounter {
	
	public static int countHi(String str) {
		  
		  int len=str.length();
		  if(str=="") return 0;
		  if(len==1) return 0;
		
		  
		  return countHi(str.substring(1))+((str.charAt(0)=='h' && str.charAt(1)=='i')?1:0);
		  
		}
	
	public static void main(String[] args) {
		System.out.println(countHi("ihihihihihi"));
	}

}
